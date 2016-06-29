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
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        List<Integer> p = new ArrayList<>();
        p.add(7);
        p.add(2);
        p.add(5);
        p.add(2);
                        System.out.println(p);

        p.sort(new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {

                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if (i1 > i2) {
                    return 1;
                } else if (i1 < i2) {
                    return -1;
                } else {
                    return 0;
                }

            }
        });
        
                System.out.println(p);

    }

}
