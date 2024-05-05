package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
 
 Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
 - Todos os elementos dos índices ímpares do vetor 
 - Todos os elementos do vetor que são números pares
 - A Soma de todos os elementos do vetor
 - A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

*/

public class Atividade20 {

	public static void main(String[] args) {
		
//Instanciando um vetor com 10 posições:
		
		Integer vetor_numeros[] = new Integer [10];
		//Sintaxe de um Vetor sem dados:
		//tipo_de_dado nome_do_vetor[] = new tipo_de_dado[tamanho];

//Instanciando classe Scanner:	
		Scanner leia = new Scanner(System.in);
		
//Processamento de dados:	
		
		//Armazenando input de dados no vetor_numeros
		for(int indice = 0; indice < 10; indice ++) {
            System.out.println("Digite 10 numeros: \n");
            vetor_numeros[indice] = leia.nextInt();
        }
		
		
		//Exibindo elementos presentes em indices ímpares:
		System.out.print("Elementos nos índices ímpares: ");
		for (int i = 1 ; i < vetor_numeros.length;i += 2) {
        	System.out.print(vetor_numeros[i] );	
		}	
		
		//Elementos pares do vetor:
		System.out.print("\nElementos pares:");
		for (int numero : vetor_numeros) {
			if (numero % 2 == 0) { 
				System.out.print(numero);
			}
		}
		
		//Fazendo a soma dos elementos do vetor_numeros:
		int soma = 0;

		for (int numero : vetor_numeros) {
		    soma += numero;
		}

		System.out.println("\nSoma: " + soma);
		
		//Media dos elementos do vetor:
		double soma_media = 0;

		for (int numero : vetor_numeros) {
		    soma_media += numero;
		}

		double media = soma_media / vetor_numeros.length;

		System.out.println("Média: " + media);
	}
		
}
			



//                System.out.println("Índice " + i + ": " + vetor_numeros[i]);