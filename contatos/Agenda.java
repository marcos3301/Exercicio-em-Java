/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio002.contatos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author marcos
 */
public class Agenda {
    
    Map<String, String> contatos = new HashMap<>();

    void adicionar(String nome, String telefone){
        contatos.put(nome, telefone);
    }
    
    String buscar(String nome){
        return contatos.get(nome);
    }
    
    void excluir(String nome){
        contatos.remove(nome);
    }

}
