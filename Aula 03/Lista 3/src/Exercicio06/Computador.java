package Exercicio06;

public class Computador {
    public String processador;
    public String RAM;
    public String armazenamento;

    public Computador(String processador, String RAM, String armazenamento){
        this.processador = processador;
        this.RAM = RAM;
        this.armazenamento = armazenamento;
    }
    public void ligar(){
        System.out.println("Ligando computador...");
        System.out.println("Informações de Hardware: ");
        System.out.println("Processador: "+processador);
        System.out.println("Memoria RAM: "+RAM);
        System.out.println("Armazenamento Interno: "+armazenamento);
        System.out.println("Bem vindo!");
    }
    public void desligar(){
        System.out.println("Desligando...");
    }
}
