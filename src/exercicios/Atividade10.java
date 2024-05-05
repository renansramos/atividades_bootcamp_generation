package exercicios;

import java.util.Scanner;

/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome 
 * do Colaborador (String), o Código do Cargo do Colaborador (número 
 * inteiro de 1 a 6) e o Salário (número float). A seguir, mostre na tela 
 * o Nome do Colaborador, o Cargo e o novo Salário reajustado.
*/

public class Atividade10 {

	public static void main(String[] args) {
		
//variáveis:
		String nome;
		String nomeCargo;
		int codigoCargo;
		float  salario;

//Instanciando classe Scanner:
		Scanner leia = new Scanner(System.in);
		
//Menu:
		System.out.println("+-------------------+-----------------+-----------------------+");
		System.out.println("| Código do cargo   | Cargo           | Percentual de reajuste|");
		System.out.println("+-------------------+-----------------+-----------------------+");
		System.out.println("|        1          | Gerente         |          10%          |");
		System.out.println("|        2          | Vendedor        |           7%          |");
		System.out.println("|        3          | Supervisor      |           9%          |");
		System.out.println("|        4          | Motorista       |           6%          |");
		System.out.println("|        5          | Estoquista      |           5%          |");
		System.out.println("|        6          | Técnico de TI   |           8%          |");
		System.out.println("+-------------------+-----------------+-----------------------+");
		
//Entrada de dados:
		System.out.println("Digite o nome do colaborador: \n");
		nome = leia.nextLine();
		
		System.out.println("Digite o Código do cargo: \n");
		codigoCargo = leia.nextInt();
		
		System.out.println("Digite o seu salário: \n");
		salario = leia.nextFloat();
		
//Processamento:
		switch (codigoCargo) {
		case 1:
			nomeCargo ="Gerente";
			System.out.println("Nome do colaborador: "  + nome + "\n"+ "Cargo: " + nomeCargo +"\n" + "Salário: R$ " + ((salario) + 0.1 * salario));
			break;
		case 2:
			nomeCargo ="Vendedor";
			System.out.println("Nome do colaborador: "  + nome + "\n" + "Cargo: " + nomeCargo +"\n" + "Salário: R$ " + ((salario) + 0.07 * salario));
			break;
		case 3:
			nomeCargo ="Supervisor";
			System.out.println("Nome do colaborador: " + nome + "\n" + "Cargo: " + nomeCargo +"\n" + "Salário: R$ " + ((salario) + 0.09 * salario));
			break;
		case 4:
			nomeCargo ="Motorista";
			System.out.println("Nome do colaborador: " + nome + "\n" + "Cargo: " + nomeCargo +"\n" + "Salário: R$ " + ((salario) + 0.06 * salario));
			break;
		case 5:
			nomeCargo ="Estoquista";
			System.out.println("Nome do colaborador: " + nome + "\n" + "Cargo: " + nomeCargo +"\n" + "Salário: R$ " + ((salario) + 0.05 * salario));
			break;
		case 6:
			nomeCargo ="Técnico de TI";
			System.out.println("Nome do colaborador: " + "\n" + nome + "\n" + "Cargo: " + nomeCargo + "\n" + "Salário: R$ " + ((salario) + 0.08 * salario));
			break;
		}
	leia.close();
	}

}
