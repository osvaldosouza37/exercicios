package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		List<String> sala = new ArrayList<>();
		List<Double> notas = new ArrayList<>();
		
		sala.add("ronaldo");
		
		boolean teste = !false && (false || true) || !(true && ! false) && (!false && !false) ;
		
		System.out.println(teste);
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		String nome = leitor.nextLine();
		
		System.out.println("Digite anota do "+nome);
		double nota = leitor.nextDouble();
		
		notas.add(sala.indexOf(nome),nota);
		
		
		for (int i = 0; i < sala.size(); i++) {
			System.out.print(sala.get(i)+" ");;
			System.out.println(notas.get(i));
		}
		
	}

}
