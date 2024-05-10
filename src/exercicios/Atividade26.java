package exercicios;

import java.util.Scanner;
import java.util.Stack;

//Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//	1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
//	2: Listar todos os livros da Pilha
//	3: Retirar um livro da pilha 
//	0: O programa deve ser finalizado. 
//Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.


public class Atividade26 {
    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
        	System.out.println("*************************************************");
            System.out.println("                                                 ");
            System.out.println("     1: Adicionar Livro na Pilha                 ");
            System.out.println("     2: Listar todos os Livros                   ");
            System.out.println("     3: Retirar Livro da Pilha                   ");
            System.out.println("     0: Sair do programa                         ");
            System.out.println("                                                 ");
            System.out.println("*************************************************");
            
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("Pilha: ");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("\nPilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro " + livroRetirado + " foi retirado da pilha.");
                        System.out.println("Pilha: ");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
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