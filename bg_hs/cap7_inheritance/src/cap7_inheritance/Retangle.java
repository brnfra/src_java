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
public class Retangle extends TwoDShape {
    boolean isSquare(){
        //recebendo atraves dos metodos
        if(getWidth() == getHeight()) return true;
        return false;
    }
    double area(){
        return getWidth() * getHeight();
    }
}
