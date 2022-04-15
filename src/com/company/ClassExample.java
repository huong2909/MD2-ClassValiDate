package com.company;

import java.util.regex.Pattern;

public class ClassExample {
    private static final String CLASS_REGER = "^[CAP]\\d{4}[GHIKLM]$";
    public ClassExample(){
    }
    public boolean validate(String regex){
        return Pattern.matches(CLASS_REGER,regex);
    }
    private static ClassExample classExample;
    public static final String[] validClass = new String[] {"C0318G","A2584L","P8594K"};
    public static final String[] invalidClass = new String[] {"M0318G", "P0323A","E5P"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String c:validClass) {
            boolean isvalid = classExample.validate(c);
            System.out.println("Ten lop " + c + " la " + isvalid);
        }
        for (String c:invalidClass) {
            boolean isvalid = classExample.validate(c);
            System.out.println("Ten lop " + c + " la " + isvalid);
        }
    }

}
