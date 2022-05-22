/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snack;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Snack {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        componentes com =new componentes();
        menu men= new menu();
        Combos comb=new Combos();
        
        
        System.out.println("===BIENVENIDO SELECCIONE SU MENU POR FAVOR===");
        System.out.println("1. Preparar Hamburguesa");
        System.out.println("2. Hamburguesas");
        System.out.println("3. Selecionar Combos");
        System.out.println("4. Salir");
        
        int n=sc.nextInt();
        if(n!=4){
            
        switch(n)
        {
        case 1:
            int o;
            String ham[];
            double cont=0;
            double contR=0;
            String pre="";
            do{
            System.out.println("selecciona Tus Ingredientes:");
            System.out.println("1. Tomate");
            System.out.println("2. Hamburguesa(pan y carne)");
            System.out.println("3. Queso");
            System.out.println("4. Lechuga");
            System.out.println("5. Papas Fritas");
            System.out.println("6. Refresco");
            System.out.println("7. Soda mini");
            System.out.println("8. Pedir");
            o=sc.nextInt();
            
            
            
                switch(o){
                case 1:
                    cont=com.Tomate;
                    pre="Tomate";
                    break;
                case 2:
                    cont=com.Hamburguesa;
                    pre="Hamburguesa";
                    break;
                case 3:
                    cont=com.Queso;
                    pre="Queso";
                    break;
                case 4:
                    cont=com.Lechuga;
                    pre="Lechuga";
                    break;
                case 5:
                    cont=com.Papafrita;
                    pre="Papafrita";
                    break;
                case 6:
                    cont=com.Refresco;
                    pre="Refressco";
                    break;
                case 7:
                    cont=com.SodaMini;
                    pre="Soda Mini";
                    break;
                default:
                    System.out.println("Selecciona un ingrediente");
                    }
                contR=contR+cont;
                
            
            }while(o!=8);
            System.out.println("Hamburguesa Especial :"+contR+"Bs");
            break;
        case 2:
            System.out.println(">>>>>>>>Seleccion la Hamburguesa de su Preferencia<<<<<<<");
            System.out.println("1. Hamburguesa Simple");
            System.out.println("2. Hamburguesa Doble");
            System.out.println("3. Hamburguesa de Queso");
            System.out.println("4. Volver");
            
            int x=sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("Hamburguesa Simple: "+men.Hsimple());
                    break;
                case 2:
                    System.out.println("Hamburguesa Doble: "+men.HDoble());
                    break;
                case 3:
                    System.out.println("Hamburguesa de Queso: "+men.HQueso());
                default:
                    System.out.println("Seleccione el menu establecido");
                    
            }
            break;
        case 3:
            System.out.println(">>>>>>>>>Seleccione su Combo<<<<<<<<<");
            System.out.println("1. Combo 1");
            System.out.println("2. Combo 2");
            System.out.println("3. Combo 3");
            System.out.println("4. Combo 4");
            System.out.println("5. Volver");
            int p=sc.nextInt();
            switch(p){
                case 1:
                    System.out.println("Combo 1: "+comb.HCombo1());
                    break;
                case 2:
                    System.out.println("Combo 2: "+comb.HCombo2());
                    break;
                case 3:
                    System.out.println("Combo 3: "+comb.HCombo3());
                case 4:
                    System.out.println("Combo 4: "+comb.HCombo4());
                default:
                    System.out.println("Seleccione el menu establecido");
                    
            }
            
            break;
        default:
            System.out.println("Menu no identificado");
            
        }
        }
        else{
            System.out.println("====Gracias por su visita====");
    }
        
    }
}
