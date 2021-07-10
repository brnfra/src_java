/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseSuper;

/**
 *
 * @author sirbr
 */
public class B extends A{
    int i; //this hide the i in A
    //constructor
    B(int a, int b){
        //observe!
        //aqui, super.i refere a i em A
    super.i = a;
    i = b; //aqui em B
    }
    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
