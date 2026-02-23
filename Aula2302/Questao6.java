import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                continue;
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para a tabuada: ");
                    if (scanner.hasNextInt()) {
                        int n = scanner.nextInt();
                        System.out.println("Tabuada do " + n + ":");
                        for (int i = 1; i <= 10; i++) {
                            System.out.printf("%d x %d = %d%n", n, i, n * i);
                        }
                    } else {
                        System.out.println("Entrada inválida para tabuada.");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    System.out.print("Digite o número inicial da contagem regressiva (>=0): ");
                    if (scanner.hasNextInt()) {
                        int inicio = scanner.nextInt();
                        if (inicio < 0) {
                            System.out.println("Número deve ser >= 0.");
                        } else {
                            System.out.println("Contagem regressiva:");
                            for (int i = inicio; i >= 0; i--) {
                                System.out.println(i);
                            }
                        }
                    } else {
                        System.out.println("Entrada inválida para contagem.");
                        scanner.nextLine();
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção desconhecida. Tente novamente.");
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
