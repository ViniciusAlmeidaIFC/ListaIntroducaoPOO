package Exercicio06;

import java.util.ArrayList;

public class ListCodigos {

	ArrayList<Cardapio> lista = new ArrayList<Cardapio>();
	
	public void inserir(Cardapio cardapio) {
		lista.add(cardapio);
	}
	/*
	Especifica��o C�digo Pre�o
	Cachorro Quente 100 R$ 1,20
	Bauru Simples 101 R$ 1,30
	Bauru com ovo 102 R$ 1,50
	Hamb�rguer 103 R$ 1,20
	Cheeseburguer 104 R$ 1,30
	Refrigerante 105 R$ 1,00
	*/
	public double calcular() {
		float valor = 0;
		float somaValor = 0;
		for(int i = 0; i < lista.size(); i++) {
			valor = 0;
			switch(lista.get(i).getCodigo()) {
			case 100:
				valor = (float)1.20 * lista.get(i).getQtd();
				System.out.println("Cachorro Quente |  100   | R$ "+valor);
				break;
			case 101:
				valor = (float)1.30 * lista.get(i).getQtd();
				System.out.println("Bauru Simples   |  101   | R$ "+valor);
				break;
			case 102:
				valor = (float)1.50 * lista.get(i).getQtd();
				System.out.println("Bauru com ovo   |  102   | R$ "+valor);
				break;
			case 103:
				valor = (float)1.20 * lista.get(i).getQtd();
				System.out.println("Hamb�rguer      |  103   | R$ "+valor);
				break;
			case 104:
				valor = (float)1.30 * lista.get(i).getQtd();
				System.out.println("Cheeseburguer   |  104   | R$ "+valor);
				break;
			case 105:
				valor = (float)1.00 * lista.get(i).getQtd();
				System.out.println("Refrigerante    |  105   | R$ "+valor);
				break;
			}
			somaValor = somaValor + valor;
		}
		return somaValor;
	}
}
