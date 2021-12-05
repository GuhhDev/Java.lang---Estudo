package br.com.aulas.Aula06;

public class ExemploLowerCase {

	public static void main(String[] args) {
		
	
	/**
	 * toLowerCase é usado para retornar a mesma String original,
	 * com a diferença que irá retornar todos os caracteres em minúsculo.
	 */
	
	// Criando variável para teste em maiúsculo
	
	String variavelTeste = "ALURA";
	
	/* Pegando a variável original e transformando todos os caracteres
	 * maiúsculos em minúsculos, retornando para uma nova variável, visto que
	 * uma variável do tipo String não altera seu valor original;
	 */
	
	String novaVariavelTeste = variavelTeste.toLowerCase();
	
	System.out.println(variavelTeste);
	System.out.println(novaVariavelTeste);
	
	}
}

