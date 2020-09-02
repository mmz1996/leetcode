import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/23 10:59
 * @Created by mmz
 */
public class Mmz1 {
    static List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null){
            return lists;
        }
        Core(0,new ArrayList(),nums);
        return lists;

    }
    public void Core(int index,List<Integer> list,int[] nums){
        lists.add(new ArrayList(list));
        for(int i = index ;i<nums.length;++i){
            list.add(nums[i]);
            Core(i+1,list,nums);
            list.remove(list.size()-1);
        }
    }

    public static boolean core(List<Integer> list,int k){
        for(int i = 0;i<list.size();++i){
            for(int j =i+1;j<list.size();++j){
                int sum = 0;
                if(i == j){
                     sum =list.get(i);
                }else{
                     sum = list.get(i)+list.get(j);
                }
                if(sum%k ==0){
                   return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 10;
        int[] result = new int[1];
        result[0] = i;
        System.out.println(result[0]);
        i = 100;
        System.out.println(result[0]);
        String name = "mmz";
    }
}
