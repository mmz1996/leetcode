package question139_单词拆分;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/5 0:02
 * @Created by mmz
 */
public class Mmz {
    public boolean workBreak(String s, List<String> wordDict){
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];

        dp[0] = true;
        for(int i = 1;i<=s.length();++i){
            for(int j = 0;j<i;j++){
                if(dp[j] && wordDictSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
