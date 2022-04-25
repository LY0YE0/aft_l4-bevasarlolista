/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aft_l4.bevasarlolista;

/**
 *
 * @author Dani
 */
public class Singleton {
    private static BevasarloLista single_instance = null;
    
    public static BevasarloLista getInstance(){
        if (single_instance== null) {
            single_instance = new BevasarloLista();
        }
        
        return single_instance;
    }
    
}
