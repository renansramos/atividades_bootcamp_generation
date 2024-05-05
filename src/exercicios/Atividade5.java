package exercicios;

import java.util.Scanner;

/*
 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e
 * imprima na tela se a soma de A + B é maior, menor ou igual a C.
*/

public class Atividade5 {

	public static void main(String[] args) {
		
// Instanciando classe Scanner:	
		Scanner leia = new Scanner(System.in);
		
//Variaveis 
		int numero1;
		int numero2;
		int numero3;
		
//Entrada de dados 
		System.out.println("Insira o primeiro valor (Int): ");
		numero1 = leia.nextInt();
		
		System.out.println("insira o segundo valor (Int): ");
		numero2 = leia.nextInt();
		
		System.out.println("Insira o segundo valor (Int): ");
		numero3 = leia.nextInt();
		
//Processamento
		int soma1 = numero1 + numero2;
		
		
		if (soma1 > numero3) {
			System.out.println((numero1) + " + " +(numero2) + " = " + (numero3) + " < " + (soma1) + "\n" + "A Soma de A + B é maior do que a C");
		}
		
		if (soma1 < numero3) {
			System.out.println((numero1) + " + " +(numero2) + " = " + (numero3) + " < " + (soma1) + "\n" + "A Soma de A + B é menor do que C");
		}
		
		if (soma1 == numero3) {
			System.out.println((numero1) + " + " +(numero2) + " = " + (numero3) + " = " + (soma1) + "\n" + "A Soma de A + B é igual a C");
		}
	}

}
