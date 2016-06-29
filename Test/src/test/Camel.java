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
interface Rideable {

    String getGait();
}

public class Camel implements Rideable {

    int weight = 2;

    public static void main(String[] args) {
        new Camel().go(8);
    }

    void go(int speed) {
        ++speed;
        weight++;
        int walkrate = speed * weight;
        System.out.print(walkrate + getGait());
    }

    @Override
    public String getGait() {
        return " mph, lope";
    }
}
