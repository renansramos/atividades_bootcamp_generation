package exercicios;

import java.util.Scanner;

/*
 *Escreva um algoritmo em Java, que leia 3 palavras (String), 
 *que definem as características de um tipo de animal 
 *possível segundo o diagrama abaixo, que deve ser lido da 
 *esquerda para a direita.
*/

public class Atividade8 {
	public static void main(String[] args) {
		
//Instanciando classe Scanner:
		Scanner leia = new Scanner(System.in);
		
//Variáveis:
		String palavra1, palavra2, palavra3;

//Entrada de dados 
		System.out.println("Insira a palavra 1: \n");
		palavra1 = leia.nextLine();
		
		System.out.println("Insira a palavra 2: \n");
		palavra2 = leia.nextLine();
		
		System.out.println("Insira a palavra 3: \n");
		palavra3 = leia.nextLine();
		
		
//Processamento (Fluxos possíveis):	
		if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnivoro")) {
			System.out.println("Águia\n");
			
		}  if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onivoro") ) {
			System.out.println("Pomba\n");
			
		} else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("onívoro")) {
			System.out.println("Homem\n");
			
		} else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamifero") && palavra3.equalsIgnoreCase("herbivoro")) {
			System.out.println("Vaca\n");
			
		} else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hematofago")) {
			System.out.println("Pulga\n");
			
		} else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herbivoro")) {
			System.out.println("Lagarta\n");
			
		} else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelideo") && palavra3.equalsIgnoreCase("hematofago")) {
			System.out.println("Sangue Suga\n");
			
		}else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anelideo") && palavra3.equalsIgnoreCase("onivoro")) {
			System.out.println("Minhoca\n");
			
		} else {
			System.out.println("Não é válido!");
		}
		
		leia.close();	
	}
}
