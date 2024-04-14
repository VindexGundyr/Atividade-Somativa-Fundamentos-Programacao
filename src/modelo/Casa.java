package modelo;

public class Casa extends Financiamento{
    public Casa(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaAnualDeJuros) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaAnualDeJuros);
    }

    public double calcularPagamentoMes(){
       return super.calcularPagamentoMes() + 80;
    }
}
