package exercicios;

import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia números inteiros 
 *via teclado, até que o número zero seja digitado. Ao 
 *final, mostre na tela a média de todos os números 
 *digitados, que sejam múltiplos de 3. Veja o exemplo 
 *abaixo:
*/

public class Atividade18 {
	public static void main(String[] args) {
		
//Instanciando classe Scanner:		
		Scanner leia = new Scanner(System.in);

//Variáveis:		
		float numero;
		float soma = 0;
		float contador = 0;
		float media = 0;
				
//Processamento de dados:	
		
		do {
			System.out.print("Digite um numero inteiro: ");
			numero = leia.nextFloat();
			
			if (numero == 0) {
				break;
			}
			
			if (numero > 0 && numero % 3 == 0 ) {
				soma += numero;
				contador++;
				media = soma/contador; 
			}
			
		} while (true);
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media );
		
	}
}
