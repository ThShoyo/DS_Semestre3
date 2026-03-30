import java.util.ArrayList;

public class ArList01 {
    


    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        //Adicionar
        nomes.add("Anderson");
        nomes.add("Vanessa");
        nomes.add("Carla");

    
        //Listando
        for(int i = 0; i < nomes.size(); i++){
            System.out.println((i+1) + " - " + nomes.get(i));
        }

        //Alternar
        nomes.set(2, "edivandecidecleide");

        //Remover
        nomes.remove("Carla");
        System.out.println("=================================");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
