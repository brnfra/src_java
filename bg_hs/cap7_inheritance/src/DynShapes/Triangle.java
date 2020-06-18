/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynShapes;



/**
 *
 * @author  brnfra
 */
//a palavra extends indica que Triangle herda TwoDShapes
public class Triangle extends TwoDShape {
   private String style;
    //construtor default
    Triangle(){
        super();//chama o contrutor da superclass
        style = "none";
    }
    
    //criando construtor
    Triangle(String s, double w, double h){
        super(w,h,"Triangle");//chama o construtor da superclasse
       //super executa o contrutor de twoDShape
       //deve ser sempre a primeira sequencia dentro da subclasse
        
        style = s;
    }
    
    Triangle(double x){
        super(x, "triangle"); //chama o contrutor da superclass
        style="filled";
    }
    
    //objeto de um objeto como em TwoDShape
    Triangle(Triangle ob){
        super(ob);//passsa objeto para TwoDShape construtor
        style = ob.style;
    }
    //Override area() para Triangle
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
