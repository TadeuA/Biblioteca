/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
class Livro {
    private int codigo;
    private String isbn;
    private String titulo;
    private Editora editora;
    private boolean situacao;
    private ArrayList<Autor> autor = new ArrayList<Autor>();

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;    
    }
    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public Autor getAutor(int posicao){
        return this.autor.get(posicao);
    }
    public void setAutor(Autor autor){
        this.autor.add(autor);
    }
    public Editora getEditora(){
        return this.editora;
    }
    public void setEditora(Editora editora){
        this.editora = editora;
    }
    public boolean getSituacao(){
        return this.situacao;
    }
    public void setSituacao(boolean situacao){
        this.situacao = situacao;
    }
}
