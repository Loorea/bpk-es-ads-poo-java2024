package Exercicio15;

public class Jogo {
    private String nome;
    private String genero;
    private Double preco;
    private Boolean playGame = false;

    public Jogo(String nome, String genero, Double preco){
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        playGame = false;
    }
    public String getNome(){
        return nome;
    }
    public String getGenero(){
        return genero;
    }
    public Double getPreco(){
        return preco;
    }
    public void iniciar(){
        playGame = true;
        System.out.println(nome + " em andamento.");
    }
    public void pausar(){
        if (playGame == false){
            System.out.println(nome + " não foi iniciado.");
        } else {
            playGame = false;
            System.out.println(nome + " pausado.");
        }
    }
}
