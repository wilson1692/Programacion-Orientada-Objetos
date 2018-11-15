/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionoo;

/**
 *
 * @author Wilson
 */
public class Numerospares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = 0;
        for (int i = 1; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.println(" numero par es  " + i);
                resultado = resultado + i;
                System.out.println(" suma " + resultado);
            }
        }
    }
   
}
