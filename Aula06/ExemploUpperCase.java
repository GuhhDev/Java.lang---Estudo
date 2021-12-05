package br.com.aulas.Aula06;

public class ExemploUpperCase {

	public static void main(String[] args) {
		
	/**
	 * toUpperCase � usado para retornar a mesma String original,
	 * com a diferen�a que ir� retornar todos os caracteres em mai�sculo.
	 */
	
	// Criando vari�vel para teste em mai�sculo
	
	String variavelTeste = "alura";
	
	/* Pegando a vari�vel original e transformando todos os caracteres
	 * min�sculos em mai�sculos, retornando para uma nova vari�vel, visto que
	 * uma vari�vel do tipo String n�o altera seu valor original;
	 */
	
	String novaVariavelTeste = variavelTeste.toUpperCase();
	
	System.out.println(variavelTeste);
	System.out.println(novaVariavelTeste);
		
	}
}

