package aula3.exercicios;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		int num1,num2,maior;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mnero");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo n�mnero");
		num2 = leitor.nextInt();
						
		//DESAFIO T� D�!!!! Fazer o maior entre tr�s n�meros.
		//usando a equa��o m�gica.
		maior = ((num1+num2)+Math.abs(num1-num2))/2; 
		
		System.out.println("operador tern�rio: "+(num1>num2?num1:num2));
		System.out.println("eque��o m�gica: "+maior);

	}

}
