package Exercicio15;

public class Teste15 {
    public static void main(String[] args) {
        Jogo meuJogo = new Jogo("Pacman", "Casual", 0.00);
        meuJogo.pausar();
        meuJogo.iniciar();
        meuJogo.pausar();
    }
}
