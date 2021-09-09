package aula5.explicacao;

public class Aluno {

	String nome;
	double notas[];
	int falta;
	
	public Aluno() {};
	
	public Aluno(String name, double notas[],int falta) {
		nome = name;
		this.notas = notas;
		this.falta = falta;
	}
	
	public void imprimirDeclaracao(){
		System.out.println(this.nome);
		System.out.println(this.notas[0]);
		System.out.println(this.notas[1]);
		System.out.println(this.notas[2]);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
