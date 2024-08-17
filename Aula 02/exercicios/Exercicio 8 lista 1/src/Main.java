import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá "+ nome);
        System.out.println("Você tem "+ idade + " anos");
        scanner.close();
    }
}