package Exercicio21;

public class Cozinha {
    public String tipo;
    public Integer quantPessoas;
    public String cor;

    public Cozinha(String tipo, Integer quantPessoas, String cor){
        this.tipo = tipo;
        this.quantPessoas = quantPessoas;
        this.cor = cor;
    }
    public void cozinhar(){
        System.out.println("Cozinhando...");
    }
    public void limpar(){
        System.out.println("Limpando...");
    }
}
