/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aft_l4.bevasarlolista;

/**
 *
 * @author Dani
 */
public class Termek {

    private static int counter;
    private int id;
    private String nev;
    private String leiras;
    private boolean hutes; //true -> kell hűteni
    private int darab;
    private int egysegar;

    //id autoincrement
    public Termek(String nev, String leiras, boolean hutes, int darab, int egysegar) {
        this.nev = nev;
        this.leiras = leiras;
        this.hutes = hutes;
        this.darab = darab;
        this.egysegar = egysegar;
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public boolean isHutes() {
        return hutes;
    }

    public void setHutes(boolean hutes) {
        this.hutes = hutes;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    public int getEgysegar() {
        return egysegar;
    }

    public void setEgysegar(int egysegar) {
        this.egysegar = egysegar;
    }

}
