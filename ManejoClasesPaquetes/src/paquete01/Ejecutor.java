/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        //agregar valores a atributos de h1 y h2 por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreHospital;
        String nombreHospital2;
        Hospital h1 = new Hospital();
        System.out.println("Ingrese el nombre del hospital");
        nombreHospital = entrada.nextLine();
        System.out.println("Ingrese el numero de camas");
        int numerocamas = entrada.nextInt();
        System.out.println("Ingrese el presupuesto");
        double presupuesto = entrada.nextDouble();
        h1.establecerNombre(nombreHospital);
        h1.establecerNumeroCamas(numerocamas);
        h1.establecerPresupuesto(presupuesto);
        
        entrada.nextLine();//limpieza de buffer

        Hospital h2 = new Hospital();
        System.out.println("Ingrese el nombre del hospital 2");
        nombreHospital2 = entrada.nextLine();
        System.out.println("Ingrese el numero de camas 2");
        int numerocamas2 = entrada.nextInt();
        System.out.println("Ingrese el presupuesto 2");
        double presupuesto2 = entrada.nextDouble();
        h2.establecerNombre(nombreHospital2);
        h2.establecerNumeroCamas(numerocamas2);
        h2.establecerPresupuesto(presupuesto2);

        System.out.printf("%s \n", "Hola desde el main");
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(), h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(), h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
    }
}
