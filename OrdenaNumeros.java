/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class OrdenaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de entradas: ");
        int tam = in.nextInt();
        int x = 0;
        List<Integer> num = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        List<Integer> par = new ArrayList<>();

        while (x < tam) {
            System.out.printf("Entre com o %dº valor: ", x + 1);
            int aux = in.nextInt();
            
            while (aux <= 0) {
                System.out.println("Digite um numero inteiro nao negativo!!!");
                break;
            }
            if (aux > 0) {
                num.add(aux);
                x++;
            }
        }
        
        num.forEach((integer) -> {
            if (integer % 2 == 0) {
                par.add(integer);
            }else{
                impar.add(integer);
            }
        });
        
        Collections.sort(par);
        Collections.sort(impar, Collections.reverseOrder());
        
        par.forEach((integer) -> {
            System.out.println(integer);
        });
        impar.forEach((integer) -> {
            System.out.println(integer);
        });
    }

}
