package objetos;

public class ObjetoTeste {

	public static void main(String[] args) {
	
		Aluno a1 =new Aluno(1,"Alucard","java");
		Aluno a2 =new Aluno(2,"Richter","java");
		Aluno a3 =new Aluno(3,"Maria","java");

		System.out.println(Aluno.getNum_alunos());
		
		System.out.println(a1);
	}

}
