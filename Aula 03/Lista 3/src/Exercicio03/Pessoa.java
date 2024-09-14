package Exercicio03;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public Double getAltura(){
        return altura;
    }
    public void apresentar(){
        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos de idade.");
        System.out.println("Minha altura é de " + altura + "m.");
    }
}