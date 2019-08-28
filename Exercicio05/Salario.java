package Exercicio05;

public class Salario {

	private float valorHora = 0;
	private int qtdHoras = 0;
	private double salarioBruto = 0;

	public float getValorPHora() {
		return valorHora;
	}

	public void setValorPHora(float valorPHora) {
		if (valorPHora > 0)
			this.valorHora = valorPHora;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		if (qtdHoras > 0)
			this.qtdHoras = qtdHoras;
	}
	public double salarioBruto(){
		salarioBruto = valorHora * qtdHoras;
		return salarioBruto;
	}
	
	public double descontoInss() {
		return salarioBruto * 0.08;
	}
	
	public double descontoSindicato() {
		return salarioBruto *  0.05;
	}
	
	public double descontoImpostoRenda() {
		return salarioBruto * 0.11;
	}
	
	public double descontos() {
		double descontos = descontoInss() + descontoSindicato() + descontoImpostoRenda();
		return descontos;
	}

	public double salarioLiquido() {
		return salarioBruto - descontos();
	}

	@Override
	public String toString() {
		return "Salario [valorHora=" + valorHora + ", qtdHoras=" + qtdHoras
				+ ", salarioBruto()=" + salarioBruto() + ", descontoInss()=" + descontoInss() + ", descontoSindicato()="
				+ descontoSindicato() + ", descontoImpostoRenda()=" + descontoImpostoRenda() + ", descontos()="
				+ descontos() + ", salarioLiquido()=" + salarioLiquido() + "]";
	}

	
}

