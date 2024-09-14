package Exercicio16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private Boolean aberta = false;

    public Loja(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public void abrir(){
        if (aberta == true){
            System.out.println(nome + " já está aberta.");
        } else {
            aberta = true;
            System.out.println("Você abriu a loja.");
        }
    }
    public void fechar(){
        if (aberta == false){
            System.out.println(nome + " já está fechada.");
        } else {
            aberta = false;
            System.out.println("Você fechou a loja.");
        }
    }
}
