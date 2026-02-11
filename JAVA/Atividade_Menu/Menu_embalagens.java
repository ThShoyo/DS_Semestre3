package Atividade_Menu;

import java.util.Scanner;

public class Menu_embalagens {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
    
        int opcao = 0;
    
        while (opcao != 4) {

            System.out.println("\n=== MENU DE EMBALAGENS ===");
            System.out.println("1. Caixa de Papelão");
            System.out.println("2. Sacola Plástica");
            System.out.println("3. Embalagem de Vidro");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            
         
            opcao = sc.nextInt();
            
           
            switch (opcao) {
                case 1:
                    System.out.println("\n--- Caixa de Papelão ---");
                    System.out.println("Ideal para transporte e armazenamento");
                    System.out.println("Vantagens: Leve, biodegradável, fácil de armazenar");
                    break;
                    
                case 2:
                    System.out.println("\n--- Sacola Plástica ---");
                    System.out.println("Leve e prática, mas pouco sustentável");
                    System.out.println("Vantagens: Barata, resistente");
                    System.out.println("Desvantagens: Prejudicial ao ambiente");
                    break;
                    
                case 3:
                    System.out.println("\n--- Embalagem de Vidro ---");
                    System.out.println("Resistente e reutilizável");
                    System.out.println("Vantagens: Durável, não contamina, pode ser reciclado");
                    System.out.println("Desvantagens: Mais pesada e frágil");
                    break;
                    
                case 4:
                    System.out.println("\nPrograma encerrado. Até logo!");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        
     
        sc.close();
    }
}

