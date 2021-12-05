package br.com.aulas.Aula06;

public class ExemploCharAt {

	public static void main(String[] args) {
		
		/**
		 * CharAt � usado para verificar em qual posi��o algum caractere
		 * espec�fico est� dentro da String. Suponhamos que voc� tenha uma String e 
		 * queira saber qual � o caractere que ocupa uma posi��o espec�fica. 
		 * Faremos um exemplo com a posi��o 2, e imprimiremos o resultado, observe:
		 */
		
		// Criando vari�vel para teste
		
		String variavelTeste = "Alura";
		
		char c = variavelTeste.charAt(2);
		
		// Aqui iremos printar o resultado:
		 
		System.out.println(c);
	
		/* 
		 * Reparem que o n�mero solicitado foi '2', mas a segunda letra de "Alura" seria L.
		 * Isto acontece porque no java n�s come�amos a contar a partir do 0. Ent�o, A = 0,
		 * L = 1, U = 2.
		 */
		
	}
}
