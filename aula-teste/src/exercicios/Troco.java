package exercicios;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int troco = leitor.nextInt();
		
		
		int cinquenta = troco/50;
		
		int vinte = (troco%50)/20;
		
		int dez = (troco%20)/10;
		
		int cinco = (troco%10)/5;
		
		int dois = (troco%5)/2;
		
		int um = (troco%2);
		//notas de 50,20,10,5,2,1
		
		System.out.println("50 "+cinquenta);
		System.out.println("20 "+vinte);
		System.out.println("10 "+dez);
		System.out.println("5 "+cinco);
		System.out.println("2 "+dois);
		System.out.println("1 "+um);
		

	}

}
