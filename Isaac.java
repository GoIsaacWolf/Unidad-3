
package com.mycompany.isaac;

import java.util.Scanner;


public class Isaac {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
        int a= 0, b= 1 ,c,n;
        System.out.println("Ingresa una cantidad ");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b; 
            b = c;
        }
    }
}
