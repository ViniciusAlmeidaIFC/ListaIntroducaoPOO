package Exercicio05;

public class SalarioMain {

	public static void main(String[] args) {

		
		Salario sal = new Salario();
		
		float valorHora = 5.20f;
		int qtdHoras = 100;
		
		sal.setQtdHoras(qtdHoras);
		sal.setValorPHora(valorHora);
		sal.descontoInss();
		sal.descontoSindicato();
		sal.descontoImpostoRenda();
		sal.descontos();
		sal.salarioLiquido();
		System.out.println(sal);
		
	}
}
