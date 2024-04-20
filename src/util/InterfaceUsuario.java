package util;
import java.util.Scanner;



public class InterfaceUsuario {
    public double valorImovelDigitado () {
        Scanner scanner = new Scanner(System.in);
        double valorDigitadoImovel = 0;

            do {
                try {
                    System.out.println("Por favor, insira o valor do imóvel: ");
                    valorDigitadoImovel = scanner.nextDouble();

                    if (valorDigitadoImovel <= 0) {
                        System.out.println("O valor digitado é inválido.");

                    }
                } catch (Exception e) {
                    System.out.println("O valor digitado é inválido.");
                    scanner.next();
                }
            } while (valorDigitadoImovel <= 0);

        System.out.println("O valor do imovél desejado é: " + valorDigitadoImovel);
       // scanner.close();
        return valorDigitadoImovel;
    }

    public int prazoDoFinanciamento () {
        Scanner scanner = new Scanner(System.in);
        int prazoFinanciamentoDigitado = 0;

            do {
                try {
                    System.out.println("Por favor, insira o prazo desejado do financiamento (em anos) : ");
                    prazoFinanciamentoDigitado = scanner.nextInt();

                    if (prazoFinanciamentoDigitado <= 0) {
                        System.out.println("Prazo do financiamento inválido.");

                    }
                } catch(Exception e) {
                    System.out.println("O valor digitado é inválido.");
                    scanner.next();
                }
            } while (prazoFinanciamentoDigitado <= 0);


        System.out.println("O prazo desejado por você é o de : " + prazoFinanciamentoDigitado + " anos");
       // scanner.close();
        return prazoFinanciamentoDigitado;
    }

    public double taxaDeJuros() {
        Scanner scanner = new Scanner(System.in);
        double taxaDeJurosDigitada = 0;


        do {
                try {
                    System.out.println("Por favor, insira a taxa de juros desejada: ");
                    taxaDeJurosDigitada = scanner.nextDouble();
                    if (taxaDeJurosDigitada <= 0) {
                        System.out.println("Taxa de juros inválida.");
                    }
                } catch(Exception e) {
                    System.out.println("O valor digitado é inválido.");
                    scanner.next();
                }
            } while (taxaDeJurosDigitada <= 0);


        System.out.println("A taxa de juros digitada foi: " + taxaDeJurosDigitada + " %");
       // scanner.close();
        return  taxaDeJurosDigitada;
    }

    public double areaConstruida () {
        double areaConstruida = 0;
        Scanner scanner = new Scanner(System.in);

            do {
                try {
                System.out.println("Por favor, insira a área construída: ");
                areaConstruida = scanner.nextDouble();

                if (areaConstruida <= 0) {
                    System.out.println("Valor inválido.");
                }
            } catch (Exception e) {
                    System.out.println("O valor digitado é inválido.");
                    scanner.next();
                }
            }while (areaConstruida <= 0);


        System.out.println("A área construída é: " + areaConstruida);
        return areaConstruida;
    }

    public double areaTerreno () {
        double areaTerreno = 0;
        Scanner scanner = new Scanner(System.in);
            do {

                try {
                System.out.println("Por favor, insira a área do terreno: ");
                areaTerreno = scanner.nextDouble();

                if (areaTerreno <= 0) {
                    System.out.println("Valor inválido.");

                }} catch (Exception e) {
                    System.out.println("O valor digitado é inválido.");
                    scanner.next();
                }
            } while (areaTerreno <= 0);

        System.out.println("A área do terreno é: " + areaTerreno);
        return areaTerreno;
    }
}