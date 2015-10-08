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
public class MyClass
{
        int x = 0;

   public class InnerClass1
   {
    public void runThis()
    {
        int x=100;
        tryThis(this);
        return;
    }
   }


  public class InnerClass2
  {
  
    public void runThis()
    {
        x=200;
        tryThis(this);
        return;
    }
 }

 public static void main(String[] args)
 {
    MyClass x = new MyClass();
  }

 private <T > void tryThis(T temp)
 {
  
 }
}