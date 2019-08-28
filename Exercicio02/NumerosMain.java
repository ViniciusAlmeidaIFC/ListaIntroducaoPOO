package Exercicio02;

public class NumerosMain {

	public static void main(String[] args) {

		Numeros num = new Numeros();
		
		int um = 10;
		int dois = 2;
		if(um > dois)
		System.out.println("O segundo número é menor que o primeiro! \nFazendo inversão. ");
		num.setUm(um);
		num.setDois(dois);
		num.intervalo();
		System.out.println(num);
	}
}
