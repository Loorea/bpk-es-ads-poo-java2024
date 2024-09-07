package Exercicio12;

public class Filme {
    public String titulo;
    public  String diretor;
    public String duracao;
    public Boolean play = false;

    public Filme(String titulo, String diretor, String duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.play = play;
    }
    public void iniciar(){
        System.out.println("O filme "+ titulo + " está iniciando. Duração: " + duracao);
        play = true;
    }
    public void pausar(){
        if (play==false) {
            System.out.println("Filme não iniciado.");
        } else{
            System.out.println("O filme " + titulo + " foi pausado.");
            play = false;
        }
    }
}
