package exercicios;

import java.util.Iterator;
import java.util.Scanner;

/*
 *Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde 
 *o primeiro número deve ser menor do que o segundo número. Caso contrário, 
 *deve ser exibida uma mensagem na tela informando que o intervalo é inválido 
 *e sair do programa. No intervalo informado, mostre na tela todes os números 
 *que são múltiplos de 3 e 5. 
*/

public class Atividade13 {
	public static void main(String[] args) {
		
//Instanciando classe Scanner:	
		Scanner leia = new Scanner(System.in);
		
//Variáveis:
		int variavel1, variavel2;

//Entrada de Dados:
		System.out.println("Digite o primeiro número do intervalo: ");
		variavel1 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		variavel2 = leia.nextInt();
		
		
//Processamento de dados:
		if (variavel1 > variavel2) {
			System.out.println("O intervalo é inválido");
		} else {
			System.out.println("No Intervalo entre " + variavel1 + " e " + variavel2 + ":\n");
			for (int i = 1; i <= variavel2; i++){
				
				if (i % 3 == 0 && i % 5 ==0) {
					
					System.out.println(i + " é múltiplo de 3 e 5");
				}		
			}
			
		 }
	}
}


