package Exercicio18;

public class LivroDigital {
    public String titulo;
    public String autor;
    private byte tamanhoDoArquivo;
    private Boolean aberto = false;

    public LivroDigital(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        tamanhoDoArquivo = 4;
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
