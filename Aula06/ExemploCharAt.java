package br.com.aulas.Aula06;

public class ExemploCharAt {

	public static void main(String[] args) {
		
		/**
		 * CharAt é usado para verificar em qual posição algum caractere
		 * específico está dentro da String. Suponhamos que você tenha uma String e 
		 * queira saber qual é o caractere que ocupa uma posição específica. 
		 * Faremos um exemplo com a posição 2, e imprimiremos o resultado, observe:
		 */
		
		// Criando variável para teste
		
		String variavelTeste = "Alura";
		
		char c = variavelTeste.charAt(2);
		
		// Aqui iremos printar o resultado:
		 
		System.out.println(c);
	
		/* 
		 * Reparem que o número solicitado foi '2', mas a segunda letra de "Alura" seria L.
		 * Isto acontece porque no java nós começamos a contar a partir do 0. Então, A = 0,
		 * L = 1, U = 2.
		 */
		
	}
}
