package br.com.fnkgw.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
	}

}

class ConsumidorDeString implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}
