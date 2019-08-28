package Exercicio10;

import java.util.Scanner;

public class TelevisaoMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Televisao tv = new Televisao();
		int canal = 1;
		int opcao2 = 0;
		int volume = 1;
		
		tv.setCanalAtual(canal);
		tv.setVolumeAtual(volume);
		
		System.out.println(tv.toString());
		do {
			do {
				System.out.println("1 - Mudar Canal \n2 - Aumentar Volume \n3 - Diminuir volume \n4 - Sair");
				opcao2 = entrada.nextInt();
			} while (opcao2 < 1 || opcao2 > 4);
			if (opcao2 == 1) {
				do {
					System.out.print("Canal: ");
					canal = entrada.nextInt();
				} while (canal < 1 || canal > 100);
				tv.setCanalAtual(canal);
			} else {
				if (opcao2 == 2) {
					if(volume <= 99) {
						volume++;
						tv.setVolumeAtual(volume);
					}
				}else {
					if(opcao2 == 3) {
						if(volume >= 1) {
							volume--;
							tv.setVolumeAtual(volume);
						}
					}
				}
			}
			System.out.println(tv.toString());
		} while (opcao2 != 4);
		entrada.close();
	}
}
