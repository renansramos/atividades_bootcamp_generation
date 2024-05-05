package exercicios;

import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia a idade 
 *de várias pessoas (números inteiros), via 
 *teclado e mostre na tela o total de pessoas 
 *cuja idade seja menor que 21 anos e o total de
 * pessoas cuja idade seja maior que 50 anos. A 
 * leitura dos dados deve ser finalizada ao 
 * digitar uma idade negativa.
*/

public class Atividade15 {
	public static void main(String[] args) {
		
//Instanciando classe Scanner:		
		Scanner leia = new Scanner(System.in);
				
//Variáveis:		
		int total1 = 0;
		int total2 =0;
		int idade;

//Exibir para o usuário:		
		System.out.print("Digite 10 idades:\n");
		
		System.out.print("Digite uma idade: ");          
        idade = leia.nextInt();
		
		
//Processamento de dados com laço WHILE;	
        
		while (!(idade<0)) {
			System.out.print("Digite uma idade: ");          
	        idade = leia.nextInt();
		
	        if (idade < 21 && idade > 0) {
	            total1++;
	        } else if (idade > 50) {
	            total2++;
	        }    
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + total1 + "\n");
		System.out.println("Total de pessoas maiores de 50 anos: " + total2);

		leia.close();
		
	}
}

