package Exercicio01;

public class Livros {
    public String titulo;
    public String autor;
    public int paginas;
    private boolean aberto = true;
    private int inicial = 1;
    private int atual = 0;


public Livros(String titulo, String autor, int paginas){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    }
    public void abrir(){
        this.aberto = true;
        this.atual = inicial;
        System.out.println("Livro aberto.\n");
    }
    public void ler(){
        System.out.println("Lendo a página...");
        if(atual<paginas){
        System.out.println("Lendo a pagina "+ atual);
        atual++;
        }
        if(atual == paginas){
            System.out.println("Lendo a pagina "+ atual);
            System.out.println("Voce terminou o livro!");
        }
    }
}