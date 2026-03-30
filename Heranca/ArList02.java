import java.util.ArrayList;


public class ArList02 {
    public static void main(String[] args) {
    
        ArrayList<Integer> numeros = new ArrayList<>();

        //Adicionar
        numeros.add(2);
        numeros.add(5);
        numeros.add(10);

        //Listando
        for(int i = 0; i < numeros.size(); i++){
            System.out.println((i+1) + " - " + numeros.get(i));
        }

        //Alternar
        numeros.set(12, 50);

        //Remover
        numeros.remove(0);
    
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
    }

}
