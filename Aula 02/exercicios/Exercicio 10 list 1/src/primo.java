import java.util.Scanner;

public class primo {
    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: \n");
        int num = scanner.nextInt();

        if (primo(num)) {
            System.out.printf(num + " é primo");
        } else {
            System.out.printf(num + " não é primo");
        }
        scanner.close();
    }
}
