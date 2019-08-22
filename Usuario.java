/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Aluno
 */
class Usuario {
    private int matricula;
    private String nome;
    private String email;
    private String fone;

    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;    
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getFone(){
        return this.fone;
    }
    public void setFone(String fone){
        this.fone = fone;
    }
}
