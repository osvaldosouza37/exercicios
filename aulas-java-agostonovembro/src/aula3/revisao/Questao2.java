package aula3.revisao;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		double metrosPorSegundos, quilometrosPorHora;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a distância em metros");
		int distancia = leitor.nextInt();
		
		System.out.println("Digite o tempo em segundos");
		int tempo = leitor.nextInt();
		
		metrosPorSegundos = distancia/tempo;
		
		quilometrosPorHora = metrosPorSegundos*3.6;
		
		System.out.printf("velocidade m/s %.2f\n",metrosPorSegundos);
		System.out.printf("velocidade k/h %.2f",quilometrosPorHora);
		
		
		
		
	}

}
