import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro positivo.");
            scanner.next();
            System.out.println("Digite um número: ");
        }

        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("Número negativo não é permitido. Por favor, digite um número positivo.");
        } else {
            long fatorialIterativo = calcularFatorialIterativo(numero);
            System.out.println("Fatorial iterativo de "+ numero +": " + fatorialIterativo);

            long fatorialRecursivo = calcularFatorialRecursivo(numero);
            System.out.println("Fatorial recursivo de "+ numero +": " + fatorialRecursivo);
        }
        scanner.close();
    }
    public static long calcularFatorialIterativo(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static long calcularFatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorialRecursivo(n - 1);
        }
    }
}
