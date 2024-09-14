package Exercicio12;

public class Filme {
    private String titulo;
    private  String diretor;
    private String duracao;
    private Boolean play = false;

    public Filme(String titulo, String diretor, String duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.play = play;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDiretor(){
        return diretor;
    }
    public String getDuracao(){
        return duracao;
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
