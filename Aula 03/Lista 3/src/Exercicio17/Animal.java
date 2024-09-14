package Exercicio17;

public class Animal {
    private String especie;
    private Integer idadeEmMeses;
    private Integer peso;
    private Boolean dormindo = false;

    public Animal(String especie, Integer idadeEmMeses, Integer peso){
        this.especie = especie;
        this.idadeEmMeses = idadeEmMeses;
        this.peso = peso;
    }
    public String getEspecie(){
        return especie;
    }
    public Integer getIdade(){
        return idadeEmMeses;
    }
    public Integer getPeso(){
        return peso;
    }
    public void alimentar(){
        System.out.println("Você alimentou o " + especie);
    }
    public void dormir(){
        if (dormindo == true){
            System.out.println(especie + " já está dormindo.");
        } else {
            System.out.println(especie + " dormiu.");
            dormindo = true;
        }
    }
}
