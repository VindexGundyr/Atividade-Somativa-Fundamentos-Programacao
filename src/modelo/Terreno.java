package modelo;

public class Terreno extends Financiamento {
    public Terreno(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaAnualDeJuros) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaAnualDeJuros);
    }

    public double calcularPagamentoMes(){
        return super.calcularPagamentoMes() * 1.02;
    }
}
