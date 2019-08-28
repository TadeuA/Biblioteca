/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aluno
 */
class ItensEmprestimo {
    private Livro livro;
    private short prazo;


    public Livro getLivro(){
        return this.livro;
    }
    public void setLivro(Livro livro){
        this.livro = livro;
    }
    public short getPrazo(){
        return this.prazo;
    }
    public void setPrazo(short prazo){
        this.prazo = prazo;
    }
    public void situarLivro(boolean situacao){
        livro.setSituacao(situacao);
    }
}
