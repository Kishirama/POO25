/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjexemplosobrecarga.classes;

/**
 *
 * @author iftm
 */
public class Teste {
  
    //Metodo construtor sem parametro
    public Teste () {
    
        System.out.println("Limão sisiliano e muito bom");

    }
    //Metodo contrutor que recebe parametro
    public Teste (String data){
        System.out.println("Limão sisiliano e bom" + data);
        
    }
      
    public int somar(int nro1, int nro2){
        
        
        return nro1 + nro2;
    }
    
    public int somar(int nro1, int nro2, int nro3){
        
        return nro1 + nro2 + nro3;
    }
    
    public float somar(float nro1, float nro2){
        
        
        return nro1 + nro2;
    }
    
    public float somar (String nro1, float nro2){
        
        return Float.parseFloat(nro1) + nro2;
    }
    public float somar (float nro1, String nro2){
        
        return nro1 + Float.parseFloat(nro2);
    }
}
 
