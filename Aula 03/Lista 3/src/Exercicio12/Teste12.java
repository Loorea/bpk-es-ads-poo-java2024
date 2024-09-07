package Exercicio12;

public class Teste12 {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Hereditário", "Ari Aster", "2h7m");
        meuFilme.pausar();
        meuFilme.iniciar();
        meuFilme.pausar();
    }
}
