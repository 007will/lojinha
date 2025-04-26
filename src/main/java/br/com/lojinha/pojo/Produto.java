package br.com.lojinha.pojo;

public class Produto {
    private String nome;
    public String marca;
    private double valor;
    public String tamanho;
    public String itensInclusos;

    public double getValor () {
       return this.valor;
    }
    public void setValor(double novoValor) {
        this.valor = novoValor;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

}
