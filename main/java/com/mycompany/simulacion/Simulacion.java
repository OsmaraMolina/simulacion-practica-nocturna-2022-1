/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simulacion;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Simulacion {

    public static void main(String[] args) {
 
        String nombreVehiculo = "";
        double precio = 0.0;
        String procedencia = "";
        int año = 0;
        String modelo = "";
        //proceso
        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese nombreVhc: \n");
        nombreVehiculo=ingreso.next();
        System.out.println("ingrese precio: \n");
        precio =ingreso.nextDouble();
        //validez
        if (precio <=0){
            System.out.println("el precio ingresado debe ser mayor a 0");
            System.exit(0);
        }
        //Fin de validacion
        System.out.println("ingrese procedencia: \n");
        procedencia=ingreso.next();
        //
        if (!procedencia.equals("EEUU") && !procedencia.equals("JAPON")){
            System.out.println("EL PAIS INGRESADO NO ES EL CORRECTO");
            System.exit(0);    
        }
        System.out.println("ingrese añoVehiculo: \n");
        año=ingreso.nextInt();
        System.out.println("ingrese modelo: \n");
        modelo=ingreso.next();

    }

}