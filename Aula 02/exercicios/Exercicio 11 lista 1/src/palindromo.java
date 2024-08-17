import java.util.Scanner;

public class palindromo {
    public static boolean ehPalindromo(String palavra) {
        palavra = palavra.replaceAll("[^a-zA-Z0-9]", "");

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite uma palavra para verificar se é um palíndromo: \n");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.printf("é um palíndromo.");
        } else {
            System.out.printf("não é um palíndromo.");
        }
        scanner.close();
    }
}