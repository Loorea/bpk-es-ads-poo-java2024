package Exercicio21;

public class Cozinha {
    private String tipo;
    private Integer quantPessoas;
    private String cor;

    public Cozinha(String tipo, Integer quantPessoas, String cor){
        this.tipo = tipo;
        this.quantPessoas = quantPessoas;
        this.cor = cor;
    }
    public String getTipo(){
        return tipo;
    }
    public Integer getQuantPessoas(){
        return quantPessoas;
    }
    public String getCor(){
        return cor;
    }
    public void cozinhar(){
        System.out.println("Cozinhando...");
    }
    public void limpar(){
        System.out.println("Limpando...");
    }
}
