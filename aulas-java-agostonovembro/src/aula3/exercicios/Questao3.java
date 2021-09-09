package aula3.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		
		int numero,centena,dezena,unidade;
		String informacao;
		Scanner leitor = new Scanner(System.in);

		/*
		informacao = JOptionPane.showInputDialog("Digite um número");
		
		numero = Integer.parseInt(informacao);
		
		System.out.println(numero);
		System.out.println(informacao);
		*/
		
		System.out.println("Digite um número.");
		numero = leitor.nextInt();
		
		centena = numero /100;
		
		dezena = (numero-centena*100)/10;
		
		unidade = numero%10;
		// Fazer de trás para a frente unidade, dezena, centena.
		// Questão do troco.
		//unidade = (numero-centena*100)%10;
		
		System.out.println("centena:"+centena);
		System.out.println("dezena:"+dezena);
		System.out.println("unidade:"+unidade);
		System.out.println("invertido:"+unidade+dezena+centena);
		
		//$100,50,20,10,5,2,1,0.50,0.25,0.10,0.05;
		
	}

}
