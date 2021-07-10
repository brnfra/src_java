/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes5;

/**
 *
 * @author  brnfra
 */
//a class for obj 2d
//membros privados não são herdados

   /*Super parametro para chamar construtor por uma subclasse*/
    /*
    Qnd setar como private?
    1-Se uma variável de instancia vai ser usada apenas
        na classe. torne ela privada
    2-se tiver que impor limites, ou dentro de algum limite ou controle
        deverá ser privada e acessada por métodos acessadores.
    
    */
public class TwoDShape {
    private double width;
    private double height; 
    //A default construtor 
    TwoDShape(){
    width =height = 0   ;
    }
    //construtor parametrizado de TwoDShaps
    TwoDShape(double w, double h){
    width = w;
    height = h;
    }
    //construct object with equal width and height
    TwoDShape(double x){
    width = height = x;
    ;
    }
    //métodos para acessar atributos privados
    //gets
    double getWidth(){return width;}
    double getHeight(){return height;}
    //sets
    void setWidth(double w){ width=w;}
    void setHeight(double h){ height=h;}
   
    
    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
    
}
