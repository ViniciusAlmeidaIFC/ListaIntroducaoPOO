package Exercicio04;

public class Salario {

	private double valorHora = 0;
	private int qtdHoras = 0;
	private double salarioBruto = 0;

	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorPHora) {
		this.valorHora = valorPHora;
	}
	public int getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	public double salarioBruto(){
		salarioBruto = valorHora * qtdHoras;
		return salarioBruto;
	}
	public double inss() {
		return salarioBruto * 0.08;
	}
	public double sindicato() {
		return salarioBruto *  0.05;
	}
	public double ir() {
		return salarioBruto * 0.11;
	}
	public double salarioLiquido() {
		return  salarioBruto - (inss() + sindicato() + ir());
		
	}
	@Override
	public String toString() {
		return "Salario [valorHora=" + valorHora + ", qtdHoras=" + qtdHoras + ", salarioBruto()=" + salarioBruto()
				+ ", inss()=" + inss() + ", sindicato()=" + sindicato() + ", ir()=" + ir() + ", salarioLiquido()="
				+ salarioLiquido() + "]";
	}
	
		
}
