package Exercicio08;

public class MainPessoa {

	public static void main(String[] args) {

		Pessoa pes = new Pessoa();
		String nome;
		int idade;
		double peso;
		double altura;
		
		nome = "Vinicius Almeida";
		idade = 18;
		peso = 72.5;
		altura = 1.80;
		
		pes.setNome(nome);
		pes.setIdade(idade);
		pes.setPeso(peso);
		pes.setAltura(altura);
		pes.emagrecer();
		pes.engordar();
		pes.envelhecer();
		
		System.out.println(pes);
		
	}

}
