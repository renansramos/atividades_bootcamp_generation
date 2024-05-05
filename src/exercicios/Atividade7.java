package exercicios;

import java.util.Scanner;

/*
 *Para doar sangue é necessário ter entre 18 e 69 anos de idade.
 *Pessoas com idade entre 60 e 69 anos, só podem doar se não for 
 *a sua primeira doação. Escreva um Algoritmo em Java que obtenha 
 *via teclado o nome do doador (String), a idade (inteiro) do 
 *doador e se é a primeira doação (boolean). De acordo com as 
 *Regras para a doação, mostre na tela se o doador está Apto ou 
 *Não Apto para doar sangue. Veja os exemplos abaixo:
*/

public class Atividade7 {
	public static void main(String[] args) {
		
//Instanciando a Classe Scanner:
		Scanner leia = new Scanner(System.in);

//Váriaveis:
		String nomeString;
		int idade;
		boolean doacao;
		
//Entrada de dados:
		System.out.println("Digite o nome do doador: \n");
		nomeString = leia.nextLine();
		
		System.out.println("Digite a idade do doador: \n" );
		idade = leia.nextInt();		
		
		System.out.println("Primeira doação de Sangue? \n");
		doacao = leia.nextBoolean();
		
//Procesamento:	
		if (idade >= 60 && idade <= 69 && doacao == true) {
			 System.out.println(nomeString + " não está apto para doar sangue! ");
		} else if (idade >= 18 && idade <= 69){
			System.out.println(nomeString + " está apto para doar sangue! ");
			
		} else {
			System.out.println(nomeString + " não está apto para doar sangue! ");
		}	
		leia.close();
	}
}
