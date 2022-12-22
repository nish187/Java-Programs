package com.BridgeLabz;

public class EqualStrings {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "SACHIN";
        //equal for getting strings are equal or not
        System.out.println(s1.equals(s2));
        //compare to get 32 as case-sensitive method
        System.out.println(s1.compareTo(s2));
    }
}
