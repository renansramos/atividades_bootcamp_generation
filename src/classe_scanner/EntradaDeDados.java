package classe_scanner;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		//Instanciou a classe Scanner
		Scanner leia = new Scanner(System.in);
		
		//variáveis:
		
		int quantidade;
		long identificador;
		float altura;
		double area;
		char tipo;
		String frase;
		boolean ativo;
		
		//Exibindo na tela a solicitação da entrada de dados:
		System.out.println("\nDigite um valor para variável quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("\nDigite um valor para variável quantidade (long): ");
		identificador = leia.nextLong();
		
		System.out.println("\nDigite um valor para variável quantidade (float): ");
		altura = leia.nextFloat();
		
		System.out.println("\nDigite um valor para variável quantidade (double): ");
		area = leia.nextDouble();
		
		System.out.println("\nDigite um valor para variável quantidade (char): ");
		tipo = leia.next().charAt(0);
		
		System.out.println("\nDigite um valor para variável quantidade (String): ");
		leia.skip("\\R?");
		frase = leia.next();
		
		System.out.println("\nDigite um valor para variável quantidade (boolean): ");
		ativo = leia.nextBoolean();
		
		System.out.println("\nDados recebidos via teclado\n");
		
		
		System.out.println("\nVariável quantidade = " + quantidade);

		System.out.println("\nVariável identificador = " + identificador);

		System.out.println("\nVariável altura = " + altura);

		System.out.println("\nVariável area = " + area);

		System.out.println("\nVariável tipo = " + tipo);

		System.out.println("\nVariável frase = " + frase);

		System.out.println("\nVariável ativo = " + ativo);
		
		leia.close();
		
		//leia.nextLine(); Limpeza de Buffer - Limpar a memória para receber novos dados 
		
		
		
		
	}

	
}
