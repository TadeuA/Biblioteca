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
    private short numero;
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
    public String getHoraFormatada(){
        DateFormat formatoDeHora = new SimpleDateFormat("HH:mm");
        String horaFormatada = formatoDeHora.format(this.getHora());
        return horaFormatada;
    }
    private void setHora(Date hora){
        this.hora = hora;
    }
    public short getNumero(){
        return this.numero;
    }
    private void setNumero(short numero){
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
    public void adicionarItem(ItensEmprestimo item, Livro livro, short prazo){
        boolean verefica = livro.getSituacao();
        if(verefica == true){
            System.out.println("Livro não disponivel");
        }else{
            item.setLivro(livro);//Atribui o livro ao atributo livro do objeto ItensImprestimo
            item.setPrazo(prazo);//Ordena para o ItensEmprestimo atribuir o valor prazo ao seu atributo prazo
            this.setItensEmprestimo(item);//Adiciona o Item emprestimo ao Array
        }
    }
    }
    //fazer retirado dos ItensEmprestimo
    public void retirar(Usuario usuario, short numero){
        Date dataAtual = new Date(); //pegar data atual do sistema
        this.setData(dataAtual);//Atribui a data atual do sistema no atributo Data
        this.setHora(dataAtual);//Atribui a data atual do sistema no atributo Hora
        this.setNumero(numero);//Atribui o numero ao atributo numero
        this.setUsuario(usuario);//Atribui o usuario ao atributo usuario de referencia ao objeto Usuario
        
        //Ordena para o ItensEmprestimo atribuir o valor true ao atributo situacao ao objeto Livro
        for(int i = 0; i < this.itensEmprestimo.size(); i++){
            this.itensEmprestimo.get(i).situarLivro(true);
        }
    }
    //Devolver Item
    public void devolver(int posicao){
        ItensEmprestimo item = this.itensEmprestimo.get(posicao);//seleciona o Item a ser devolvido
        item.situarLivro(false);//Ordena para o ItensEmprestimo atribuir o valor false ao atributo situacao ao objeto Livro
        this.itensEmprestimo.remove(posicao);//remove o itnsEmrpestimo do array
    } 
}
