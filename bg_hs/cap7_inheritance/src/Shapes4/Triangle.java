/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes4;

import Shapes3.*;



/**
 *
 * @author  brnfra
 */
//a palavra extends indica que Triangle herda TwoDShapes
public class Triangle extends TwoDShape {
    String style;
    
    //criando construtor
    Triangle(String s, double w, double h){
        super(w,h);
       //super executa o contrutor de twoDShape
       //deve ser sempre a primeira sequencia dentro da subclasse
        
        style = s;
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
