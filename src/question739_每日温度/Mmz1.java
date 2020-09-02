package question739_每日温度;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/2 20:54
 * @Created by mmz
 */
public class Mmz1 {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] ans = new int[length];

        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<length;++i){
            int temperature = T[i];

            while(!stack.isEmpty() && temperature > T[stack.peek()]){
                int preIndex = stack.pop();
                ans[preIndex] = i-preIndex;
            }

            stack.add(i);
        }
        return ans;
    }

}
