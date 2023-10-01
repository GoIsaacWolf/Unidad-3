/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cajero;

import java.util.Scanner;

/**
 *
 * @author ce182
 */
public class CAJERO {

    public static void main(String[] args) {
       int saldo = 3000, retirar, deposito;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("BIENVENIDO \n");
            System.out.println("-----------------------------------");
            System.out.println("seleccione 1 PARA RETIRAR SALDO");
            System.out.println("seleccione 2 PARA DEPOSITAR SALDO");
            System.out.println("seleccione 3 PARA VERIFICAR SU SALDO");
            System.out.println("seleccione 4 PARA SALIR");
            System.out.println("------------------------------------\n");
            System.out.print("INGRESE LA OPERACION QUE DESEA REALIZAR:");
            int n = s.nextInt();
            switch(n)
            {
                case 1 -> {
                    System.out.print("\nLA CANTIDAD QUE DESEA RETIRAR:");
                    retirar = s.nextInt();
                    if(saldo >= retirar)
                    {
                        saldo = saldo - retirar;
                        System.out.println("\n EL DINERO FEU RETIRADO EXITOSAMENTE");
                    }
                    else
                    {
                        System.out.println("\nDINERO INSUFICIENTE");
                    }
                    
                    System.out.println("");
           }
 
                case 2 -> {
                    System.out.print("\n CANTIDAD QUE DESEA DEPOSITAR:");
                    deposito = s.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("\nEL DINERO HA SIDO DEPOSITADO EXITOSAMENTE");
           }
 
                case 3 -> System.out.println("SALDO : "+saldo);
 
                case 4 -> {
                    System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                    System.exit(0);
           }
            }
        }
    }
    
}
