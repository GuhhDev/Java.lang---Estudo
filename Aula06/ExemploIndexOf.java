package br.com.aulas.Aula06;

public class ExemploIndexOf {

	public static void main(String[] args) {
		
		/* Aqui iremos distinguir o que � o indexOf. Ele tem como fun��o
		 * trazer o valor de onde come�a a substring. Vejamos no exemplo a seguir:
		 */
		
		// Criando vari�vel para testes:
		String variavelTeste = "Alura";
		
		// Aqui irei instanciar uma nova variavel e adicionar um retorno do tipo indexOf
		int novaVariavelTeste = variavelTeste.indexOf("ur");
		
		// Aqui ir� trazer onde come�a o "ur" variavelTeste "Alura";
		System.out.println(novaVariavelTeste);
	}
}
