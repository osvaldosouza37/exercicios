package aula3.revisao;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Digite o preço.");
		double preco = scan.nextDouble();
		
		System.out.println("Digite a porcentagem");
		double porcentagem = scan.nextDouble();
				
		double acrescimo = preco + preco * porcentagem/100;
		double desconto = preco - preco * porcentagem/100;
		
		System.out.printf("preço: %.2f\n",preco);
		System.out.printf("acréscimo: %.2f\n",acrescimo);
		System.out.printf("desconto: %.2f",desconto);
	}
}
