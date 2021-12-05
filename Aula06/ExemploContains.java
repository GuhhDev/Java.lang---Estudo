package br.com.aulas.Aula06;

public class ExemploContains {

	public static void main(String[] args) {
		
		/**
		 * Contains é usado para verificar se possuímos alguma substring,
		 * dentro de outra String anterior. Veja a seguir:
		 */
		
		// Criando variável para teste
		
		String variavelTeste = "Alura";
		
		/* Aqui iremos printar diretamente a variável e iremos verificar se
		 * a variável possui "Alu" escrito, caso possua, irá retornar um tipo
		 * boleano no console, neste caso irá retornar "true", pois existe essa
		 * substring dentro da String original;
		 */
		
		System.out.println(variavelTeste.contains("Alu"));
		
	}
}
