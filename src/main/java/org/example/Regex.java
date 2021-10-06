package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args){
        String line="Kaj";
        String pattern= "^[A-z]{3}";
        Pattern r= Pattern.compile(pattern);

        Matcher m = r.matcher(line);

        if(m.matches()){
            System.out.println("Matched Pattern:");

        }else
        {
            System.out.println(" No Matched :");
        }


    }
}
