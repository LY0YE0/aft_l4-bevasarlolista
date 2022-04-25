/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aft_l4.bevasarlolista;

import java.util.Comparator;

/**
 *
 * @author Dani
 */
public class NevComparator implements Comparator<Termek>{

    @Override
    public int compare(Termek t, Termek t1) {
        return t.getNev().compareTo(t1.getNev());
    }
    
}
