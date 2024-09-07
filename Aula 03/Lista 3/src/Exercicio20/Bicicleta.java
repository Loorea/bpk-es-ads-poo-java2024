package Exercicio20;

public class Bicicleta {
    public String marca;
    public String modelo;
    public Integer tamanhoRoda;

    public Bicicleta(String marca, String modelol, Integer tamanhoRoda){
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }
    public void pedalar(){
        System.out.println("Pedalando...");
    }
    public void frear(){
        System.out.println("Freou.");
    }
}
