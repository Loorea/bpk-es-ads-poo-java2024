package Exercicio01;

public class Livros {
    private String titulo;
    private String autor;
    private Integer paginas;
    private boolean aberto = false;
    private Integer inicial = 1;
    private Integer atual = 0;

public Livros (String titulo, String autor, Integer paginas){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
}
public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
public Integer getPaginas(){
    return paginas;
}
    public void abrir(){
        this.aberto = true;
        this.atual = inicial;
        System.out.println("Livro aberto.");
    }
    public void ler(){
        if(atual<paginas && atual>0.0){
        System.out.println("Lendo a pagina "+ atual);
        atual++;
        }
        else if(atual == paginas){
            System.out.println("Lendo a pagina "+ atual);
            System.out.println("Voce terminou o livro!");
        } else if (aberto == false) {
            System.out.println(titulo + " está fechado.");
        }
    }
}