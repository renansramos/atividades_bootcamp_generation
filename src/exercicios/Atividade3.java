package exercicios;

import java.util.Scanner;

public class Atividade3 {
	
	/*Elabore um algoritmo em Java, que leia o Salário Bruto, 
	o Adicional Noturno, as Horas Extras e os Descontos de 
	um Colaborador, em variáveis do tipo float e exiba na 
	tela o Salário Líquido. Veja o exemplo abaixo:*/
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	float salarioBruto;
	float adicionalNoturno;
	float horaExtra;
	float descontos;
	
	
	System.out.println("Digite o salário bruto: ");
	salarioBruto = leia.nextFloat();
	
	System.out.println("Digite o adicional noturno: ");
	adicionalNoturno = leia.nextFloat();
	
	System.out.println("Digite o valor da hora extra: ");
	horaExtra = leia.nextFloat();
	
	System.out.println("Digite os descontos: ");
	descontos = leia.nextFloat();
	
	System.out.println("Salário Liquido: " + (salarioBruto + adicionalNoturno + (horaExtra*5) - descontos));
	
	leia.close();
	
	
	}
}
