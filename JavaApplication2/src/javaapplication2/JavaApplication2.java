/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Bruno Leitão
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola mundo!");
        System.out.println("Tenho " + 18 + " anos! ehehe" );
        System.out.println("Sou o Miguel e tenho " + 23 + " anos! ehehe" );
        System.out.println("3 + 5 = " + (3+5));
        float y, h, operacao;
        y=6;
        h=8;
        operacao = y / h;
        System.out.println(Math.round(y) + " / " + Math.round(h) + " = " + operacao);
    }
    
}
