package com.example.appgerenciamentodelivro.dominio;

public class Livro {

    private long id;
    private String Titulo;
    private String Autor;
    private String Editora;
    private boolean emprestar;

    public Livro(long id, String titulo, String autor, String editora, boolean emprestar) {
        this.id = id;
        Titulo = titulo;
        Autor = autor;
        Editora = editora;
        this.emprestar = emprestar;
    }

    public Livro(){


    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public boolean isEmprestar() {
        return emprestar;
    }

    public void setEmprestar(boolean emprestar) {
        this.emprestar = emprestar;
    }
}
