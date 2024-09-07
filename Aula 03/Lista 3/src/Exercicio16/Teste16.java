package Exercicio16;

public class Teste16 {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Infernity", "Rua das Flores, 1987", "55 998877665");
        minhaLoja.fechar();
        minhaLoja.abrir();
        minhaLoja.abrir();
        minhaLoja.fechar();
    }
}
