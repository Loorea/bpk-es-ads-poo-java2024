package Exercicio04;

import java.util.Scanner;

public class ContaBancaria {
    Scanner scanner = new Scanner(System.in);
    public Integer numeroConta;
    private double saldo;

    public ContaBancaria(Integer numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(){
        System.out.println("Saldo atual: "+ saldo);
        System.out.println("Insira o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        saldo = saldo + valorDeposito;
        System.out.println("Depósito feito! Saldo atual: R$"+saldo);
    }

    public void sacar(){
        System.out.println("Saldo atual: R$"+saldo);
        System.out.println("Digite a quantia que deseja sacar:");
        double valorSaque = scanner.nextDouble();
        saldo = saldo - valorSaque;
        System.out.println("Saque realizado! Saldo atual: R$"+saldo);
        scanner.close();
    }
}
