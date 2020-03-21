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
public class tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //tarea1.
             int may,men;
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno:");
        String nom =a.nextLine();
        System.out.println("INGRESE NOTAS");
        int nota1 = a.nextInt();
        int nota2 = a.nextInt();
        int nota3 = a.nextInt();
        
        if(nota1>nota2 && nota1>nota3){
                may = nota1;
            System.out.println("La nota mayor de "+nom+" es:"+may);
        }
            else if(nota1<nota2 && nota1<nota3){
                    men = nota1;
                    System.out.println("La nota menor "+nom+" es:"+men);
                    }
        if(nota2>nota1 && nota2>nota3){
                    may = nota2;
                    System.out.println("La nota mayor de "+nom+" es:"+may);
        } 
            else if(nota2<nota1 && nota2<nota3){
                    men = nota2;
                    System.out.println("La nota menor de "+nom+" es:"+men);
        }
        if(nota3>nota1 && nota3>nota2){
                    may=nota3;
                    System.out.println("La nota mayor de "+nom+" es:"+may);
        }    
            else if(nota3<nota1 && nota3<nota2){
                men=nota3;
            System.out.println("La nota menor de "+nom+" es:"+men);
            }
    }
    
}
