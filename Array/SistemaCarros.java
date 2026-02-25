import java.util.Scanner;

public class SistemaCarros {
    
    static String[] carros = new String[10];
    static int totalCarros = 0;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(opcao) {
                case 1:
                    cadastrarCarro();
                    break;
                case 2:
                    listarCarros();
                    break;
                case 3:
                    alterarCarro();
                    break;
                case 4:
                    removerCarro();
                    break;
                case 5:
                    System.out.println("\nPrograma finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
            }
        } while(opcao != 5);
        
        scanner.close();
    }
    
    static void exibirMenu() {
        System.out.println("\n===== SISTEMA DE CARROS =====");
        System.out.println("1. Cadastrar carro");
        System.out.println("2. Listar carros");
        System.out.println("3. Alterar carro");
        System.out.println("4. Remover carro");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    static void cadastrarCarro() {
        if(totalCarros >= carros.length) {
            System.out.println("\nCapacidade máxima de carros atingida (10)!\n");
            return;
        }
        
        System.out.print("\nDigite o nome do carro: ");
        String nome = scanner.nextLine();
        
        if(nome.trim().isEmpty()) {
            System.out.println("Nome não pode estar vazio!\n");
            return;
        }
        
        carros[totalCarros] = nome;
        totalCarros++;
        System.out.println("Carro cadastrado com sucesso!\n");
    }
    
    static void listarCarros() {
        if(totalCarros == 0) {
            System.out.println("\nNenhum carro cadastrado!\n");
            return;
        }
        
        System.out.println("\n===== LISTA DE CARROS =====");
        for(int i = 0; i < totalCarros; i++) {
            System.out.println((i + 1) + ". " + carros[i]);
        }
        System.out.println();
    }
    
    static void alterarCarro() {
        if(totalCarros == 0) {
            System.out.println("\nNenhum carro cadastrado!\n");
            return;
        }
        
        listarCarros();
        
        System.out.print("Digite o número do carro a alterar: ");
        int posicao = scanner.nextInt();
        scanner.nextLine();
        
        if(posicao < 1 || posicao > totalCarros) {
            System.out.println("\nPosição inválida!\n");
            return;
        }
        
        System.out.print("Digite o novo nome do carro: ");
        String novoNome = scanner.nextLine();
        
        if(novoNome.trim().isEmpty()) {
            System.out.println("Nome não pode estar vazio!\n");
            return;
        }
        
        carros[posicao - 1] = novoNome;
        System.out.println("Carro alterado com sucesso!\n");
    }
    
    static void removerCarro() {
        if(totalCarros == 0) {
            System.out.println("\nNenhum carro cadastrado!\n");
            return;
        }
        
        listarCarros();
        
        System.out.print("Digite o número do carro a remover: ");
        int posicao = scanner.nextInt();
        scanner.nextLine();
        
        if(posicao < 1 || posicao > totalCarros) {
            System.out.println("\nPosição inválida!\n");
            return;
        }
        
    
        for(int i = posicao - 1; i < totalCarros - 1; i++) {
            carros[i] = carros[i + 1];
        }
        
        carros[totalCarros - 1] = null;
        totalCarros--;
        System.out.println("Carro removido com sucesso!\n");
    }
}
