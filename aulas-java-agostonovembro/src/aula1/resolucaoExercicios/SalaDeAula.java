package aula1.resolucaoExercicios;

public class SalaDeAula {

	public static void main(String[] args) {
		
		String aluno1="Maria",aluno2="João",aluno3="Ana",aluno4="Pedro";
		
		double nota1=10.0f,nota2=9.6,nota3=8.2,nota4=7.0;
		
		System.out.printf("Aluno(a) \tnota \n");
		System.out.printf("=====================\n");
		System.out.printf("%s \t\t%.1f \n",aluno1,nota1);
		System.out.printf("%s \t\t%.2f \n",aluno2,nota2);
		System.out.printf("%s \t\t%.2f \n",aluno3,nota3);
		System.out.printf("%s \t\t%.2f \n",aluno4,nota4);
		
		System.out.println("Aluno(a) \tnota \n");
		System.out.println("=====================\n");
		System.out.println(aluno1+" \t\t"+nota1);
		System.out.println(aluno2+" \t\t"+nota2);
		System.out.println(aluno3+" \t\t"+nota3);
		System.out.println(aluno4+" \t\t"+nota4);
		
	}

}
