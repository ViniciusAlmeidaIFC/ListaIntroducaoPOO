package Exercicio03;

public class Calculadora {

	private double um = 0;
	private double dois = 0;
	
	public double getUm() {
		return um;
	}
	public void setUm(double um) {
		this.um = um;
	}
	public double getDois() {
		return dois;
	}
	public void setDois(double dois) {
		this.dois = dois;
	}
	
	public double operacaoAdicao() {
		return um + dois;
	}
	public double operacaoSubtracao() {
		return um - dois;
	}
	public double operacaoMultiplicacao() {
		return um * dois;
	}
	public double operacaoDivisao() {
		return um/dois;
	}
	@Override
	public String toString() {
		return "CalculadoraSimples [um=" + um + ", dois=" + dois + ", operacaoAdicao()=" + operacaoAdicao()
				+ ", operacaoSubtracao()=" + operacaoSubtracao() + ", operacaoMultiplicacao()="
				+ operacaoMultiplicacao() + ", operacaoDivisao()=" + operacaoDivisao() + "]";
	}
	
}
