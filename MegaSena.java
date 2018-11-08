/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio002;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author marcos
 */
public class MegaSena {
    public static void main(String[] args) {
        Set valor = new HashSet();
        Random r = new Random();
        
        while(true){
            if (valor.size() < 6) {
                valor.add(r.nextInt(60) + 1);
            }else{
                break;
            }
        }
        
        for (Object v : valor) {
            System.out.println(v);
        }
    }
}
