/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        Hospital hospital2= new Hospital();
        // Se asigna valores particulares al objeto
        hospital.nombre = "San Jacinto";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 430340.43;
        hospital2.nombre = "asdasd";
        hospital2.numeroCamas = 200;
        hospital2.presupuesto = 2342321.65;
                
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
