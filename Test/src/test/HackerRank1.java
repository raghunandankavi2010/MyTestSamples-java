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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank1 {
    private static ArrayList<String> result;
    
    
    public static void main(String[] args) {
        
        
       Scanner sc = new Scanner(System.in);
    
       int t = sc.nextInt();
       int a[] = new int[t];
       int b[] = new int[t];
       int n[] = new int[t];
      
       for( int j= 0; j<t;j++)
       {
        a[j] = sc.nextInt(); 
        b[j] = sc.nextInt();
        n[j] = sc.nextInt();
        sc.nextLine(); 
       } 
       
        for( int j= 0; j<t;j++)
        {
            ArrayList<String> list = calculate(a[j],b[j],n[j]);
            /*for(int i=0;i<list.size();i++)
            {
                System.out.print(list.get(i));
            }*/
          calculate(a[j],b[j],n[j]).forEach(System.out::print);
        }  
    }
    
    private static ArrayList<String> calculate(int a ,int b,int n)
    {
        result = new ArrayList<>(n);
        int start = a+(int)(Math.pow(b, 0))*b; 
        result.add(start+" ");
        for(int i=1;i<n;i++)
        {
           start = start +(int)(Math.pow(2, i)*b);
           result.add(start+" ");
        }
        result.add("\n"); 
        return result;
    }        
}

/*
3 3 3
0 0 5
6 6 10*/