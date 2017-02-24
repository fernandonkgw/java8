package br.com.fnkgw.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamDeCursos {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.map(Curso::getNome)
			.forEach(System.out::println);
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .mapToInt(Curso::getAlunos)
		   .forEach(System.out::println);
		
		Optional<Curso> optionalPrimeiroCurso = cursos.stream()
				.filter(c -> c.getAlunos() > 50)
				.findFirst();
		
		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(m -> System.out.println(m));
		
		List<Curso> cursosFiltrados = cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		cursosFiltrados.forEach(c -> System.out.println(c.getNome()));
	}
}
