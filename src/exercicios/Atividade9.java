package exercicios;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

/*
 *Com base na tabela abaixo, escreva um algoritmo em Java que leia o código 
 *de um item (número inteiro de 1 a 6) e a quantidade comprada deste item 
 *(número inteiro). A seguir, mostre na tela o valor total da conta e o 
 *nome do produto que foi comprado
*/


public class Atividade9 {
	public static void main(String[] args) {
		
// Instanciando classe Scanner:
		Scanner leia = new Scanner(System.in);
	
//Variáveis:
		int codigoProduto;
		int quantidade;
		String produto;
	
//Menu:
		System.out.println("+-------------------+-----------------+----------------+");
		System.out.println("| Código do produto | Produto         | Preço unitário |");
		System.out.println("+-------------------+-----------------+----------------+");
		System.out.println("|        1          | Cachorro Quente |    R$ 10.00    |");
		System.out.println("|        2          | X-Salada        |    R$ 15.00    |");
		System.out.println("|        3          | X-Bacon         |    R$ 18.00    |");
		System.out.println("|        4          | Bauru           |    R$ 12.00    |");
		System.out.println("|        5          | Refrigerante    |    R$ 8.00     |");
		System.out.println("|        6          | Suco de laranja |    R$ 13.00    |");
		System.out.println("+-------------------+-----------------+----------------+");
		
//Entrada:
		System.out.println("Digite o código do produto de 1 a 6: \n" );
		codigoProduto = leia.nextInt();		
	
		System.out.println("Digite a quantidade do produto: \n" );
		quantidade  = leia.nextInt();	
	
//Processamento:
		switch (codigoProduto) {
			case 1:
				produto = "Cachorro Quente";
				System.out.println("Produto: " + produto + "\n" + "Valor total: R$ " + 10 * quantidade + "\n");
				break;
			case 2:
				produto = "X-salada";
				System.out.println("Produto: " + produto + "\n" + "Valor total: R$ " + 15 * quantidade + "\n");
				break;
			case 3:
				produto = "X-bacon";
				System.out.println("Produto: " + produto + "\n" + "Valor total: R$ " + 18 * quantidade + "\n");
				break;
			case 4:
				produto = "Bauru";
				System.out.println("Produto: " + produto + "\n" + "Valor total: R$ " + 12 * quantidade + "\n");
				break;
			case 5:
				produto = "Refrigerante";
				System.out.println("Produto: " + produto + "\n" + "Valor total: R$ " + 8 * quantidade + "\n");
				break;
			case 6:
				produto = "Suco de Laranja";
				System.out.println("Produto: " + produto + "\n" + "Valor total: R$ " + 13 * quantidade + "\n");
				break;
			}
		leia.close();
	}
}
