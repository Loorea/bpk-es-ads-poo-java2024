package Exercicio08;

public class Professor {
    public String nome;
    public String disciplina;
    private Integer salario;

    public Professor(String nome, String disciplina, Integer salario){
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public void darAula(){
        System.out.println("O professor "+nome+" está dando aula de "+disciplina+" agora.");
    }
    public void corrigirProvas(){
        System.out.println("O professor "+nome+" está corrigindo as provas de sua disciplina de "+disciplina);
    }
}
