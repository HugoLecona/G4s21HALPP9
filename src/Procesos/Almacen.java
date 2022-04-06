/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author lecona
 */
public class Almacen {
    
    public void grabar(String cadena){
        try{
            FileWriter  archivo = new FileWriter("Datos.txt", true);
            BufferedWriter almacena = new BufferedWriter(archivo);
            almacena.write(cadena + "\n");
            almacena.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<String> leer(){
        ArrayList<String> informacion = new ArrayList<String>();
        
        try{
            FileReader archivo = new FileReader("Datos.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String lineas;
            
            while((lineas = datos.readLine())!= null){
                informacion.add(lineas);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return informacion;
    }

    public void borrar(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
