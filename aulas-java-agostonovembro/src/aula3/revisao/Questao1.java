package aula3.revisao;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite o raio da circunfer�ncia");
		int raio = leitor.nextInt();
		
		double comprimento = 2*Math.PI*raio;
		
		double area = Math.PI*Math.pow(raio, 2);
		
		System.out.printf("Comprimento: %.2f\n",comprimento);
		System.out.printf("�rea: %.2f",area);
	}

}
