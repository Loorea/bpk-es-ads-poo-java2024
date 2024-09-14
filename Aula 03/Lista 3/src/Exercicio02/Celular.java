package Exercicio02;

public class Celular {
    private String marca;
    private String modelo;
    private Integer bateria = 100;

    public Celular(String marca, String modelo, Integer bateria){
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Integer getBateria(){
        return bateria;
    }
    public void usar(){
        if (bateria > 0) {
            System.out.println("bateria em " + bateria);
            bateria = bateria - 5;
        }
        if(bateria==0){
            System.out.println(marca + " " + modelo + " está sem bateria.");
        }
    }
}

