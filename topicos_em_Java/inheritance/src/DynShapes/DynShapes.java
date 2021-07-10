/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Apache Netbenas Tools | Templates
 * and open the template in the editor.
 */
package DynShapes;


/**
 *
 * @author  brnfra
 */
public class DynShapes {

    /**
     * @param args the command line arguments
     */
    //lembrar de separar as funções main por pacote
    public static void main(String[] args) {
        // TODO code application logic here
        //observe!
        //aloca espaço para variavel do tipo Triangle 
        //associa o obj a classe Triangle()
        
      
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
        TwoDShape shapes[] = new TwoDShape[5];
        
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
         shapes[3] = new Triangle(7.0);
         shapes[4] = new TwoDShape(10, 20, "generic");
        
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is "+ shapes[i].getName());
            System.out.println("Area is "+ shapes[i].area());
            System.out.println();
        }
        
    }
    
}
