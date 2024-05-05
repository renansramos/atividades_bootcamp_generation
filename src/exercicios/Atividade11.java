package exercicios;

import java.util.Scanner;

/*
 * Com base na tabela abaixo, escreva um algoritmo em Java, que simule 
 * uma Calculadora simples. O programa deverá ler dois números float: 
 * numero1 e numero2, e na sequência ler o Código da operação matemática 
 * (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da 
 * operação entre os 2 números. Caso a operação seja diferente do 
 * intervalo 1 a 4, mostre a mensagem Operação Inválida!
*/

public class Atividade11 {
		
	public static void main(String[] args) {
		
//Variáveis:
		float numero1;
		float numero2;
		int numeroOperacao;
				
//Instanciando classe Scanner:
		Scanner leia = new Scanner(System.in);

//Exibição Usuário:
		System.out.println("+------------------------------------------------------+");
		System.out.println("|              Calculadora Generation                  |");
		System.out.println("+----------+----------+----------+----------+----------+");
		System.out.println("|    7     |    8     |    9     |    +     |    -     |");
		System.out.println("+----------+----------+----------+----------+----------+");
		System.out.println("|    4     |    5     |    6     |    *     |    /     |");
		System.out.println("+----------+----------+----------+----------+----------+");
		System.out.println("|    1     |    2     |    3     |    =     |    C     |");
		System.out.println("+----------+----------+----------+----------+----------+");
		System.out.println("|    0     |    .     |    %     |    (     |    )     |");
		System.out.println("+----------+----------+----------+----------+----------+");
			
//Entrada de dados:
		System.out.println("Digite o 1º número: \n");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número: \n");
		numero2 = leia.nextFloat();
		
		System.out.println("Operação: ");
		
//Exibição Usuário:
		System.out.println("+---+---------------------------+");
		System.out.println("|Operação |  Operações Básicas  |");
		System.out.println("+---------+---------------------+");
		System.out.println("|   1     |  +   Adição         |");
		System.out.println("|   2     |  -   Subtração      |");
		System.out.println("|   3     |  *   Multiplicação  |");
		System.out.println("|   4     |  /   Divisão        |");
		System.out.println("+---+---------------------------+");
		numeroOperacao = leia.nextInt();
		
//Processamento:	
		switch (numeroOperacao) {
			case 1:
				System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
				break;
			case 2:
				System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
				break;
			case 3:
				System.out.println(numero1 + " * " + numero2 + " = " + (numero1*numero2));
				break;
			case 4:
				System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2));
				break;
			default: 
				System.out.println("Operação Inválida!");
			}
	   leia.close();				
	}
}
