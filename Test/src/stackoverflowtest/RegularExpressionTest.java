/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackoverflowtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Raghunandan
 */
public class RegularExpressionTest {

    public static void main(String args[]) {
        String s = " uncle bar, is a foo bar kind of guy when he is at the bar ";
        Pattern p;
        Matcher m;
        p = Pattern.compile("(?i) bar ");
        m = p.matcher(s);
        if (m.find()) {
            s= s.replaceAll("(?i)(?<!\\bfoo )bar\\b", "foo bar");
            System.out.println("String is "+s);
        }
    }
}
