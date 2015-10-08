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
class Feline {

    public String type = "f ";

    public Feline() {
        System.out.print("feline "+type);
    }
}

public class Cougar extends Feline {

    public Cougar() {
        System.out.print("cougar ");
    }

    public static void main(String[] args) {
        new Cougar().go();
    }

    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }
}
