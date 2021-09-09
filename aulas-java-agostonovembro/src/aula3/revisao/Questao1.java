package aula3.revisao;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite o raio da circunferência");
		int raio = leitor.nextInt();
		
		double comprimento = 2*Math.PI*raio;
		
		double area = Math.PI*Math.pow(raio, 2);
		
		System.out.printf("Comprimento: %.2f\n",comprimento);
		System.out.printf("Área: %.2f",area);
	}

}
