package aula1;
/*
 * Primeiro programa do curso de java
 * 
 * autor: Osvaldo Souza
 * 
 * versão 1.0.
 * 
 * */

public class OlaMundo {
	
	public static void main(String[] args) {
		
		//declaração de constantes.
		final double PI = 3.14;
		
		//declaração de variáveis.
		int numero = 37, numero_2= 51;
		
		double avogrado = 3.06;
		
		char letra = 'a';
		
		boolean temAula= false; 
		
		String palavra = "UTD";
		
		//System.out.print("número: "+numero);
		//System.out.println(" de novo.");
		System.out.printf("valor 1 : %d valor 2: %d\n",numero,numero_2);
		System.out.printf("valor: %.2f \n",avogrado);
		System.out.printf("letra: %c \n",letra);
		System.out.printf("palavra %s \n",palavra);
		
		String questao1 = "O primeiro programa a gente nunca esquece.";
		
		System.out.println(questao1);
		
		System.out.println("Constante: "+PI);
	}

}
