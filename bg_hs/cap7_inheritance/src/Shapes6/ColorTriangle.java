/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes6;

/**
 *
 * @author sirbr
 */
public class ColorTriangle extends Triangle {
    //TwoDShape -> Triangle -> ColorTriangle
    private String color;
    ColorTriangle(String c, String s, double w, double h){
        //chama o construtor de Triangle
        super(s, w, h);
        color = c;
    }
    
    String getColor(){
        return color;
    }
    
    void showColor(){
        System.out.println("Color is " + color);
    }
    
}
