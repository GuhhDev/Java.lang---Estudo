package br.com.aulas.Aula06;

public class ExemploIsEmpty {

	public static void main(String[] args) {
		
		/* Aqui, o metodo isEmpty ir� trazer um valor boleano, sendo true para 
		 * vazio e false quando existe conteudo na String.
		 */
		
		// Criando vari�vel para testes:
		String variavelTeste = "Alura";
		String vazio = "";
		
		// Iremos verificar quantos caracteres possui a "variavelTeste"
		System.out.println(variavelTeste.isEmpty());
		System.out.println(vazio.isEmpty());
	}
}
