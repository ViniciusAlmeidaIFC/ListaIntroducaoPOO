package Exercicio03;

public class CalculadoraMain {

	public static void main(String[] args) {

		Calculadora c = new Calculadora();
		
		
		int um = 10;
		int dois = 2;
		
		c.setUm(um);
		c.setDois(dois);
		c.operacaoAdicao();
		c.operacaoDivisao();
		c.operacaoMultiplicacao();
		c.operacaoSubtracao();
		System.out.println(c);
	}
}
