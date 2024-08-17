import java.util.Scanner;

public class temperatura {
    public static double celPFah(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static double fahPCel(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para converter Celsius para Fahrenheit e 2 para converter Fahrenheit para Celsius: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite 1 ou 2.");
            scanner.next();
            System.out.println("Digite 1 para converter Celsius para Fahrenheit e 2 para converter Fahrenheit para Celsius: ");
        }

        int resposta = scanner.nextInt();
        switch(resposta) {
            case 1:
                System.out.println("Digite a temperatura em Celsius: ");

                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                    scanner.next();
                    System.out.println("Digite a temperatura em Celsius: ");
                }
                double celsius = scanner.nextDouble();
                System.out.println("Temperatura em Fahrenheit: "+ celPFah(celsius));
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit: ");

                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                    scanner.next();
                    System.out.println("Digite a temperatura em Fahrenheit: ");
                }
                double fahrenheit = scanner.nextDouble();
                System.out.println("Temperatura em Celsius: "+ fahPCel(fahrenheit));
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }
        scanner.close();
    }
}
