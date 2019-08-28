package Exercicio04;

public class SalarioMain {

	public static void main(String[] args) {

		Salario sal = new Salario();
		
		double valorHora = 5.20;
		int qtdHoras = 100;
		
		sal.setQtdHoras(qtdHoras);
		sal.setValorHora(valorHora);
		sal.salarioLiquido();
		System.out.println(sal);
		
		
	}

}
