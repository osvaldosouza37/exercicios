package aula3.exercicios;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		int num1,num2,maior;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro númnero");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo númnero");
		num2 = leitor.nextInt();
						
		//DESAFIO TÃ DÃ!!!! Fazer o maior entre três números.
		//usando a equação mágica.
		maior = ((num1+num2)+Math.abs(num1-num2))/2; 
		
		System.out.println("operador ternário: "+(num1>num2?num1:num2));
		System.out.println("equeção mágica: "+maior);

	}

}
