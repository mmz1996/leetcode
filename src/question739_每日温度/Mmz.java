package question739_每日温度;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 14:49
 * @Created by mmz
 */
public class Mmz {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];

        for(int i = 0;i<length-1;++i){
            if(T[i] <T[i+1]){
                result[i] = 1;
            }else{
                int count = 0;
                int j = i;
                while((j+1)<length && T[i]>=T[j+1]  ){
                    count++;
                    j++;
                }
                if(j+1>=length){
                    result[i] = 0;
                }else{
                    result[i] = j-i+1;
                }

            }
        }
        return result;
    }
}
