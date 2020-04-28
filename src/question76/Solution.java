package question76;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution{
    public static String minWindow(String s, String t) {
        int start = 0,minLen = Integer.MAX_VALUE;
        int left = 0 ,right = 0;
        String res = s;
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> needs = new HashMap<>();
        char[] chars = t.toCharArray();
        for(char ch : chars){
            needs.put(ch,1);
        }
        int match= 0 ;

        while(right<s.length()){
            char c1 = s.charAt(right);
            if(needs.containsKey(c1)){
                if(window.containsKey(c1)){
                    window.put(c1,window.get(c1)+1);
                }else{
                    window.put(c1,1);
                }
                if(needs.get(c1).compareTo(window.get(c1))==0){
                    match++;
                }
            }
            right++;
            while(match == needs.size()){

                if(right-left<minLen){
                    minLen = right-left;
                    res = s.substring((int)left, (int)right);
                }
                char c2  = s.charAt(left);
                if(needs.containsKey(c2)){
                    if(window.get(c2) == 1){
                        window.remove(c2);
                    }else{
                        window.put(c2,window.get(c2)-1);
                    }
                    if(window.size() <needs.size() ){
                        match--;
                    }
                }
                left++;
            }
        }



        return res;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}