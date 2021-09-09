package lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<String> sala = new ArrayList<>(Arrays.asList("joão","Roberto","Carla"));
		
		sala.add("maria");

		
		//Streams Java 8.
		//sala.stream().forEach(System.out::println);
	
		//System.out.println(sala.stream().map(a-> a.concat(" estudante")).collect(Collectors.toList()));
		/*
		System.out.println(sala.stream()
				.filter(a -> a.equals("João"))
				.collect(Collectors.toList()));
		*/
		String palavra;
		
		palavra = sala.stream().skip(1).limit(2).reduce((a,aluno)-> a.concat(" "+aluno)).get();
		
		System.out.println(palavra);
	}

}
