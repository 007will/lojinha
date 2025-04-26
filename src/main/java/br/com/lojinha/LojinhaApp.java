package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(79.99);
        meuProduto.marca = "Sony";
        meuProduto.tamanho = "Médio";
        meuProduto.itensInclusos = "2 Controles e 3 Jogos";

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.marca);
        System.out.println(meuProduto.tamanho);
        System.out.println(meuProduto.itensInclusos);

    }
}
