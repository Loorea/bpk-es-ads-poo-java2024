package Exercicio07;

import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private Integer matricula;
    private String curso;

    public Aluno(String nome, Integer matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getNome(){
        return nome;
    }
    public Integer getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    public void calculador(){
        System.out.println("Insira a primeira nota: ");
        Double nota1 = scanner.nextDouble();
        System.out.println("Insira a segunda nota: ");
        Double nota2 = scanner.nextDouble();
        Double media = (nota1 + nota2) / 2;
        System.out.println(nome+", sua média é de " + media + " pontos.");
        scanner.close();
    }
}
