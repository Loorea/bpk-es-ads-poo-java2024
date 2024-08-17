import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operador;
        double num1, num2, resultado;

        System.out.println("Escolha uma operação (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println(resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
        scanner.close();
    }
}
