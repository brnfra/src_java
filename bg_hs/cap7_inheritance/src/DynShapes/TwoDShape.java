/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynShapes;

//use dynamic method dispatch

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
 class TwoDShape {
    private double width;
    private double height; 
    private String name;
    //A default construtor 
    TwoDShape(){
    width =height = 0.0   ;
    name = "none";
    }
    //construtor parametrizado de TwoDShaps
    TwoDShape(double w, double h, String n){
    width = w;
    height = h;
    name = n;
    }
    //construct object with equal width and height
    TwoDShape(double x, String n){
    width = height = x;
    name = n;
    }
    // construir um objeto de outro objeto
    TwoDShape (TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    
    
    //métodos para acessar atributos privados
    //gets
    double getWidth(){return width;}
    double getHeight(){return height;}
    String getName(){ return name;}
    //sets
    void setWidth(double w){ width=w;}
    void setHeight(double h){ height=h;}
   
    
    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
    //definindo metodo área
    double area(){
        System.out.println("area() must be overriden");
        return 0.0 ;
    }
    
}
