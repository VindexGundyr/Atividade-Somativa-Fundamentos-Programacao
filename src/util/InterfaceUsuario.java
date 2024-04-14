package util;
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

    public double areaConstruida () {
        double areaConstruida;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Por favor, insira a área construída: ");
            areaConstruida = scanner.nextDouble();

            if(areaConstruida <= 0) {
                System.out.println("Valor inválido.");
            }
        } while (areaConstruida <= 0);

        System.out.println("A área construída é: " + areaConstruida);
        return areaConstruida;
    }

    public double areaTerreno () {
        double areaTerreno;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Por favor, insira a área do terreno: ");
            areaTerreno = scanner.nextDouble();

            if(areaTerreno <= 0) {
                System.out.println("Valor inválido.");
            }
        } while (areaTerreno <= 0);

        System.out.println("A área do terreno é: " + areaTerreno);
        return areaTerreno;
    }
}