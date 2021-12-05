package br.com.aulas.Aula06;

public class ExemploTrim {
	
	/* Em algumas ocasi�es, precisamos tirar espa�os de Strings j� digitadas. Neste 
	 * caso, existe um m�todo para isso que se chama .Trim(). Vejamos como se usa:
	 */
	
	public static void main(String[] args) {
		
		// Criada vari�vel para testes
		String variavelTeste = "    Alura     ";
		
		// Aqui estamos printando com os espa�os
		System.out.println(variavelTeste);
		
		// Aqui estamos printando sem os espa�os
		System.out.println(variavelTeste.trim());
		
	}
}
