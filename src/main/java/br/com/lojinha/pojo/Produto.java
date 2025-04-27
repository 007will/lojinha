package br.com.lojinha.pojo;

public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private String itensInclusos;

    public double getValor () {
       return this.valor;
    }
    public void setValor(double novoValor) throws IllegalAccessException {
        if (novoValor > 0) {
        this.valor = novoValor;
    } else {
            throw new IllegalAccessException("Valores devem ser maiores que 0");
        }
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String novaMarca){
        this.marca = novaMarca;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(String novoTamanho){
        this.tamanho = novoTamanho;
    }

    public String getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(String novositensInclusos) {
        this.itensInclusos = novositensInclusos;
    }
}
