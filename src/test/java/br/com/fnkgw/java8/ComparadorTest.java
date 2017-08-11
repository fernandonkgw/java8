package br.com.fnkgw.java8;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class ComparadorTest {

	@Test
	public void ordernarCrescenteStringsComJava7() {
		List<String> nomes = Arrays.asList("fabio", "carlos", "wanderley", "fernando");

		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
			}
		};
		Collections.sort(nomes, comparator);

		assertEquals("carlos", nomes.get(0));
		assertEquals("fabio", nomes.get(1));
		assertEquals("fernando", nomes.get(2));
		assertEquals("wanderley", nomes.get(3));
	}

	@Test
	public void ordenarCrescenteStringComLambdaJava8() {
		List<String> nomes = Arrays.asList("fabio", "carlos", "wanderley", "fernando");

		Comparator<String> comparator = (s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
		Collections.sort(nomes, comparator);

		assertEquals("carlos", nomes.get(0));
		assertEquals("fabio", nomes.get(1));
		assertEquals("fernando", nomes.get(2));
		assertEquals("wanderley", nomes.get(3));
	}

	@Test
	public void ordenarCrescenteStringComLambdaMesmaLinhaJava8() {
		List<String> nomes = Arrays.asList("fabio", "carlos", "wanderley", "fernando");

		Collections.sort(nomes, (s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s1, s2));

		assertEquals("carlos", nomes.get(0));
		assertEquals("fabio", nomes.get(1));
		assertEquals("fernando", nomes.get(2));
		assertEquals("wanderley", nomes.get(3));
	}
}
