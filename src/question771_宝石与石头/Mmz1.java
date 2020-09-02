package question771_宝石与石头;

import java.util.HashSet;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/2 20:05
 * @Created by mmz
 */
public class Mmz1 {
    public int numJewelsInStones(String J, String S) {
        if(J.length() <=0 || S.length()<=0){
            return 0;
        }

        HashSet<Character> hashSet = new HashSet<>();
        for(Character character :J.toCharArray()){
            hashSet.add(character);
        }

        int count = 0 ;
        for(Character character :S.toCharArray()){
            if(hashSet.contains(character)){
                count++;
            }
        }

        return count;
    }
}
