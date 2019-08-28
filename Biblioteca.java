/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criando objetos de referencia a classe Autor e especificando seus atributos
        Autor autor1 = new Autor();                             //Atribuindo valor referencia a classe Autor ao objeto autor1
        autor1.setId(1);                                        //Atribuindo valor ao atributo Id do objeto de referencia autor1 a classe Autor
        autor1.setNome("Pedro das Pedras");                     //Atribuindo valor ao atributo nome do objeto de referencia autor1 a classe Autor
        autor1.setEmail("pedrodaspedras@emailcomercial.com");   //Atribuindo valor ao atributo email do objeto de referencia autor1 a classe Autor
        
        //repetindo ação anterior em mais dois objetos de referencia a classe Autor
        Autor autor2 = new Autor();
        autor1.setId(2);
        autor1.setNome("Sergio Almeida");
        autor1.setEmail("serjao@emailcomercial.com");
        
        Autor autor3 = new Autor();
        autor1.setId(3);
        autor1.setNome("Maria Machado");
        autor1.setEmail("machadinha.m@emailcomercial.com");
       
        //Criando objeto de referencia a classe Editora e especificando seus atributos
        Editora editora1 = new Editora();           //Atribuindo referencia a classe Editora ao objeto autor1
        editora1.setId(1);                          //Atribuindo valor ao atributo Id do objeto de referencia editora1 a classe Editora
        editora1.setNome("Agosto");                 //Atribuindo valor ao atributo nome do objeto de referencia editora1 a classe Editora
        editora1.setEmail("redacao@agosto.com.br"); //Atribuindo valor ao atributo email do objeto de referencia editora1 a classe Editora
        editora1.setUrl("editoraagosto.com.br");    //Atribuindo valor ao atributo url do objeto de referencia editora1 a classe Editora
        
        //Criando objetos de referencia a classe Livro e especificando seus atributos
        Livro livro1 = new Livro();             //Atribuindo referencia a classe Livro ao objeto livro1
        livro1.setCodigo(1);                    //Atribuido valor ao atributo codigo do objeto de referencia livro1 a classe Livro
        livro1.setIsbn("ASJskjhf4185645sISUG"); //Atribuido valor ao atributo isbn do objeto de referencia livro1 a classe Livro
        livro1.setTitulo("Pedras no Caminho");  //Atribuido valor ao atributo titulo do objeto de referencia livro1 a classe Livro
        livro1.setEditora(editora1);            //Atribuido valor ao atributo editora de referencia ao objeto Editora do objeto de referencia livro1 a classe Livro
        livro1.setAutor(autor1);                //Atribuido um valor a ArrayList autor de referencia aos objetos Autor do objeto de referencia livro1 a classe Livro
        
        //repetindo ação anterior em mais um objeto de referencia a classe Livro
        Livro livro2 = new Livro();
        livro1.setCodigo(2);
        livro1.setIsbn("qweqw42134qsq1");
        livro1.setTitulo("Flores na cabeça");
        livro1.setEditora(editora1);
        livro1.setAutor(autor2);                //Atribuido um valor a ArrayList autor de referencia aos objetos Autor do objeto de referencia livro2 a classe Livro
        livro1.setAutor(autor2);                //Atribuido um valor a ArrayList autor de referencia aos objetos Autor do objeto de referencia livro2 a classe Livro
        
        //Criando objeto de referencia a classe Usuario e especificando seus atributos
        Usuario usuario1 = new Usuario();                       //Atribuindo referencia a classe Usuario ao objeto usuario1
        usuario1.setMatricula(1);                               //Atribuindo valor ao atributo Id do objeto de referencia usuario1 a classe Usuario
        usuario1.setNome("Joãozinho");                          //Atribuindo valor ao atributo nome do objeto de referencia usuario1 a classe Usuario
        usuario1.setFone("(00) 98765-4321");                    //Atribuindo valor ao atributo fone do objeto de referencia usuario1 a classe Usuario
        usuario1.setEmail("joa12imalaia@emailcomercial.com");   //Atribuindo valor ao atributo email do objeto de referencia usuario1 a classe Usuario
        
         //Criando objeto de referencia a classe ItensEmprestimo e especificando seus atributos
        ItensEmprestimo item1 = new ItensEmprestimo();
        ItensEmprestimo item2 = new ItensEmprestimo();
        //criando prazos
        
        //Criando objeto de referencia a classe Emprestimo e especificando seus atributos
        Emprestimo emprestimo1 = new Emprestimo();
        //adicionado itens no emprestimo
        emprestimo1.adicionarItem(item2, livro2, (short)10);
        emprestimo1.adicionarItem(item1, livro1, (short)5);
        //Realizar emprestimo de livros
        emprestimo1.retirar(usuario1,(short)1);
        
        //devolvendo um dos itens
        emprestimo1.devolver(1);
    
        
        
        
        
        
        
}
