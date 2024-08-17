import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num= scanner.nextInt();

        if (num%2==0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
        scanner.close();
    }
}