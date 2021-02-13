/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.menuestandar.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class MenuEstandar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("******************************");
            System.out.println("      Menu de opciones        ");
            System.out.println("******************************");
            System.out.println("*   Selecciona una opcion: ");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion "+opcion);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion "+opcion);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion "+opcion);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
