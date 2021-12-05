package br.com.aulas.Aula06;

public class ExemploTrim {
	
	/* Em algumas ocasiões, precisamos tirar espaços de Strings já digitadas. Neste 
	 * caso, existe um método para isso que se chama .Trim(). Vejamos como se usa:
	 */
	
	public static void main(String[] args) {
		
		// Criada variável para testes
		String variavelTeste = "    Alura     ";
		
		// Aqui estamos printando com os espaços
		System.out.println(variavelTeste);
		
		// Aqui estamos printando sem os espaços
		System.out.println(variavelTeste.trim());
		
	}
}
