/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7_inheritance;

/**
 *
 * @author  brnfra
 */
//a palavra extends indica que Triangle herda TwoDShapes
public class Triangle extends TwoDShape {
    String style;
    
    //criando construtor
    Triangle(String s, double w, double h){
        setWidth(w);
        setHeight(h);//inicializa a parte do objeto 
        //referente a superclasse herdada
        
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
