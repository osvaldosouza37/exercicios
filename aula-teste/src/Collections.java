import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> sala = new ArrayList<>();
		
		Queue<String> filaBanco = new LinkedList<>();

		filaBanco.add("Alucard");
		filaBanco.add("Richter");
		filaBanco.add("Maria");
		filaBanco.add("Soma");
		
		System.out.println(filaBanco);
		
		for (String personagem : filaBanco) {
			System.out.println(personagem);
		}
		
		Iterator<String> iterator = filaBanco.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("--->"+iterator.next());
		}
		
		
		sala.add("a1");
		sala.add("a2");
		sala.add("a3");
		sala.add("a4");
		sala.add("a5");
		sala.add("a6");
		
		sala.add(2, "a7");
		
		for (String string : sala) {
			System.out.println(string);
		}
		
		sala.sort(null);
	}

}
