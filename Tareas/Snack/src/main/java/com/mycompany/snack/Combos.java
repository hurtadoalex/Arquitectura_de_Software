/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snack;

/**
 *
 * @author Alex
 */
public class Combos {
    public double Combo1;
    public double Combo2;
    public double Combo3;
    public double Combo4;
    
    componentes com =new componentes();
    menu men= new menu();
    public Combos(){
        
    }


    public double HCombo1(){
        Combo1= men.getSimple()+com.Refresco-0.5;
        return Combo1;
    }
    public double HCombo2(){
        Combo2=men.getSimple()+com.SodaMini-1;
        return Combo2;
    }
    public double HCombo3(){
        Combo3=2*men.getDoble()+2*com.SodaMini-1.5;
        return Combo3;
    }
    public double HCombo4(){
        Combo4=men.getDoble()+men.getQueso()+2*com.SodaMini-1;
        return Combo4;
    }

    public Combos(double Combo1, double Combo2, double Combo3, double Combo4) {
        this.Combo1 = Combo1;
        this.Combo2 = Combo2;
        this.Combo3 = Combo3;
        this.Combo4 = Combo4;
    }

    public double getCombo1() {
        return Combo1;
    }

    public void setCombo1(double Combo1) {
        this.Combo1 = Combo1;
    }

    public double getCombo2() {
        return Combo2;
    }

    public void setCombo2(double Combo2) {
        this.Combo2 = Combo2;
    }

    public double getCombo3() {
        return Combo3;
    }

    public void setCombo3(double Combo3) {
        this.Combo3 = Combo3;
    }

    public double getCombo4() {
        return Combo4;
    }

    public void setCombo4(double Combo4) {
        this.Combo4 = Combo4;
    }

    public componentes getCom() {
        return com;
    }

    public void setCom(componentes com) {
        this.com = com;
    }

    public menu getMen() {
        return men;
    }

    public void setMen(menu men) {
        this.men = men;
    }
    

    
}
