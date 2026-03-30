import java.util.ArrayList;
import java.util.Scanner;

public class ArList03 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
    
        //Adicionar
        for(int i=0; i<3; i++){
            System.err.println("informe o nome "+(i+1));
            nomes.add(sc.nextLine());
        }
        //listando
        for(int i=0;i<nomes.size();i++){
            System.out.println(i+1+" - "+nomes.get(i));
        }

        //Alternar
        int indiceAlterar;
        do {
            System.out.println("\ninforme o indice que deseja alterar (1-"+nomes.size()+")");
            indiceAlterar = sc.nextInt();
            sc.nextLine();
            if (indiceAlterar < 0 || indiceAlterar > nomes.size()) {
                System.out.println("Índice inválido!");
            }
        }while (indiceAlterar < 0 || indiceAlterar > nomes.size());
        System.out.println("Digite o novo nome:");
        String novoNome = sc.nextLine();

        nomes.set(indiceAlterar, novoNome);
        System.out.println("Nome alterado com sucesso!");
        
        //Remover
        int indice;
        do {
            System.err.println("informe o indice que deseja remover");
            indice = sc.nextInt();

            if (indice<0 || indice>nomes.size()) {
                System.out.println("Índice inválido!");
            }

        }while (indice < 0 || indice > nomes.size());
        nomes.remove(indice);
        System.out.println("Nome removido");
    
        for(String nome : nomes){
            System.out.println(nome);
        }
       
        sc.close();
    }
}