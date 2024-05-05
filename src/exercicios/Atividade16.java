package exercicios;

import java.util.Scanner;

/*
	Uma empresa desenvolveu uma pesquisa interna para conhecer os 
	colaboradores da área de Desenvolvimento e precisam de um 
	sistema para analisar os dados. Escreva um algoritmo em Java, 
	que leia via teclado as seguintes informações de cada 
	colaborador:
	
	--> Idade (Número inteiro)
	--> Identidade de Gênero (Número Inteiro): 
	--> 1 – Mulher Cis
	--> 2 – Homem Cis
	--> 3 – Não Binário
	--> 4 – Mulher Trans
	--> 5 – Homem Trans
	--> 6 – Outros
	--> Pessoa Desenvolvedora (Número Inteiro):
	--> 1 – Backend
	--> 2 – Frontend
	--> 3 – Mobile
	--> 4 – FullStack
	
	Após digitar a categoria, o sistema deverá perguntar ao usuário
	se ele deseja continuar a leitura dos dados de um novo 
	colaborador ou não (S/N). Caso seja pressionada a tecla N, 
	mostre na tela:
	
	--> O número de pessoas desenvolvedoras Backend
	--> O número de Mulheres Cis e Trans desenvolvedoras Frontend
	--> O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
	--> O número de Não Binários desenvolvedores FullStack menores de 30 anos
	--> O número total de pessoas que responderam à pesquisa
	--> A média de idade das pessoas que responderam à pesquisa
	
	Na construção do Algoritmo, utilize os seguintes conteúdos:
	--> Entrada e Saída de dados
	--> Operadores
	--> Laços Condicionais
	--> Laço de Repetição WHILE

*/

public class Atividade16 {
	public static void main(String[] args) {
			
//Instanciando classe Scanner:		
		Scanner leia = new Scanner(System.in);		
	
//Variáveis:		
		int idade;
		String identida_de_De_Genero;
		String codigo_Identidade;
		String desenvolvedor;
		String codigo_desenvolvedor;
		String resposta = "";
		
//Variáveis para calcular o total de entredas:
		int contador_mulher_cis = 0;
		int contador_homem_cis = 0;
		int contador_nao_binario = 0;
		int contador_mulher_trans = 0;
		int contador_homem_trans = 0;
		int contador_outros = 0;
		
		int contador_backend = 0;
		int contador_frontend = 0;
		int contador_mobile = 0;
		int contador_fullstack = 0;
		
//Total para saber quem respondeu a pesquisa:	
		int total_pesquisa = 0;
//Soma para somar a quantidade de idades e fazer a média:
		int soma = 0;
		
		
//Processamento de dados;	

		while (!resposta.equals("n")){
//Idade
					System.out.println("Idade: ");
					idade = leia.nextInt();
					total_pesquisa++;
					soma += idade;
								
//Identidade de genêro:
					
					System.out.println("+--------+-----------------+");
					System.out.println("| Código | Produto         |");
					System.out.println("+--------------------------+");
					System.out.println("|   1    | Mulher Cis      |");
					System.out.println("|   2    | Homem Cis       |");
					System.out.println("|   3    | Não Binário     |");
					System.out.println("|   4    | Mulher Trans    |");
					System.out.println("|   5    | Homem Trans     |");
					System.out.println("|   6    | Outros          |");
					System.out.println("+--------+-----------------+");
					
					
					System.out.println("Identidade de Gênero: \n" );
					codigo_Identidade = leia.next();	
					
					switch (codigo_Identidade) {
						case "1":
							identida_de_De_Genero = "Mulher Cis";
							contador_mulher_cis++;
							
							
							break;
						case "2":
							identida_de_De_Genero = "Homem Cis";
							contador_homem_cis++;
							break;
						case "3":
							identida_de_De_Genero = "Não Binário";
							contador_nao_binario++;
							break;
						case "4":
							identida_de_De_Genero = "Mulher Trans";
							contador_mulher_trans++;						
							break;
						case "5":
							identida_de_De_Genero = "Homem Trans";	
							contador_homem_trans++;
							break;
						case "6":
							identida_de_De_Genero = "outros";
							contador_outros++;
							break;
					}
					
//Pessoa Desenvolvedora:
					
					System.out.println("+--------+--------------+");
					System.out.println("| Código | Desenvolvedor|");
					System.out.println("+-----------------------+");
					System.out.println("|   1    | Backend      |");
					System.out.println("|   2    | Frontend     |");
					System.out.println("|   3    | Mobile       |");
					System.out.println("|   4    | FullStack    |");
					System.out.println("+--------+--------------+");
					
					System.out.println("Pessoa Desenvolvedora: \n" );
					codigo_desenvolvedor = leia.next();	
					
					switch (codigo_desenvolvedor) {
						case "1":
							desenvolvedor = "Backend";
							contador_backend++;
							break;
						case "2":
							desenvolvedor = "Frontend";
							contador_frontend++;
							break;
						case "3":
							desenvolvedor = "Mobile ";
							contador_mobile++;
							break;
						case "4":
							desenvolvedor = "FullStack";
							contador_fullstack++;
							break;
					}
					
					System.out.println("\nDeseja continuar a leitura dos dados de um novo colaborador (S/N): ");
					resposta = leia.next();	
					
//Saída:
					System.out.println("Total de pessoas desenvolvedoras Backend: " + contador_backend);
					System.out.println("O número total de pessoas que responderam à pesquisa: " + total_pesquisa);
					System.out.println("A média de idade das pessoas que responderam à pesquisa: " + soma / total_pesquisa );	

					
//				    System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: ");
//				    System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: ");
//				    System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: ");
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}				
	}
}

