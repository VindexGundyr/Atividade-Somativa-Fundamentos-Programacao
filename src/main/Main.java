package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Financiamento;
import modelo.Apartamento;
import modelo.Casa;
import modelo.Terreno;
import util.InterfaceUsuario;


public class Main {

    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> listaDeFinanciamentos = new ArrayList<>();

        //Imovel
        double valorCasa1 = interfaceUsuario.valorImovelDigitado();
        int prazoDoFinanciamento1 = interfaceUsuario.prazoDoFinanciamento();
        double taxaJuros1 = interfaceUsuario.taxaDeJuros();
        double areaConstruidaCasa1 = interfaceUsuario.areaConstruida();
        double areaTerrenoCasa1 = interfaceUsuario.areaTerreno();

        listaDeFinanciamentos.add(new Casa(valorCasa1, prazoDoFinanciamento1, taxaJuros1,areaConstruidaCasa1,areaTerrenoCasa1));


        Casa casa2 = new Casa(25000,24,0.05,1000,1000);
        listaDeFinanciamentos.add(casa2);
        // Apartamento
        Apartamento apartamento1 = new Apartamento(400000, 25, 0.1,5,69);
        listaDeFinanciamentos.add(apartamento1);
        Apartamento apartamento2 = new Apartamento(5000,65,0.2,4,25);
        listaDeFinanciamentos.add(apartamento2);
        //Terreno
        Terreno terreno1 = new Terreno(20000,28,0.5,"Comercial");
        listaDeFinanciamentos.add(terreno1);


        double valorTotalImoveis = 0;
        double valorTotalFinanciamentos = 0;
        int contador = 1;

        for (Financiamento financiamento : listaDeFinanciamentos) {
            System.out.println("FINANCIAMENTO " + contador + ":");
            financiamento.exibirDadosFinanciamento();
            valorTotalImoveis += financiamento.getValorDesejadoImovel();
            valorTotalFinanciamentos += financiamento.calcularPagamentoTotal();
            contador++;
        }


        System.out.println("O valor total de todos os imóveis é de: " + valorTotalImoveis);
        System.out.println("O valor total de todos os financiamentos é de : R$ " + valorTotalFinanciamentos);

        // Escrita
        FileWriter escritor = null;

        try {
            escritor = new FileWriter("financiamentos.txt");
            for (Financiamento financiamento : listaDeFinanciamentos) {
                escritor.write(financiamento.toString() + "\n");
                escritor.write("\n");
            }
            escritor.write("O valor total de todos os imóveis é de: " + valorTotalImoveis + "\n");
            escritor.write("O valor total de todos os financiamentos é de : R$ " + valorTotalFinanciamentos);
            escritor.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não foi encontrado.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leitura
        try (BufferedReader reader = new BufferedReader(new FileReader("financiamentos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Escrita
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream((new FileOutputStream("financiamento.test")));

            outputStream.writeObject(listaDeFinanciamentos);

            outputStream.flush();
            outputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }


        // Leitura

        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream((new FileInputStream("financiamento.test")));
            List<Financiamento> lista_nova = (ArrayList<Financiamento>) inputStream.readObject();

            for (Financiamento objeto : lista_nova) {
                if (objeto instanceof Casa) {
                    System.out.println((Casa) objeto);
                } else if (objeto instanceof Apartamento) {
                    System.out.println((Apartamento) objeto);
                } else if (objeto instanceof Terreno) {
                    System.out.println((Terreno) objeto);
                }
            }
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    }
