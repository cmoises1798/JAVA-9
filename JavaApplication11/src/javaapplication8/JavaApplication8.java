/*
 * To change this license header, choose License Headers in Proyect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
/**
 * 
 * @author A9
 */
public class JavaApplication8{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ){
        JavaApplication8_Menu menuHoy = new JavaApplication8_Menu();
        
        System.out.println("MENU 1");
        menuHoy.agregarComida("Ensalada");
        menuHoy.agregarComida("Lomo Saltado");
        menuHoy.agregarComida("Arroz con Pollo");
        menuHoy.agregarComida("Pollo a la Brasa");
        
        menuHoy.imprimirComidas();
        
        menuHoy.limpiarMenu();
        System.out.println("");
        System.out.println("MENU 2");
        menuHoy.agregarComida("Seco de Pollo");
        menuHoy.agregarComida("Arroz Chaufa");
        menuHoy.agregarComida("Tallarin Saltado");
        menuHoy.agregarComida("Ceviche");
        menuHoy.imprimirComidas();
    }
}