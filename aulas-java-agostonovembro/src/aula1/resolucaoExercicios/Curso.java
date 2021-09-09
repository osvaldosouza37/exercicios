package aula1.resolucaoExercicios;

public class Curso {

	public static void main(String[] args) {
		
		final String INSTITUICAO = "UTD";
		
		String nome,curso="Java",modalidade="EAD";
		
		nome="Osvaldo";

		int idade=34;
		
		char sexo='M';
		
		System.out.println("=============="+INSTITUICAO+"==============");
		System.out.println("=======Ficha de cadastro=======");
		System.out.printf("Nome:  %s  idade: %d",nome,idade);
		System.out.println("sexo:  "+sexo);
		System.out.println("curso: "+curso+"    modalidade: "+modalidade);
		
	}

}
