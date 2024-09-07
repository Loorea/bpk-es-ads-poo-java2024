package Exercicio07;

import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);
    public String nome;
    private Integer matricula;
    public String curso;

    public Aluno(String nome, Integer matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public void calculador(){
        System.out.println("Insira a primeira nota: ");
        Integer nota1 = scanner.nextInt();
        System.out.println("Insira a segunda nota: ");
        Integer nota2 = scanner.nextInt();
        Integer media = (nota1+nota2)/2;
        System.out.println(nome+", sua média é de "+ media +" pontos.");
        scanner.close();
    }
}
