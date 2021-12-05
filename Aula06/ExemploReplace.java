package br.com.aulas.Aula06;

public class ExemploReplace {

	public static void main(String[] args) {
		
		/**
		 * Aqui iremos aprender a usar o "Replace". O replace � usado para buscar uma
		 * String que j� est� sendo usada e trocar algum ou v�rios caracteres. Um detalhe
		 * � que o replace n�o altera o original, uma String nunca poder� ser alterada. Voc�
		 * deve atribuir o novo valor a uma var�avel, para que possa ser usada.
		 */
		
		// Aqui declaramos uma vari�vel com uma String para testes
		
		String variavelTeste = "Alura";
		
		/* Aqui iremos usar o replace para criar uma nova vari�vel e atribuir o retorno
		 * do replace, buscando a String de "variavelTeste" e atribuindo � "novaVariavelTeste,
		 * apenas trocando a primeira letra. 
		 */
		
		String novaVariavelTeste = variavelTeste.replace("A", "a");
		
		System.out.println(variavelTeste);
		System.out.println(novaVariavelTeste);
		
	}
}
