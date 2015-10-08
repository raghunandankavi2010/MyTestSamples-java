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
class Angle {

    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoolder");
        System.out.println("b1: " + b1.append(b2.substring(2, 5).toUpperCase()) + "b2: " + b2);
        System.out.println("b1: " + b2.insert(3, b1.append("a")) + "b2: " + b2);
        System.out.println("b1: " + b1.replace(3,4, b2.substring(4)).append(b2.append(false))+ "...b2: " + b2);
    }
}
