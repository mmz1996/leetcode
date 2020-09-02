package question767_重构字符串;

import java.util.Arrays;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/2 20:15
 * @Created by mmz
 */
public class Mmz1 {
    public String reorganizeString(String S) {
        int length = S.length();
        int[] counts = new int[26];

        for(Character character :S.toCharArray()){
            counts[character-'a'] +=100;
        }

        for(int i = 0;i<26;++i){
            counts[i] +=i;
        }


        Arrays.sort(counts);
        char[] result = new char[length];
        int index =1;
        for(int count:counts){
            int len = count/100;
            char now = (char) ('a' +count%100);

            if(len > (length+1)/2){
                return "";
            }

            for(int j = 0 ;j<counts.length;++j){
                if(index >=length){
                    index = 0;
                }
                result[index] = now;
                index +=2;

            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        System.out.println(mmz.reorganizeString("aab"));
    }
}
