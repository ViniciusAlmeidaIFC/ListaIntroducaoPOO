package Exercicio08;

public class Pessoa {

	private String nome;
	private int idade;
	private double peso;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0)
			this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0)
			this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public void envelhecer() {
		idade = idade + 1;
		if (idade <= 21)
			crescer();
	}

	public void engordar() {
		peso = peso + 1;
	}

	public void emagrecer() {
		peso = peso - 1;
	}

	private void crescer() {
			altura = altura + 0.05;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
	}

	

}
