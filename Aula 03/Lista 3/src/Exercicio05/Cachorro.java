package Exercicio05;

public class Cachorro {
    private String nome;
    private String raca;
    private Integer idadeEmMeses;

    public Cachorro(String nome, String raca, Integer idadeEmMeses){
        this.nome = nome;
        this.raca = raca;
        this.idadeEmMeses = idadeEmMeses;
    }
    public String getNome(){
        return nome;
    }
    public String getRaca(){
        return raca;
    }
    public Integer getIdade(){
        return idadeEmMeses;
    }
    public void latir(){
        System.out.println(nome + " diz: AUAUAU.");
    }
    public void correr(){
        System.out.println(nome + " começa a correr. Ele é um cachorro da raça " + raca +" e tem " + idadeEmMeses + " meses de idade.");
    }
}
