package Exercio09;

public class Produtos {
    public String nome;
    public Double preco;
    public Integer quantEstoque;

    public Produtos(String nome, Double preco, Integer quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }
    public void aumentarEstq(){
        System.out.println("Produto: "+ nome);
        System.out.println("Quantidade em estoque: "+quantEstoque);
        System.out.println("Aumentando estoque em 1...");
        quantEstoque = quantEstoque + 1;
        System.out.println("Sucesso!! Estoque atual: "+ quantEstoque);
    }
    public void diminuirEstq(){
        System.out.println("Produto: "+ nome);
        System.out.println("Quantidade em estoque: "+quantEstoque);
        System.out.println("Diminuindo estoque em 1...");
        quantEstoque = quantEstoque - 1;
        System.out.println("Sucesso!! Estoque atual: "+ quantEstoque);
    }
}
