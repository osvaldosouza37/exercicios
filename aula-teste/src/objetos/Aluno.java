package objetos;

public class Aluno extends Pessoa{

	private static int num_alunos;
	
	public Aluno(int id, String nome, String curso) {
		super(id, nome, curso);
		Aluno.num_alunos++;
	}

	public static int getNum_alunos() {
		return num_alunos;
	}

	public static void setNum_alunos(int num_alunos) {
		Aluno.num_alunos = num_alunos;
	}
}
