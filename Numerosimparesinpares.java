/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosimparesinpares;

import java.util.Scanner;

/**
 *
 * @author ce182
 */
public class Numerosimparesinpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresa un numero");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("es un numero par");
        }else {
            System.out.println(" es un numero impar");
        }
       
    }
}
