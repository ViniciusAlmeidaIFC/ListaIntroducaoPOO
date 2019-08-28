package Exercicio01;

public class NomeSobrenome {

	private String nome;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if (sobrenome.length() > 0)
			this.sobrenome = sobrenome;
	}

	public String juntar() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seu nome completo é ");
		builder.append(nome);
		builder.append(" ");
		builder.append(sobrenome);
		return builder.toString();
	}

	@Override
	public String toString() {
		return "NomeSobrenome [nome=" + nome + ", sobrenome=" + sobrenome + ", juntar()=" + juntar() + "]";
	}



}
