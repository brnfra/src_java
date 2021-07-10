/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynShapes;

/**
 *
 * @author sirbr
 */
public class Rectangle extends TwoDShape {
    //default constructor
    Rectangle(){
        super();
        
    }

    //constructor para Rectangle
    Rectangle(double w, double h){
        super(w, h, "rectangle"); //chama o construtor da superclasse
    }
    //construtor para um quadrado
    Rectangle(double x){
        super(x, "square");
    }
    //construtor de um objeto de outro objeto
    Rectangle(Rectangle ob){
        super(ob); // passa um obj para TwoDShape constructor
    }
    
    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }
    //override area() for Ractangle
    double area(){
        return getWidth() * getHeight();
    }


}

