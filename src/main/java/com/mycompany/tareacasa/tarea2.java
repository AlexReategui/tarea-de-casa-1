/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareacasa;

import java.util.Scanner;

/**
 *
 * @author reate
 */
public class tarea2 {
    public static void main(String[] args) {
        //tarea2
        Scanner sal = new Scanner(System.in);
        System.out.println("Ingrese Horas laboradas");
        int a = sal.nextInt();
            if(a<=40){
            int t = a*16;
                System.out.println("El monto a pagar es:"+t);         
            }
            else{
              int  t=(a-40)*20+(40*16);
                System.out.println("El monto a pagar es:"+t);
                //fin..
            } 
}
}
