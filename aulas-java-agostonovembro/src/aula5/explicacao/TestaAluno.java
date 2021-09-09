package aula5.explicacao;

public class TestaAluno {

	public static void main(String[] args) {
		
		double notas[] = {10,8,9};
		double notas2[] = {7,7,8};
		
		Aluno a1 = new Aluno();
		
		Aluno a2 = new Aluno("João",notas2,10) ;
						
		a1.nome = "Ana";
		a1.notas = notas;
		a1.falta = 20;
		
		a1.imprimirDeclaracao();
		
		a2.imprimirDeclaracao();

	}

}
