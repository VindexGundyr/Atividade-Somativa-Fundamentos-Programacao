package modelo;
import java.io.Serializable;
public class Apartamento extends Financiamento implements Serializable {

    private double vagasGaragem;
    private double numeroAndar;
    public Apartamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaAnualDeJuros, double vagasGaragem, double numeroAndar) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaAnualDeJuros);
        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    public double getVagasGaragem() {
        return vagasGaragem;
    }

    public double getNumeroAndar() {
        return numeroAndar;
    }
    public double setVagasGaragem(double vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
        return vagasGaragem;
    }

    public double setNumeroAndar(double numeroAndar) {
        this.numeroAndar = numeroAndar;
        return numeroAndar;
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
    @Override
    public String toString() {
        return "Valor do financiamento: APARTAMENTO" + "\n" +
        "Valor do imóvel: R$ " + getValorDesejadoImovel() + "\n" +
                "Prazo do financiamento: " + getPrazoDoFinanciamento() + " anos\n" +
                "Taxa de juros: " + getTaxaAnualDeJuros() + "% ao ano\n" +
                "Vagas de garagem: " + getVagasGaragem() + "\n" +
                "Número do andar: " + getNumeroAndar();
    }
}
