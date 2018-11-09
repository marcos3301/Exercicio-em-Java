/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio002.contatos;

/**
 *
 * @author marcos
 */
public class Demo {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionar("marcos", "123456789");
        agenda.adicionar("joão", "789456123");
        agenda.adicionar("maria", "456789123");
        agenda.excluir("marcos");
        
        System.out.println(agenda.buscar("joão"));
    }
    
}
