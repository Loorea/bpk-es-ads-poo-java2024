package Exercicio18;

public class LivroDigital {
    private String titulo;
    private String autor;
    private byte tamanhoDoArquivo;
    private Boolean aberto = false;

    public LivroDigital(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoDoArquivo = 4;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void abrir(){
        if (aberto == true){
            System.out.println(titulo + " já está aberto.");
        } else {
            aberto = true;
            System.out.println(titulo + " foi aberto.");
        }
    }
    public void fechar(){
        if (aberto == false){
            System.out.println(titulo + " já está fechado.");
        } else {
            aberto = false;
            System.out.println(titulo + " foi fechado.");
        }
    }
}
