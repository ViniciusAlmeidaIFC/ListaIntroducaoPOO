package Exercicio01;


public class MainNomeSobrenome {

	public static void main(String[] args) {
		NomeSobrenome completo = new NomeSobrenome();
		completo.setNome("Vinicius");
		completo.setSobrenome("Almeida");
		completo.juntar();
		System.out.println(completo);
		
	}

}
