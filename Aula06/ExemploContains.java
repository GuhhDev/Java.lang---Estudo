package br.com.aulas.Aula06;

public class ExemploContains {

	public static void main(String[] args) {
		
		/**
		 * Contains � usado para verificar se possu�mos alguma substring,
		 * dentro de outra String anterior. Veja a seguir:
		 */
		
		// Criando vari�vel para teste
		
		String variavelTeste = "Alura";
		
		/* Aqui iremos printar diretamente a vari�vel e iremos verificar se
		 * a vari�vel possui "Alu" escrito, caso possua, ir� retornar um tipo
		 * boleano no console, neste caso ir� retornar "true", pois existe essa
		 * substring dentro da String original;
		 */
		
		System.out.println(variavelTeste.contains("Alu"));
		
	}
}
