package Exercicio15;

public class Jogo {
    public String nome;
    public String genero;
    public Double preco;
    private Boolean playGame = false;

    public Jogo(String nome, String genero, Double preco){
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        playGame = false;
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
