/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Aluno
 */

class Emprestimo {
     /*
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("EEE dd-MM-yyyy");
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    */
    private Date data;//LocalDate.now()
    private Date hora;//LocalTime.now();
    private int numero;
    private ArrayList<ItensEmprestimo> itensEmprestimo = new ArrayList<ItensEmprestimo>();
    private Usuario usuario;

    public Date getData(){
        return data;
    }
    public String getDataFormatada(){
        //Formatando a data pasando um estilo de formatação: DateFormate.FULL
        //e passan do um local de data: new Locale("pt", "BR")
        DateFormat FormatoDeData = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
        String dataFormatada = FormatoDeData.format(this.data);
        return dataFormatada;
    }
    private void setData(Date data){
        this.data = data;
    }
    public Date getHora(){
        return this.hora;
    }
    private void setHora(Date hora){
        this.hora = hora;
    }
    public int getNumero(){
        return this.numero;
    }
    private void setNumero(int numero){
        this.numero = numero;
    }
    public ItensEmprestimo getItensEmprestimo(int posicao){
        return this.itensEmprestimo.get(posicao);
    }
    private void setItensEmprestimo(ItensEmprestimo itensEmprestimo){
        this.itensEmprestimo.add(itensEmprestimo);
    } 
    public Usuario getUsuario(){
        return this.usuario;
    }
    private void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    /**
     * 
     * @param numero faz referencia a operação
     * @param item  faz referencia ao itenEmprestimo
     * @param livro faz referencia ao livro a ser atribuido ao itensEmprestimi
     * @param usuario faz referencia ao usuario que ira retirar
     * @param prazo far referencia ao prazo de entrega
     */
    public void retirar(int numero, ItensEmprestimo item, Livro livro, Usuario usuario, short prazo){
        Date dataAtual = new Date(); //pegar data atual do sistema
        this.setData(dataAtual);//Atribui a data atual do sistema no atributo Data
        this.setHora(dataAtual);//Atribui a data atual do sistema no atributo Hora
        item.setLivro(livro);//Atribui o livro ao atributo livro do objeto ItensImprestimo
        item.situarLivro(true);//Ordena para o ItensEmprestimo atribuir o valor true ao atributo situacao ao objeto Livro
        this.setUsuario(usuario);//Atribui o usuario ao atributo usuario de referencia ao objeto Usuario
        this.setNumero(numero);//Atribui o numero ao atributo numero
        item.setPrazo(prazo);//Ordena para o ItensEmprestimo atribuir o valor prazo ao seu atributo prazo
        this.setItensEmprestimo(item);//Adiciona o Intem emprestimo ao Array
    }
    public void devolver(int posicao){
        ItensEmprestimo item = this.itensEmprestimo.get(posicao);//seleciona o Item a ser devolvido
        item.situarLivro(false);//Ordena para o ItensEmprestimo atribuir o valor false ao atributo situacao ao objeto Livro
        this.itensEmprestimo.remove(posicao);//remove o itnsEmrpestimo do array
    }  
}
