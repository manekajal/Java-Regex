package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args){
        String firstName="Kaj";
        String lastName="Man";
        String pattern= "^[A-z]*[A-Z]{3}";
        Pattern r= Pattern.compile(pattern);

        Matcher m = r.matcher(firstName);

        if(m.matches()){
            System.out.println("Matched Pattern:" );

        }else
        {
            System.out.println(" No Matched :");
        }


    }
}
