/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Raghunandan
 */
public class Test {
boolean bool;
String recording;

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording;
    }


    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double SQRT_2 = Math.sqrt(2);
          System.out.println(SQRT_2);
        /*int i = 461012;
        System.out.format("The value of i is: %d %n", i);
        // TODO code application logic 

//        String input = "नमस्ते";
//        
//        
//        float x = 3/(4f);
        try 
        {
            
          //System.out.print(" Input value is" + new String(input.getBytes("UTF-8")));
        String stopword = "2015-23-023-43-23-56 ";

        Pattern pattern = Pattern.compile("(?<=-)[0-9]{2}(?=-)");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stopword);

        while (matcher.find()) {
            //System.out.println("Start index: " + matcher.start());
            //System.out.println("End index: " + matcher.end());
            System.out.println("Matched String: "+ matcher.group());
        }
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

}
