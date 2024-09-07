package Exercicio11;

public class Teste11 {
    public static void main(String[] args) {
        Cidade minhaCidade = new Cidade("Palotina", 32000, "Paraná");
        minhaCidade.aumentar();
        minhaCidade.aumentar();
        minhaCidade.aumentar();
        minhaCidade.diminuir();
        minhaCidade.diminuir();
        minhaCidade.aumentar();
    }
}
