/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjexemplosobrecarga;

import com.poo.prjexemplosobrecarga.classes.Teste;

/**
 *
 * @author iftm
 */
public class PrjExemploSobrecarga {

    public static void main(String[] args) {
        //new Teste ();
        
        //new Teste ("20/08/2062");
        
        Teste t = new Teste ();
        
        System.out.println("Resultado = " + t.somar(1, 5));
        System.out.println("Resultado = " + t.somar(5.5f, 1.5f));
        System.out.println("Resultado = " + t.somar(5, 1, 3));
        System.out.println("Resultado = " + t.somar("5", 4));
        System.out.println("Resultado = " + t.somar(5,"5"));
        
                
        
        
    }
}
