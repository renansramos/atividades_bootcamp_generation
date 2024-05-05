package exercicios;

import java.util.Scanner;

/*Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá 
 *ler o tipo de operação a ser realizada com base na tabela abaixo (número 
 *inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas 
 *opções 2 e 3). Considere que um saque só pode ser realizado caso haja saldo 
 *suficiente. Ao final de cada operação, exiba o novo Saldo na tela. A 
 *variável saldo (float), será inicializada com o valor de R$ 1000.00. Caso a
 *operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
*/

public class Atividade12 {
	public static void main(String[] args) {
		
//Variáveis:	
		int operacao;
		float saldo = 1000;
		float valorDaOperacao = 0;
		
//Instanciando classe Scanner:		
		Scanner leia = new Scanner(System.in);
		
//Entrada de dados / Menu:
		 System.out.println("====== Menu Conta Bancária ======");
		 System.out.println("| Código:  | Operação:          |");
         System.out.println("|    1     | Verificar saldo    |");
         System.out.println("|    2     | Sacar              |");
         System.out.println("|    3     | Depositar          |");
         System.out.println("=================================");
         System.out.print("Escolha uma opção (1-4): ");
         operacao = leia.nextInt();
		
//Processamento:	     
         switch (operacao) {
         	case 1: 
         		System.out.println("Operação - Saldo\n" + "Saldo: R$ " + saldo); 
         		break;
         	case 2:
         		if (saldo > 0) {
         			System.out.println("Digite o valor a ser sacado: ");
         			valorDaOperacao = leia.nextFloat();
         		         			
         		
         			if (valorDaOperacao < saldo) {
         				System.out.println("Operação - Saque: \n" + "Novo Saldo: R$ " + (saldo - valorDaOperacao));
         			} else {
         				System.out.println("Operação - Saque: \n" + "Saldo Insuficiente!");
         			}
         			
         		} else {
         			System.out.println("Operação - Saque: \n" + "Saldo Insuficiente!");
         			
         		}
         		break;
         		
         	case 3:
         		System.out.println("Digite o valor a ser depositado: ");
         		valorDaOperacao = leia.nextFloat();
         		
         		System.out.println("Operação- Depósito: \n" + "Novo saldo: R$ " + (saldo + valorDaOperacao) );
         		break; 		
         		
         	default:
         		System.out.println("Operação Inválida!");
         }
         leia.close();	
	}
}
