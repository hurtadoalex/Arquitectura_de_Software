/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snack;

/**
 *
 * @author Alex
 */
public class menu {
    public double Simple;
    public double Doble;
    public double Queso;
    
    componentes com =new componentes();
    public menu(){
        
    }

    
    public double Hsimple(){
        Simple = com.Hamburguesa+com.Lechuga+com.Papafrita;
        return Simple;
    }
    public double HDoble(){
        Doble = com.Hamburguesa+com.Hamburguesa+com.Lechuga+com.Papafrita+com.Queso;
        return Doble;
    }
    public double HQueso(){
        Queso = com.Queso+com.Hamburguesa+com.Lechuga+com.Papafrita;
        return Queso;
    }

    public menu(double Simple, double Doble, double Queso) {
        this.Simple = Simple;
        this.Doble = Doble;
        this.Queso = Queso;
    }

    public double getSimple() {
        return Simple;
    }

    public void setSimple(double Simple) {
        this.Simple = Simple;
    }

    public double getDoble() {
        return Doble;
    }

    public void setDoble(double Doble) {
        this.Doble = Doble;
    }

    public double getQueso() {
        return Queso;
    }

    public void setQueso(double Queso) {
        this.Queso = Queso;
    }

    public componentes getCom() {
        return com;
    }

    public void setCom(componentes com) {
        this.com = com;
    }
    
    
    
    
}
