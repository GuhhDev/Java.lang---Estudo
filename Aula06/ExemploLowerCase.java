package br.com.aulas.Aula06;

public class ExemploLowerCase {

	public static void main(String[] args) {
		
	
	/**
	 * toLowerCase � usado para retornar a mesma String original,
	 * com a diferen�a que ir� retornar todos os caracteres em min�sculo.
	 */
	
	// Criando vari�vel para teste em mai�sculo
	
	String variavelTeste = "ALURA";
	
	/* Pegando a vari�vel original e transformando todos os caracteres
	 * mai�sculos em min�sculos, retornando para uma nova vari�vel, visto que
	 * uma vari�vel do tipo String n�o altera seu valor original;
	 */
	
	String novaVariavelTeste = variavelTeste.toLowerCase();
	
	System.out.println(variavelTeste);
	System.out.println(novaVariavelTeste);
	
	}
}

