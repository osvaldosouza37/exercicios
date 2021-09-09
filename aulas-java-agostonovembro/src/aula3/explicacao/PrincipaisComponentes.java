package aula3.explicacao;

import java.util.ArrayList;
import java.util.List;

/*
 * Programa que explica os principais componentes da linguagem java.
 * 
 * author: Osvaldo Souza 
 * 
 * versão 1.0.
 * 
 * */
public class PrincipaisComponentes {

	public static void main(String[] args) {
		
		//operadores unários 
		/*
		 * = atribuição 
		 * ! inversão NEGAÇÃO
		 * == igualdade
		 * != desigualdade
		 * x++ pós incremento
		 * x+=2
		 * x+=10
		 * ++x pré incremento 
		 * x-- pós decremento
		 * --x pré decremento
		 * 
		 * + - (/) * 
		 * 
		 * % = resto da divisão.
		 * 
		 * operadores lógicos.
		 * 
		 * !
		 * &
		 * &&
		 * AND 
		 * V ^ V = V
		 * V ^ F = F
		 * F ^ V = F
		 * F ^ F = F
		 * 
		 * |
		 * ||
		 * OR
		 * V ^ V = V
		 * V ^ F = V
		 * F ^ V = V
		 * F ^ F = F	   
		 * 
		 * Operadores relacionais
		 * 
		 * > maior que
		 * < menor que
		 * >= maior ou igual
		 * <= menor ou igual 
		 * 
		 * Operador ternário 
		 * 
		 * (proposição lógica)? (valor se verdadeiro):(valor se falso)
		 * 
		 * int x=12;
		 * String ternario = (x%3==2)?"correto":"incorreto";
		 * System.out.println(ternario);
		 * 
					char lista[] = new char[25];
		
		//vetores
		int vetor[] = new int[10];
		
		//criando o vetor e inicializando os seus valores.
		int vetor2[] = {1,2,3,100,5,6,7};
		
		//índice
		//[0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		vetor[0] = 25;
		vetor[9] = 87;
		vetor[1] = 100;
		vetor[0] = 45;
		
		for(int x : vetor2) {
			System.out.println(x);
		}
		
		for(int x =0 ; x<vetor2.length;x++) {
			System.out.println(vetor2[x]);
		}
		 * */
		
		int matrix[][] = new int[2][2];

		/*
		 * [0,0][0,1]
		 * [1,0][1,1]
		 * */
		
		matrix[0][0] = 2;
		matrix[0][1] = 4;
		matrix[1][0] = 6;
		matrix[1][1] = 8;
		
		//System.out.println(matrix[1][0]);
		/*
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		List<String> sala = new ArrayList<>();
		
		sala.add("David");
		sala.add("Milena");
		sala.add("Diego");
		sala.add(1, "Cecila");
		sala.remove(2);
		
		sala.sort(null);
		
		for(String alunos : sala) {
			System.out.println(alunos);
		}
		*/
		
		int vetor[] = {1,2,3,4};
		
		int contador =0;
		
		while(contador<vetor.length) {
			System.out.println(vetor[contador]);
			
			contador++;
		}
		
		
		
	}

}
