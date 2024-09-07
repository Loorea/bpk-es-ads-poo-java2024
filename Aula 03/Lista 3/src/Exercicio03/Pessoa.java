package Exercicio03;

public class Pessoa {
    public String nome;
    public Integer idade;
    public Double altura;

    public Pessoa(String nome, Integer idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void apresentar(){
        System.out.println("Meu nome é "+ nome);
        System.out.println("\nTenho "+idade+" anos de idade.");
        System.out.println("\nMinha altura é de "+altura+"m.");
    }
}