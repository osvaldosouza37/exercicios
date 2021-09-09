package exercicios;

import java.util.Scanner;

public class Perfeito {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num = leitor.nextInt();
		
		System.out.println(nPerfeito(num));
		
		
	}

	public static int nPerfeito(int num) {
		int divisores = 0;
		
		for(int i =1; i<num;i++) {
			if(num%i==0) divisores+=i;
		}
		
		if(divisores==num) return num;
		else return 0;
	}
}
