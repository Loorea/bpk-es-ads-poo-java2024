package Exercicio13;

public class Time {
    private String nome;
    private String tecnico;
    private Integer numJogad;

    public Time(String nome, String tecnico){
        this.nome = nome;
        this.tecnico = tecnico;
        this.numJogad = 12;
    }
    public String getNome(){
        return nome;
    }
    public String getTecnico(){
        return tecnico;
    }
    public Integer getNumJogad(){
        return numJogad;
    }
    public void removerJog(){
        if(numJogad>0){
            System.out.println("Removido 1 jogador. " + nome + " está pior que antes.");
            numJogad = numJogad - 1;
            System.out.println("Numero atual de jogadores: " + numJogad);
        } else{
            System.out.println(nome + " já não tem jogadores para remover");
        }
    }
    public void addJog(){
        if (numJogad>=12){
            System.out.println("Não adianta adicionar mais jogadores, " + nome + " infelizmente vai continuar te decepcionando, torcedor.");
        } else{
            System.out.println("Jogador adicionado! Esperançoso?");
            numJogad = numJogad + 1;
            System.out.println("Numero atual de jogadores: " + numJogad);
        }
    }
}
