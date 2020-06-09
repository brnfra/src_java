/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes6;

import Shapes5.*;




/**
 *
 * @author  brnfra
 */
//a palavra extends indica que Triangle herda TwoDShapes
public class Triangle extends TwoDShape {
    String style;
    //construtor default
    Triangle(){
        super();//chama o contrutor da superclass
        style = "none";
    }
    //criando construtor
    Triangle(String s, double w, double h){
        super(w,h);//chama o construtor da superclasse
       //super executa o contrutor de twoDShape
       //deve ser sempre a primeira sequencia dentro da subclasse
        
        style = s;
    }
    Triangle(double x){
        super(x); //chama o contrutor da superclass
        style="filled";
    }
    
    double area(){
        //observe!
        //podemos referenciar atributos TwoDShape
        //recebendo valor atraves do metodo
        return getWidth() * getHeight() / 2 ;
    }
    
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
    
}
