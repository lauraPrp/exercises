package exercises;

import java.util.*;
import java.util.stream.Collectors;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SalesmanTravelKata {
          public static String travel(String r, String zipcode) {
          
        String output = "";
        String numbers = "";
        String[] addresses = r.split(",");
        for (String address : addresses) {
            String[] words = address.split(" "); //split into words
            String[] z = zipcode.split(" ");
            if (z[0].equals(words[words.length-2]) && z[1].equals(words[words.length-1])){
                if (output.equals("")){
                    output = output + zipcode + ":";
                }
            } else {
                continue;
            }

            if (!output.substring(output.length() - 1).equals(":")){
                output = output + ",";
            }

            for (int i = 1; i < words.length; i++){
                if(!isAllUpper(words[i])){
                    if (output.substring(output.length() - 1).equals(":") 
                        || output.substring(output.length() - 1).equals(",")){
                        output = output + words[i];
                    } else {
                        output = output + " " + words[i];
                    }
                }
            }

            if (numbers.equals("")){
                numbers = numbers + words[0];
            } else {
                numbers = numbers + "," + words[0];
            }
        }
        if (output.equals("")){
            output = zipcode + ":/";
        } else {
            output = output + "/" + numbers;
        }
        return output;
    }

    private static boolean isAllUpper(String s) {
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c) && Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}

