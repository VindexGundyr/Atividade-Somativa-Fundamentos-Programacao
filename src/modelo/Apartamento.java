package modelo;

public class Apartamento extends Financiamento{
    public Apartamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaAnualDeJuros) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaAnualDeJuros);
    }

    @Override
    public double calcularPagamentoMes() {
        //TaxaMensal = taxaAnual /12
        double taxaMensal = this.taxaAnualDeJuros / 12;

        //Meses = PrazoFinanciamentoEmAnos*12
        int meses = this.prazoDoFinanciamento * 12;

        //ValorImovel*(1+TaxaMensal) meses / (1+TaxaMensal)meses-1
        double valorDaPrestacao = (this.valorDesejadoImovel * taxaMensal * Math.pow(1 + taxaMensal, meses)) / (Math.pow(1 + taxaMensal, meses) - 1);

        return valorDaPrestacao;
    }

}
