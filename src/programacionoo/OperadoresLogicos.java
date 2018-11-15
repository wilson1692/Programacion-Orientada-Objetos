/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson Armijos
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n ", "AND condicional (&)",
                "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));
        System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","OR condicional (||)",
                "false || false", (false || false),
                "false || true", (false || true),
                "true || flase", (true || false),
                "true || true", (true || true));
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","AND logico booleano (&)",
                "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","OR inclusivo logico booleano (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","OR exclusivo logico booleano (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));
        System.out.printf( "%s\n%s: %b\n%s: %b\n", "NOT logico (!)",
                "!false",( !false ),
                "!true", ( !true ) );
    }
    
}
