package Exercicio11;

public class Cidade {
    private String city;
    private Integer populacao;
    private String estado;

    public Cidade(String city, Integer populacao, String estado){
        this.city = city;
        this.populacao = populacao;
        this.estado = estado;
    }
    public String getCity(){
        return city;
    }
    public Integer getPopulacao(){
        return populacao;
    }
    public String getEstado(){
        return estado;
    }
    public void aumentar(){
        System.out.println("Parabéns! Acaba de nascer mais uma pessoa em " + city);
        populacao = populacao + 1;
        System.out.println("População atual: " + populacao);
    }
    public void diminuir(){
        System.out.println(city + " acaba de perder mais um morador. Nossos sentimentos.");
        populacao = populacao - 1;
        System.out.println("População atual: " + populacao);
    }
}
