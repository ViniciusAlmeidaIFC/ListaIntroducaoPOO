package Exercicio07;

public class QuadradoMain {

	public static void main(String[] args) {

		Quadrado q = new Quadrado();
		
		q.setTamanhoLado(100);
		q.calcularArea();
		System.out.println(q);
		
		q.setTamanhoLado(5);
		q.calcularArea();
		System.out.println(q);
		
		
	}

}
