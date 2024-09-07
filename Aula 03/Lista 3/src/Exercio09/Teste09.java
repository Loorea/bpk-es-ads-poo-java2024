package Exercio09;

public class Teste09 {
    public static void main(String[] args) {
        Produtos meuEstoque = new Produtos("Coca-cola lata 350ml", 3.0, 12);
        meuEstoque.aumentarEstq();
        meuEstoque.aumentarEstq();
        meuEstoque.aumentarEstq();
        meuEstoque.diminuirEstq();
    }
}
