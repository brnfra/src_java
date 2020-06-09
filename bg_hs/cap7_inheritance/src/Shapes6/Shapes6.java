/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Apache Netbenas Tools | Templates
 * and open the template in the editor.
 */
package Shapes6;

import Shapes5.*;


/**
 *
 * @author  brnfra
 */
public class Shapes6 {

    /**
     * @param args the command line arguments
     */
    //lembrar de separar as funções main por pacote
    public static void main(String[] args) {
        // TODO code application logic here
        //observe!
        //aloca espaço para variavel do tipo Triangle 
        //associa o obj a classe Triangle()
          Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle( 4.0);
        /*
        Observe!
            Cada construtor é responsável por criar
        objetos da sua respectiva classe, seja ela superclasse
        ou herdada.
        
        */
        /*
        *Observe!
        *objetos Triangle herdaram width e heidth
        *de TwoDShape. Sem haver a necessidade de 
        *nova declaração dentro da classe Triangle
        *Objetos da super não sabem da existencia de
        objetos das classes filhas
        */
        /*anterior
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";
        */
        
        t1 = t2;
        
                
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
           System.out.println("Area is " + t1.area());
           
        System.out.println();
        
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        
         System.out.println();
        
        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
        
    }
    
}
