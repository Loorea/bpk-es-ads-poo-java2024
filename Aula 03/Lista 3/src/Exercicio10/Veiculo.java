package Exercicio10;

import java.util.Scanner;

public class Veiculo {
    Scanner scanner = new Scanner(System.in);
    public String modelo;
    public String placa;
    public String cor;

    public Veiculo(String modelo, String placa, String cor){
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    public void abastecer(){
        System.out.println("Digite quantos litros deseja abastecer:  (Preço da Gasolina: 5.47");
        int litros = scanner.nextInt();
        Double valorAPagar = litros*5.47;
        System.out.println("Valor a pagar: R$"+valorAPagar);
        System.out.println("Obrigada pela preferência!");
        scanner.close();
    }
    public void lavar(){
        System.out.println("Valor da lavagem: R$100");
        System.out.println("Seu "+modelo+ " está sendo lavado.");
    }
}
