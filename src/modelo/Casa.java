package modelo;

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
    public double calcularPagamentoMes(){
       return (this.valorDesejadoImovel / (this.prazoDoFinanciamento * 12)) * (1 + (this.taxaAnualDeJuros / 12)) + 80;
    }
}
