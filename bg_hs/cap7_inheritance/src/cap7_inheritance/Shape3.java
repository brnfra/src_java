/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7_inheritance;

/**
 *
 * @author devlab
 */
public class Shape3 {
        Triangle t1 = new Triangle("filled", 4.0, 4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
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
       //  t1.setWidth(4.0);
      //  t1.setHeight(4.0);
      //  t1.style="filled";
         /*anterior
        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";
        */
      //   t2.setWidth(8.0);
      //  t2.setHeight(12.0);
      //  t2.style = "outlined";
         
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        
        System.out.println();
        
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        
}
