package br.com.aulas.Aula06;

public class ExemploReplace {

	public static void main(String[] args) {
		
		/**
		 * Aqui iremos aprender a usar o "Replace". O replace é usado para buscar uma
		 * String que já está sendo usada e trocar algum ou vários caracteres. Um detalhe
		 * é que o replace não altera o original, uma String nunca poderá ser alterada. Você
		 * deve atribuir o novo valor a uma varíavel, para que possa ser usada.
		 */
		
		// Aqui declaramos uma variável com uma String para testes
		
		String variavelTeste = "Alura";
		
		/* Aqui iremos usar o replace para criar uma nova variável e atribuir o retorno
		 * do replace, buscando a String de "variavelTeste" e atribuindo à "novaVariavelTeste,
		 * apenas trocando a primeira letra. 
		 */
		
		String novaVariavelTeste = variavelTeste.replace("A", "a");
		
		System.out.println(variavelTeste);
		System.out.println(novaVariavelTeste);
		
	}
}
