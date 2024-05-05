package exercicios;

import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia números inteiros 
 *via teclado, até que o número zero seja digitado. Ao 
 *final, mostre na tela a soma de todos os números 
 *digitados, que sejam positivos. Veja o exemplo abaixo:
*/


public class Atividade17 {

	public static void main(String[] args) {
//Instanciando classe Scanner:		
		Scanner leia = new Scanner(System.in);

//Variáveis:		
		int numero;
		int soma = 0;
		
//Processamento de dados:
		do {
			
			System.out.print("Digite um numero inteiro: ");
			numero = leia.nextInt();
			
			
			if (numero == 0) {
				break;
			}
			
			if (numero > 0) {
				soma += numero;
				
			}
			
		} while (true);
		
		System.out.println("A soma dos números positivos é: " + soma);
	}
}
