package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//	1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//	2: Listar todos os Clientes na fila
//	3: Chamar (retirar) uma pessoa da fila 
//	0: O programa deve ser finalizado. 
//Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..



public class Atividade25 {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            System.out.println("*************************************************");
            System.out.println("                                                 ");
            System.out.println("     1: Adicionar cliente a fila                 ");
            System.out.println("     2: Listar todos os clientes na fila         ");
            System.out.println("     3: Chamar (retirar) um cliente da fila      ");
            System.out.println("     0: Sair do programa                         ");
            System.out.println("                                                 ");
            System.out.println("*************************************************");
            
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    filaClientes.offer(nomeCliente);
                    System.out.println("Fila: ");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    System.out.println("Cliente adicionado!");
                    break;
                case 2:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("\nLista de Clientes na Fila: ");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("O Cliente" + clienteChamado + " foi Chamado!");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
