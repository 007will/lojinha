package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) throws IllegalAccessException {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(01);
        meuProduto.setMarca("sony");
        meuProduto.setTamanho("Médio");
        meuProduto.setItensInclusos("2 Controles e 3 Jogos");

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());

    }
}
