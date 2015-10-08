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
class Alpha {

    String getType() {
        return "alpha";
    }
   
}

class Beta extends Alpha {

    String getType() {
        return "beta";
    }
}

class Gamma extends Beta {

    String getType() {
        return "gamma";
    }
    
  

    public static void main(String[] args) {
        Alpha g1 = new Gamma();
        Alpha g2 = new Gamma();
        System.out.println(g1.getType() + " "
                );
    }
}
