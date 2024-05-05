package exercicios;

import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia um número inteiro via teclado 
 e mostre na tela uma mensagem indicando se este número é par ou ímpar 
 e se o número é positivo ou negativo. Veja os exemplos abaixo:*/
 

public class Atividade6 {
	public static void main(String[] args) {
		
//Instanciando a classe Scanner:
		Scanner leia = new Scanner(System.in);
		
//Variaveis: 		
		int numero1;
				
		System.out.println("Insira um valor numérico: ");
		numero1 = leia.nextInt();
		
		
//Processamento:
		if (numero1 % 2 == 0 && numero1 > 0) {
			System.out.println("O número " +numero1 + " é par e positivo!");
			
		} else if (numero1 % 2 == 0 && numero1  < 0   )  {
			System.out.println("O número " +numero1 + " é par e negativo!");	
			
		} else if (numero1 % 2 != 0 && numero1 > 0) {
		
		System.out.println("O número " +numero1 + " é impar e positivo!");
		
	
		} else if (numero1 % 2 != 0 && numero1 <0){
			System.out.println("O número " +numero1 + " é impar e negativo!");
		}
		leia.close();
	}

}
