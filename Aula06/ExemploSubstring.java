package br.com.aulas.Aula06;

public class ExemploSubstring {

	public static void main(String[] args) {
		
		/* Existe um m�todo que possibilita a cria��o de uma sub-String,
		 * chamado apropriadamente de substring(). 
		 */
		
		// Criando vari�vel para testes:
		String variavelTeste = "Alura";
		
		// Vamos fornecer a partir de que posi��o iniciamos a contagem; colocaremos 1
		String novaVariavelTeste = variavelTeste.substring(1);
		
		// Aqui ir� trazer a substring nova, escrito "lura", pois a substring nova come�a a partir da posi��o 1;
		System.out.println(novaVariavelTeste);
	}
}
