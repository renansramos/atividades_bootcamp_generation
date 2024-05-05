package exercicios;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		/*Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java: 
		inicio ---> DIGITE O SALÁRIO ---> LEIA O SALÁRIO ---> DIGITE O ABONO ---> 
		LEIA O ABONO ---> NOVO SALÁRIO = SALÁRIO + ABONO  ---> EXIBE O NOVO SALARIO*/
		
		Scanner leia = new Scanner(System.in);
		
		float salario1;
		float abono;
	
		
		System.out.println("Digite o seu salario (float)");
		salario1 = leia.nextInt();
		
		System.out.println("Digite o seu abono (float)");
		abono = leia.nextInt();
		
		System.out.println("O novo sálario é: " + (salario1+abono) );
		

		leia.close();
	}

}
