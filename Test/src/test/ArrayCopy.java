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
public class ArrayCopy {
    
    public static void main(String[] args)
    {
        int[] scores1 = { 1, 2, 3, 4, 5, 6};
        int[] scores2 = { 0, 0, 0, 0, 0, 0};
        System.arraycopy(scores2, 2, scores1, 3, 2);
        for(int i :  scores1) System.out.print(i);
    }
    
}
