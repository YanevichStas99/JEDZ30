package com.company;

import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static boolean cheackEmail(String email) {
        if (!email.contains("@")) {
            return false;
        }
        if (!email.contains(".com")) {
            return false;
        }
        if (email.length() < 8) {
            return false;
        }
        if (email.contains(" ")) {
            return false;
        }
        return true;
    }

    public static boolean cheackPassword(String password) {
        if (password.length() < 8 || password.length()>20) {
            return false;
        }
        if (password.contains(" ")){
            return false;
        }
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i <password.length() ; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                count++;
            }
            if (Character.isLowerCase(ch)){
                count1++;
            }
            if (Character.isDigit(ch)){
                count2++;
            }
        }
        if (count == 0){
            return false;
        }
        if (count1 == 0){
            return false;
        }
        if (count2 == 0){
            return false;
        }
        if (!Charset.forName("US-ASCII").newEncoder().canEncode(password)){
            return false;
        }
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        if (!m.find()){
            return false;
        }
        return true;
    }
}
