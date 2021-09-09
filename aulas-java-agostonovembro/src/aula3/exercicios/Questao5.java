package aula3.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Questao5 {
	
	
	public static void main(String[] args) {
	
		List<String> alunos = new ArrayList<>();
		List<Integer> notas = new ArrayList<>();
		List<Aluno> sala = new ArrayList<>();
		
		Aluno a1 = new Aluno();
		a1.id=1;
		a1.nome = "Osvaldo";
		a1.curso = "Java";
		
		sala.add(a1);
		
		for(Aluno al : sala) {
			System.out.println(al.id);
			System.out.println(al.nome);
			System.out.println(al.curso);	
		}	
		
		alunos.add("Jacira");
		alunos.add("David");
		alunos.add("Gilberto");
		
		System.out.println(alunos);
		
		alunos.add("Halyson");
		
		System.out.println(alunos);
		
		alunos.sort(null);
		
		System.out.println(alunos);
		
		alunos.add(0, "Caetano");
		
		System.out.println(alunos);
		
		alunos.add("Osvaldo");
		
		System.out.println(alunos);
		
		alunos.remove("Osvaldo");
		
		System.out.println(alunos);
		
		System.out.println(alunos.contains("Jacira"));
		
		System.out.println(alunos.contains("Seu Creyson"));
	}
}
