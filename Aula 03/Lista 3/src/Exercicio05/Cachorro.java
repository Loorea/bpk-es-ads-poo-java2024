package Exercicio05;

public class Cachorro {
    public String nome;
    public String raca;
    public Integer idade;

    public Cachorro(String nome, String raca, Integer idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public void latir(){
        System.out.println(nome + " diz: AUAUAU.");
    }
    public void correr(){
        System.out.println(nome + " começa a correr. Ele é um cachorro da raça " + raca +" e tem " + idade + " meses de idade.");
    }
}
