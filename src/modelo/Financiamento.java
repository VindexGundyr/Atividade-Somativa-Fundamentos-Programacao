package modelo;


public  class Financiamento {
    protected double valorDesejadoImovel;
    protected int prazoDoFinanciamento;
    protected double taxaAnualDeJuros;

    public double getValorDesejadoImovel() {
        return valorDesejadoImovel;
    }

    public int getPrazoDoFinanciamento() {
        return prazoDoFinanciamento;
    }

    public double getTaxaAnualDeJuros() {
        return taxaAnualDeJuros;
    }

    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaAnualDeJuros) {
        this.valorDesejadoImovel = valorDesejadoImovel;
        this.prazoDoFinanciamento = prazoFinanciamentoAnos;
        this.taxaAnualDeJuros = taxaAnualDeJuros;

    }


    public double calcularPagamentoMes(){
        return (this.valorDesejadoImovel / (this.prazoDoFinanciamento * 12)) * (1 + (this.taxaAnualDeJuros / 12));
    }

    public double calcularPagamentoTotal(){
        return this.calcularPagamentoMes() * this.prazoDoFinanciamento * 12;
    }

    public void exibirDadosFinanciamento(){
        double valorTotalDoFinanciamento = calcularPagamentoTotal();
        System.out.println("Detalhes do financiamento:");
        System.out.println("Valor do imóvel desejado: R$ " + valorDesejadoImovel);
        System.out.println("Prazo do financiamento: " + prazoDoFinanciamento + " ano(s)");
        System.out.println("Taxa anual de juros: " + taxaAnualDeJuros + "%");
        System.out.println("Valor total do financiamento: R$ " + valorTotalDoFinanciamento);
    }

}


