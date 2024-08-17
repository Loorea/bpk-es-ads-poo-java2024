import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numA = random.nextInt(100) + 1;
        int tentativa;
        int contagem = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.println("Digite seu palpite: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next();
                System.out.println("Digite seu palpite: ");
            }

            tentativa = scanner.nextInt();

            if (tentativa < 1 || tentativa > 100) {
                System.out.println("O palpite deve estar entre 1 e 100. Tente novamente.");
                continue;
            }

            contagem++;

            if (tentativa < numA) {
                System.out.println("Muito baixo!");
            } else if (tentativa > numA) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou. Tentativas: "+ contagem);
            }
        } while (tentativa != numA);

        scanner.close();
    }
}
