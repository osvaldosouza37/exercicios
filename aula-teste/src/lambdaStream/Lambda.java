package lambdaStream;

public class Lambda {

	public static void main(String[] args) {
		
		Lambda lb = new Lambda();
		
		Operacao soma = (int a, int b) -> a+b;
		Operacao sub = (int a, int b) -> a-b;
		
		System.out.println("soma: "+calcula(soma,10,20));
		System.out.println("subtração: "+calcula(sub,30,15));

	}
	
	public static int calcula(Operacao op, int a, int b) {
		return op.executar(a, b);
	}

}
//SAM
interface Operacao{
	int executar(int a, int b);
}
