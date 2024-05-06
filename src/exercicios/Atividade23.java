package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
	Escreva um programa Java para criar uma Collection ArrayList de Objetos  
	da Classe String. O programa deverá solicitar ao usuário, que ele 
	digite via teclado 5 cores e deverá adicioná-las individualmente no 
	ArrayList. Em seguida, faça o que se pede:
	
	 - Mostre na tela todas as cores que foram adicionadas. 
	 - Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
*/

public class Atividade23 {

	public static void main(String[] args) {

		
//Cria a Collection ArrayList chamada cores:
		ArrayList<String> cores = new ArrayList<>();
		
//Instanciando classe Scanner:	
		Scanner leia = new Scanner(System.in);		
		
//Processamento de dados:	
		while (cores.size() <= 5) {
            System.out.print("Insira uma cor: ");
            String item = leia.nextLine();
            
// Adiciona o item à lista:
            cores.add(item);
        }
		
		System.out.println("Listar todas as cores:");
        for (String item : cores) {
            System.out.println(item);
        }
        
        Collections.sort(cores);
        System.out.println("\nOrdenar as cores:");
        for (String item : cores) {
            System.out.println(item);
        }
// Fecha o scanner:
        leia.close();
				
		
	}

}
