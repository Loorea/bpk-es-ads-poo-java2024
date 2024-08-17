import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num1= scanner.nextInt();

        System.out.println("Insira um número: ");
        int num2= scanner.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("Soma: "+ soma);
        System.out.println("Subtração: "+ sub);
        System.out.println("Multiplicação: "+ mult);
        System.out.println("Divisão: "+ div);

        scanner.close();
    }
}