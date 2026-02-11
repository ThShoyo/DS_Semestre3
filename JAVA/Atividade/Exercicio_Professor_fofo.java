package Atividade;

import java.util.Scanner;

public class Exercicio_Professor_fofo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        do {
            System.out.print("Digite o nome do professor mais fofo do Senai: ");
            nome = sc.nextLine().trim();
            
            if (!nome.equalsIgnoreCase("Anderson")) {
                System.out.println("Nome incorreto. Tente novamente.");
            }
        
        } while (!nome.equalsIgnoreCase("Anderson"));
        System.out.println("Programa encerrado.");
        sc.close();
    }
}