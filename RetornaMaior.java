/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Marcos Antonio
 */
public class RetornaMaior {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = input.nextInt();
        System.out.print("Digite o quarto valor: ");
        int d = input.nextInt();
        System.out.print("Digite o quinto valor: ");
        int e = input.nextInt();

        int aux;

        aux = Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);

        System.out.println("Maior: " + aux);

    }

}
