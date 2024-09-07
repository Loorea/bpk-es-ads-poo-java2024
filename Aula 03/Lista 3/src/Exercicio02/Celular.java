package Exercicio02;

public class Celular {
    public String marca;
    public String modelo;
    public Integer bateria = 100;

    public Celular(String marca, String modelo, Integer bateria){
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    public void usar(){
        System.out.println("bateria em "+bateria);
        bateria = bateria - 5;
    }
}

