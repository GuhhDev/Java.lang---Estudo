package br.com.aulas.Aula06;

public class ExemploSubstring {

	public static void main(String[] args) {
		
		/* Existe um método que possibilita a criação de uma sub-String,
		 * chamado apropriadamente de substring(). 
		 */
		
		// Criando variável para testes:
		String variavelTeste = "Alura";
		
		// Vamos fornecer a partir de que posição iniciamos a contagem; colocaremos 1
		String novaVariavelTeste = variavelTeste.substring(1);
		
		// Aqui irá trazer a substring nova, escrito "lura", pois a substring nova começa a partir da posição 1;
		System.out.println(novaVariavelTeste);
	}
}
