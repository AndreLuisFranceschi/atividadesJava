/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9;

/**
 *
 * @author Usuario
 */
public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int isbn;
    private int usuario;

    public Livro() {
        this.usuario = -1;
    }
    
    public void cadastrar(){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }    

    public String buscarLivro(int isbn) {
        return "Livro: " + titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
    
    
}
