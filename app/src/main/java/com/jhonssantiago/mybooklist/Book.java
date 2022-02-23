package com.jhonssantiago.mybooklist;

/*  imagem
    nome do livro.
    Quando o item for clicado deve ser aberto uma nova atividade com a sinopse do livro, categoria e preço. */
public class Book {
    private int capa;
    private String titulo;
    private String categoria;
    private String sinopse;
    private String preco;

    public Book(int capa, String titulo, String categoria, String sinopse, String preco) {
        this.capa = capa;
        this.titulo = titulo;
        this.categoria = categoria;
        this.sinopse = sinopse;
        this.preco = preco;
    }

    public int getCapa() {
        return capa;
    }

    public void setCapa(int capa) {
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Book{" +
                "capa=" + capa +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
