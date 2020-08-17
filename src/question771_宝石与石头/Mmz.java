package question771_宝石与石头;

import java.util.HashSet;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 12:08
 * @Created by mmz
 */
public class Mmz {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0;i<J.length();++i){
            hashSet.add(J.charAt(i));
        }
        int count  = 0 ;
        for(int i = 0;i<S.length();++i){
            if(hashSet.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
