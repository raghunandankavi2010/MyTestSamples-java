/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Raghunandan
 */
public class Sequence {

    int x;
    Sequence() {
        System.out.print("c ");//2
    }

    {
        System.out.print("y ");
    }
    
    {
        System.out.print("z "+x+" ");
    }
    public void print()
    {
        System.out.print("Hello");
    }

    public static void main(String[] args) {
        new Sequence().go();
    }

    void go() {
        System.out.print("g ");//3
    }

    static {
        System.out.print("x ");//1
    }
}
