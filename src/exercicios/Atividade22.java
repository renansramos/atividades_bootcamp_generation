package exercicios;

import java.util.Scanner;

/*
 
 Elabore um algoritmo que leia as notas de uma classe com 10 participantes 
 durante 4 bimestres de um ano. As 4 notas de cada participante serão 
 armazenadas em uma linha de uma matriz de números reais, logo cada linha 
 da matriz serão as notas de um participante. Em um vetor de números reais, 
 armazene as médias de cada participante e exiba as médias de cada um na tela.
 
 */

public class Atividade22 {

	public static void main(String[] args) {

		
//Instanciando classe Scanner:	
		Scanner leia = new Scanner(System.in);
				
//Processamento de dados:	
		
		//Instanciando uma matriz para receber notas:
		int participantes = 10;
		int bimestres = 4;
		float[][] notas = new float[participantes][bimestres];
		
		// Instanciar o vetor para armazenar as médias
		float[] medias = new float[participantes];
		
		// Loop para ler as notas dos participantes
        for (int i = 0; i < participantes; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            for (int j = 0; j < bimestres; j++) {
                System.out.print("Nota do bimestre " + (j + 1) + ": ");
                notas[i][j] = leia.nextFloat();
            }
        }
        
     	// Calcular as médias de cada participante e armazenar no vetor
        for (int i = 0; i < participantes; i++) {
            float soma = 0;
            for (int j = 0; j < bimestres; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / bimestres;
        }
		
        // Exibir as médias de cada participante
        System.out.print("Vetor: " );
        for (int i = 0; i < participantes; i++) {
        	System.out.print(medias[i]);
        }

        leia.close();	
	}

}
