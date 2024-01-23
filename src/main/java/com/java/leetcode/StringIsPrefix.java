package com.java.leetcode;

public class StringIsPrefix {
    public static void main(String[] args) {
        String ar[] ={"aa","aaaa","banana"};
                //{"i","love","leetcode","apples"};
        System.out.println(isPrefixString("a",ar));
    }
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< words.length;i++){
            builder.append(words[i]);
            if(builder.toString().equals(s)){
                return true;
            }
            else if(builder.length() > s.length()){
                return false;
            }
        }
       return false;

    }

}
