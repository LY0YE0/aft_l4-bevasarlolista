/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aft_l4.bevasarlolista;

import java.util.*;

/**
 *
 * @author Dani
 */
public class BevasarloLista {

    private ArrayList<Termek> termekek = new ArrayList<>();
    private int vegosszeg;

    public ArrayList<Termek> getTermekek() {
        return termekek;
    }

    public void hozzaAd(Termek t) {
         termekek.add(t);
    }

    public void torol(int t_id) {
        termekek.remove(t_id);
    }

    public ArrayList<Termek> rendezes() {
        //todo minden meghívásra változik hogy növekvő vagy csökkenő
        return null;
    }

    public int getVegosszeg() {
        return vegosszeg;
    }

}
