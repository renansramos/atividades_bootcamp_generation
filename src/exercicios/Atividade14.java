package exercicios;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado
 * e mostre na tela quantos números são pares e quantos número são ímpares.
*/

public class Atividade14 {

	public static void main(String[] args) {

//Instanciando classe Scanner:	
		Scanner leia = new Scanner(System.in);	
		
//Variáveis:
		int numeroPar = 0;
		int numeroImpar =0;
		int numero;
		
//Entrada de Dados:		
		System.out.println("Digite 10 números inteiros:\n");
		
//Processamento de dados:
		for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");          
            numero = leia.nextInt();
		
            if (numero % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
	}
		
		System.out.println("\nTotal de números pares: " + numeroPar + "\n");
	    System.out.println("Total de números ímpares: " + numeroImpar);

	    leia.close();

}
}
