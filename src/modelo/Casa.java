package modelo;

import util.AcrescimoMaiorDoQueJurosException;
import util.DescontoMaiorDoQueJurosException;

public class Casa extends Financiamento{

    private double areaConstruida;
    private double areaTerreno;
    public Casa(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaAnualDeJuros, double areaConstruida, double areaTerreno) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaAnualDeJuros);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public double getAreaTerreno(){
        return areaTerreno;
    }

    public double setAreaConstruida(double areaConstruida){
        this.areaConstruida = areaConstruida;
        return areaConstruida;
    }

    public double setAreaTerreno(double areaTerreno){
        this.areaTerreno = areaTerreno;
        return areaTerreno;
    }

    private void  metodoAcrescimoMaiorDoQueJuros(double valorJuros, double valorAcrescimo) throws AcrescimoMaiorDoQueJurosException {

        if (valorAcrescimo > valorJuros) {
            throw new AcrescimoMaiorDoQueJurosException("O valor do juros é maior do que o valor do acrescimo.");
        }
    }

    private void  metodoDescontoMaiorDoQueJuros(double valorJuros, double valorDesconto) throws DescontoMaiorDoQueJurosException {

        if (valorDesconto > valorJuros) {
            throw new DescontoMaiorDoQueJurosException("O valor do juros é maior do que o valor do desconto.");
        }
    }
    public double calcularPagamentoMes(){
        double valorJuros = 40;
        double valorAcrescimo = 80;
        double valorDesconto = 80;

        try {
            metodoDescontoMaiorDoQueJuros(valorJuros,valorDesconto);
        }catch(DescontoMaiorDoQueJurosException e){
            valorDesconto = valorJuros;
        }

        try {
            metodoAcrescimoMaiorDoQueJuros(valorJuros,valorAcrescimo);
        }catch(AcrescimoMaiorDoQueJurosException e ){

            valorAcrescimo = valorJuros;

        }

       return (this.valorDesejadoImovel / (this.prazoDoFinanciamento * 12)) * (1 + (this.taxaAnualDeJuros / 12)) + valorAcrescimo - valorDesconto;
    }
}
