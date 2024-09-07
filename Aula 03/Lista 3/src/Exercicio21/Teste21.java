package Exercicio21;

public class Teste21 {
    public static void main(String[] args) {
        Cozinha minhaCozinha = new Cozinha("restaurante", 6, "azul");
        minhaCozinha.cozinhar();
        minhaCozinha.cozinhar();
        minhaCozinha.limpar();
    }
}
