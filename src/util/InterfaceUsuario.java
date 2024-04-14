package util;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class InterfaceUsuario {
    public double valorImovelDigitado () {
        Scanner scanner = new Scanner(System.in);
        double valorDigitadoImovel;

        do {
            System.out.println("Por favor, insira o valor do imóvel: ");
            valorDigitadoImovel = scanner.nextDouble();

            if (valorDigitadoImovel <= 0) {
                System.out.println("O valor digitado é inválido.");
            }

        }while (valorDigitadoImovel <= 0);

        System.out.println("O valor do imovél desejado é: " + valorDigitadoImovel);
       // scanner.close();
        return valorDigitadoImovel;
    }

    public int prazoDoFinanciamento () {
        Scanner scanner = new Scanner(System.in);
        int prazoFinanciamentoDigitado;

        do {
            System.out.println("Por favor, insira o prazo desejado do financiamento (em anos) : ");
            prazoFinanciamentoDigitado = scanner.nextInt();

            if (prazoFinanciamentoDigitado <= 0 ) {
                System.out.println("Prazo do financiamento inválido.");
            }
        } while(prazoFinanciamentoDigitado <= 0);

        System.out.println("O prazo desejado por você é o de : " + prazoFinanciamentoDigitado + " anos");
       // scanner.close();
        return prazoFinanciamentoDigitado;
    }

    public double taxaDeJuros() {
        Scanner scanner = new Scanner(System.in);
        double taxaDeJurosDigitada;

        do {
            System.out.println("Por favor, insira a taxa de juros desejada: ");
            taxaDeJurosDigitada = scanner.nextDouble();
            if(taxaDeJurosDigitada <= 0) {
                System.out.println("Taxa de juros inválida.");
            }
        } while (taxaDeJurosDigitada <= 0);
        System.out.println("A taxa de juros digitada foi: " + taxaDeJurosDigitada + " %");
       // scanner.close();
        return  taxaDeJurosDigitada;
    }
}