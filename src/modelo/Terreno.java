package modelo;
import java.io.Serializable;
public class Terreno extends Financiamento implements Serializable {
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
    @Override
    public String toString() {
        return "Valor do financiamento: TERRENO" + "\n" +
                "Valor do imóvel: R$ " + getValorDesejadoImovel() + "\n" +
                "Prazo do financiamento: " + getPrazoDoFinanciamento() + " anos\n" +
                "Taxa de juros: " + getTaxaAnualDeJuros() + "% ao ano\n" +
                "Tipo de terreno: " + getTipoDeZona();
    }

}
