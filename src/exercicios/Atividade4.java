package exercicios;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {	
	/*Leia quatro valores float (n1, n2, n3, n4). 
	A seguir, calcule e mostre a diferença do 
	produto entre o n1 e n2 pelo produto entre 
	o n3 e o n4. Veja os exemplos abaixo:*/
	Scanner leia = new Scanner(System.in);
	
	float numero1;
	float numero2;
	float numero3;
	float numero4;
	
	System.out.println("Insira o primeiro número: ");
	numero1 = leia.nextFloat();
	
	System.out.println("Insira o segundo número: ");
	numero2 = leia.nextFloat();
	
	System.out.println("Insira o terceiro número: ");
	numero3 = leia.nextFloat();
	
	System.out.println("Insira o quarto número: ");
	numero4 = leia.nextFloat();
		
	System.out.println("Diferença: " + ((numero1 * numero2 ) - (numero3 * numero4)));
		
	leia.close();
	}
}
