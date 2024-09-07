package Exercicio22;

public class Empresa {
    public String CNPJ;
    public String nome;
    public Integer numFuncionarios;

    public Empresa(String CNPJ, String nome, Integer numFuncionarios){
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.numFuncionarios = numFuncionarios;
    }
    public void contratar(){
        System.out.println("Parabéns! Você contratou um funcionário.");
        numFuncionarios = numFuncionarios + 1;
        System.out.println("Numero atual de funcionarios: " + numFuncionarios);
    }
    public void demitir(){
        if (numFuncionarios==0){
            System.out.println("Você já demitiu todos os funcionários da empresa " + nome);
        } else {
            System.out.println("Lamentamos, você demitiu um funcionário.");
            numFuncionarios = numFuncionarios - 1;
            System.out.println("Número atual de funcionários: " + numFuncionarios);
        }
    }
}
