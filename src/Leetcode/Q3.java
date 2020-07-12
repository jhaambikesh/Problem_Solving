package Leetcode;

import java.util.*;

public class Q3{
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> lastAppearance = new HashMap<>();
        int result =0;
        int subStringStart = 0;
        for(int i=0;i<s.length();i++){
            if(lastAppearance.containsKey(s.charAt(i)))
                subStringStart = Math.max(subStringStart,lastAppearance.get(s.charAt(i))+1);
            result = Math.max(result,i-subStringStart+1);
            lastAppearance.put(s.charAt(i),i);
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "bbbbbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}