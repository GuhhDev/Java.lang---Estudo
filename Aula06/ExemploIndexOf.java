package br.com.aulas.Aula06;

public class ExemploIndexOf {

	public static void main(String[] args) {
		
		/* Aqui iremos distinguir o que é o indexOf. Ele tem como função
		 * trazer o valor de onde começa a substring. Vejamos no exemplo a seguir:
		 */
		
		// Criando variável para testes:
		String variavelTeste = "Alura";
		
		// Aqui irei instanciar uma nova variavel e adicionar um retorno do tipo indexOf
		int novaVariavelTeste = variavelTeste.indexOf("ur");
		
		// Aqui irá trazer onde começa o "ur" variavelTeste "Alura";
		System.out.println(novaVariavelTeste);
	}
}
