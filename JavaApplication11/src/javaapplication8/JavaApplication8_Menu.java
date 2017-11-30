/*
 * To change this license header, choose License Headers in Proyect Properties.
 * To cahnge this template file, choose Tools | Tenplates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 
 * @author A9
 */
public class JavaApplication8_Menu {
    private ArrayList<String> comidas;
    public JavaApplication8_Menu(){
        this.comidas = new ArrayList<String>();
    }
    //add the methods here
    public void agregarComida(String comida){
        this.comidas.add(comida);
        HashSet hs=new HashSet();
        hs.addAll(this.comidas);
        this.comidas.clear();
        this.comidas.addAll(hs);
    }
    public void imprimirComidas(){
        for(String Comidas:this.comidas){
            System.out.println(Comidas);
        }
    }
    public void limpiarMenu(){
        (this.comidas).clear();
        
        }
    }
    
