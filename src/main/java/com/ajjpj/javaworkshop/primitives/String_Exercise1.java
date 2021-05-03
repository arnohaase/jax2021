package com.ajjpj.javaworkshop.primitives;


public class String_Exercise1 {
    public static int numWhitespaces(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(Character.isWhitespace(s.charAt(i))) count += 1;
        }
        return count;
    }

    public static String firstIdentifier(String s) {
        for (int start=0; start<s.length(); start++) {
            if(Character.isJavaIdentifierStart(s.charAt(start))) {
                int end = start;
                while(end < s.length() && Character.isJavaIdentifierPart(s.charAt(end))) {
                    end += 1;
                }

                return s.substring(start, end);
            }
        }

        return null; // no identifier
    }
}
