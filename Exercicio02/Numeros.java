package Exercicio02;

import java.util.Arrays;

public class Numeros {

	private int um = 0;
	private int dois = 0;
	public int getUm() {
		return um;
	}
	public void setUm(int um) {
		this.um = um;
	}
	public int getDois() {
		return dois;
	}
	public void setDois(int dois) {
		this.dois = dois;
	}
	
	public int[] intervalo() {
		int aux = 0;
		
		if(um > dois) {
			aux = um;
			um = dois;
			dois = aux;
			}
		final int TAM = (dois-um) - 1;
		int[] vet = new int[TAM];
		for(int i = 0; i < TAM ; i++) {
			vet[i] = um + (i+1) ;
			
		}
		return vet;
	}
	@Override
	public String toString() {
		return "Numeros [um=" + um + ", dois=" + dois + ", intervalo()=" + Arrays.toString(intervalo()) + "]";
	}
	
	
}
