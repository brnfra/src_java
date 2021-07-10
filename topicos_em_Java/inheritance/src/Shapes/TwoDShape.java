/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;



/**
 *
 * @author  brnfra
 */
//a class for obj 2d
//membros privados não são herdados
public class TwoDShape {
   
    double width;
     double height;
    
    
    /*
    Qnd setar como private?
    1-Se uma variável de instancia vai ser usada apenas
        na classe. torne ela privada
    2-se tiver que impor limites, ou dentro de algum limite ou controle
        deverá ser privada e acessada por métodos acessadores.
    
    */
   

   
    
    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
    
}
