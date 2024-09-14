package Exercio09;

public class Produtos {
    private String nome;
    private Double preco;
    private Integer quantEstoque;

    public Produtos(String nome, Double preco, Integer quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }
    public String getNome(){
        return nome;
    }
    public Double getPreco(){
        return preco;
    }
    public Integer getQuantEstoque(){
        return quantEstoque;
    }
    public void aumentarEstq(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantEstoque);
        System.out.println("Aumentando estoque em 1...");
        quantEstoque = quantEstoque + 1;
        System.out.println("Sucesso!! Estoque atual: " + quantEstoque);
    }
    public void diminuirEstq(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantEstoque);
        System.out.println("Diminuindo estoque em 1...");
        quantEstoque = quantEstoque - 1;
        System.out.println("Sucesso!! Estoque atual: " + quantEstoque);
    }
}
