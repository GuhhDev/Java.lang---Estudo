package br.com.aulas.Aula06;

public class ExemploUpperCase {

	public static void main(String[] args) {
		
	/**
	 * toUpperCase é usado para retornar a mesma String original,
	 * com a diferença que irá retornar todos os caracteres em maiúsculo.
	 */
	
	// Criando variável para teste em maiúsculo
	
	String variavelTeste = "alura";
	
	/* Pegando a variável original e transformando todos os caracteres
	 * minúsculos em maiúsculos, retornando para uma nova variável, visto que
	 * uma variável do tipo String não altera seu valor original;
	 */
	
	String novaVariavelTeste = variavelTeste.toUpperCase();
	
	System.out.println(variavelTeste);
	System.out.println(novaVariavelTeste);
		
	}
}

