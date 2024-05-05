package exercicios;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	
		/*Elabore um algoritmo em Java que leia 4 notas de um participante, 
		em variáveis do tipo float e exiba na tela a média final do participante.*/
		
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("Média final: " + ((nota1+nota2+nota3+nota4)/4));
		
		leia.close();
	}

}
