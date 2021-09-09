package exercicios;

public class Impressao {

	public static void main(String[] args) {
		
		System.out.println("______________________________________________________");
		System.out.println("  +++++++++        +        +++       +++      +      ");
		System.out.println("  +++++++++       +++        +++     +++      +++     ");
		System.out.println("     +++         +++++        +++   +++      +++++    ");
		System.out.println("     +++        +++ +++        +++ +++      +++ +++   ");
		System.out.println(" ++  +++       +++++++++        ++ ++      +++++++++  ");
		System.out.println("  ++++++      +++++++++++        +++      +++++++++++ ");
		System.out.println("   ++++      +++       +++        +      +++       +++");
		System.out.println("__________-Universidade do Trabalho Digital-__________");
		
		System.out.println();
		System.out.println();
		String aluno1="Maria",aluno2="João",aluno3="Ana",aluno4="Paula";
		
		double nota1=10.0,nota2=8.50,nota3=9.70,nota4=7.00;
		
		System.out.printf("Aluno(a) \tnota \n");
		System.out.printf("=====================\n");
		System.out.printf("%s \t\t%.1f \n",aluno1,nota1);
		System.out.printf("%s \t\t%.2f \n",aluno2,nota2);
		System.out.printf("%s \t\t%.2f \n",aluno3,nota3);
		System.out.printf("%s \t\t%.2f \n",aluno4,nota4);
		
		System.out.println();
		System.out.println();
		
		final String INSTITUICAO = "UTD";
		String nome="Osvaldo", curso="Java", modalidade="EAD";
		int idade = 34;
		char sexo='M';
		
		System.out.println("=============="+INSTITUICAO+"==============");
		System.out.println("=======Ficha de cadastro=======");
		System.out.println("Nome:  "+nome+" idade: "+idade);
		System.out.println("sexo:  "+sexo);
		System.out.println("curso: "+curso+"    modalidade: "+modalidade);
	
		System.out.println();
		System.out.println();
		
		System.out.println("______________________________________________________");
		System.out.println("  +++++++++        +        +++       +++      +      ");
		System.out.println("  +++++++++       +++        +++     +++      +++     ");
		System.out.println("     +++         +++++        +++   +++      +++++    ");
		System.out.println("     +++        +++ +++        +++ +++      +++ +++   ");
		System.out.println(" ++  +++       +++++++++        ++ ++      +++++++++  ");
		System.out.println("  ++++++      +++++++++++        +++      +++++++++++ ");
		System.out.println("   ++++      +++       +++        +      +++       +++");
		System.out.println("__________-Universidade do Trabalho Digital-__________");
		System.out.println("curso: "+curso+"    modalidade: "+modalidade);
		System.out.printf("Aluno(a) \tnota \n");
		System.out.printf("=====================\n");
		System.out.printf("%s \t\t%.1f \n",aluno1,nota1);
		System.out.printf("%s \t\t%.2f \n",aluno2,nota2);
		System.out.printf("%s \t\t%.2f \n",aluno3,nota3);
		System.out.printf("%s \t\t%.2f \n",aluno4,nota4);
	  /*
		DESAFIO:
		/)_/)
	   (=';')
	  c(('')('') 1) com apenas um comando de printf, imprima o coelho ao lado.
	  
	  *fazer com caracteres. pra mim!
	  */
	}

}
