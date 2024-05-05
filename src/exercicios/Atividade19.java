package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
 *construa um algoritmo que consiga pesquisar dados no vetor, onde o 
 *usuário irá digitar um número e o programa deve exibir na tela a posição 
 *deste número no vetor. Caso o número não seja encontrado, a mensagem: 
 *“Não foi encontrado!” deve ser exibida na tela. 
 */

public class Atividade19 {
	public static void main(String[] args) {
		
//Instanciando classe Scanner:		
		Scanner leia = new Scanner(System.in);
		
//Variáveis:		
		int numero_a_descobrir;

//Instanciando um vetor com 10 numeros:
		int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//Processamento de dados:
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numero_a_descobrir = leia.nextInt();
		
		
		int posicao = Arrays.binarySearch(numeros, numero_a_descobrir);
		

		 if (posicao >= 0 )
				System.out.println("\nO número 7 está localizado na posição: " + posicao);
			else
				System.out.println("\nO número " + numero_a_descobrir + " não foi encontrado!");		
	}
}