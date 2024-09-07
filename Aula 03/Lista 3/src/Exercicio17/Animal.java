package Exercicio17;

public class Animal {
    public String especie;
    public Integer idade;
    public Integer peso;
    private Boolean dormindo = false;

    public Animal(String especie, Integer idade, Integer peso){
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
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
