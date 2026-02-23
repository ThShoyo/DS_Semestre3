import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println("Tabuada do " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
        } else {
            System.out.println("Entrada inválida. Execute novamente e digite um número inteiro.");
        }
        scanner.close();
    }
}
