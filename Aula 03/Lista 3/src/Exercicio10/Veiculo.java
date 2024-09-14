package Exercicio10;

import java.util.Scanner;

public class Veiculo {
    Scanner scanner = new Scanner(System.in);
    private String modelo;
    private String placa;
    private String cor;

    public Veiculo(String modelo, String placa, String cor){
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    public String getModelo(){
        return modelo;
    }
    public String getPlaca(){
        return placa;
    }
    public String getCor(){
        return cor;
    }
    public void abastecer(){
        System.out.println("Digite quantos litros deseja abastecer:  (Preço da Gasolina: 5.47");
        Double litros = scanner.nextDouble();
        Double valorAPagar = litros*5.47;
        System.out.println("Valor a pagar: R$" + valorAPagar);
        System.out.println("Obrigada pela preferência!");
        scanner.close();
    }
    public void lavar(){
        System.out.println("Valor da lavagem: R$100");
        System.out.println("Seu " + modelo + " está sendo lavado.");
    }
}
