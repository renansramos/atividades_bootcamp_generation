package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	Escreva um programa Java para criar uma Collection Set de Objetos 
	da Classe Wrapper Integer. O programa deverá solicitar ao usuário, 
	que ele digite via teclado 10 valores inteiros não repetidos e 
	adicione-os individualmente na Collection Set. Em seguida, 
	faça o que se pede:

		- Mostre na tela todos os elementos da Collection Set, 
	  	  utilizando a Classe Iterator. 
*/

public class Atividade24 {

	public static void main(String[] args) {

// Cria a Collection Set, do tipo Integer chamada setNumero:
		Set<Integer> setNumero = new HashSet<>();
		
		
//Instanciando classe Scanner:	
		Scanner leia = new Scanner(System.in);	
		
//Processamento:
        System.out.println("Digite 10 valores inteiros não repetidos:");
        for (int i = 0; i < 10; i++) {
            int valor;
            do {
                System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
                valor = leia.nextInt();
                if (!setNumero.add(valor)) {
                    System.out.println("Valor já inserido. Digite outro valor.");
                }
            } while (setNumero.size() <= i); 
        }
		
// Mostra na tela todos os elementos da Collection Set, utilizando a Classe Iterator
        System.out.println("\nListar dados do set:");
        Iterator<Integer> iterator = setNumero.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		 
// Fecha o scanner
        leia.close();
		
	}

}
