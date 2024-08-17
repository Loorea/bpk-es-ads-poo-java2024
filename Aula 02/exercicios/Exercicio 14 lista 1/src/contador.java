import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora. " +
                "Digite: " +
                "1 Para Soma " +
                "2 Para Subtração " +
                "3 Para Divisão " +
                "4 Para Multiplicação ");
        int resposta = scanner.nextInt();

        if (resposta < 1 || resposta > 4) {
            System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
            scanner.close();
            return;
        }
        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado;

        switch (resposta) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: "+ resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: "+ resultado);
                break;
            case 3:
                if (numero2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: "+ resultado);
                }
                break;
            case 4:
                resultado = numero1 * numero2;
                System.out.println("Resultado: "+ resultado);
                break;
        }

        scanner.close();
    }
}
