package Atividade_Menu;

import java.util.Scanner;

public class Menu_Canetas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int opcao = 0;
        
       
        while (opcao != 4) {
    
            System.out.println("\n=== MENU DE CANETAS ===");
            System.out.println("1. Caneta Esferográfica");
            System.out.println("2. Caneta Gel");
            System.out.println("3. Caneta Tinteiro");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            
     
            opcao = sc.nextInt();
             
            switch (opcao) {
                case 1:
                    System.out.println("\n--- Caneta Esferográfica ---");
                    System.out.println("Econômica e de longa duração");
                    System.out.println("Vantagens: Barata, durável, não seca facilmente");
                    System.out.println("Uso: Perfeita para o dia a dia");
                    break;
                    
                case 2:
                    System.out.println("\n--- Caneta Gel ---");
                    System.out.println("Tinta mais pigmentada e escrita suave");
                    System.out.println("Vantagens: Escrita macia, cores vibrantes");
                    System.out.println("Uso: Ideal para quem escreve muito e gosta de conforto");
                    break;
                    
                case 3:
                    System.out.println("\n--- Caneta Tinteiro ---");
                    System.out.println("Clássica e elegante, usada para caligrafia");
                    System.out.println("Vantagens: Traço fino e preciso, aspecto sofisticado");
                    System.out.println("Uso: Documentos formais, caligrafia artística");
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

