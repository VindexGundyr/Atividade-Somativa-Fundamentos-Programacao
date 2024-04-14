package modelo;

public class Terreno extends Financiamento {
    private String tipoDeZona;
    public Terreno(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaAnualDeJuros, String tipoDeZona) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaAnualDeJuros);
        this.tipoDeZona = tipoDeZona;
    }

    public String getTipoDeZona() {
        return tipoDeZona;
    }

    public String setTipoDeZona(String tipoDeZona) {
        this.tipoDeZona = tipoDeZona;
        return tipoDeZona;
    }

    public double calcularPagamentoMes(){
        return  (this.valorDesejadoImovel / (this.prazoDoFinanciamento * 12)) * (1 + (this.taxaAnualDeJuros / 12)) * 1.02;
    }
}
