import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Classname exam3
 * @Description TODO
 * @Date 2020/8/26 15:16
 * @Created by mmz
 */
public class exam3 {

    public int getMaxMul (String str) {
        int max = 0;
       HashSet<Character> hashSet = new HashSet<>();
       for(char chars:str.toCharArray()){
           hashSet.add(chars);
       }
       String name = "abcdefghijklmnopqrstuvwxyz";
       List<String> lists = Core(name.substring(hashSet.size()));
       return 0;

    }

    public boolean core(int[] nums,int[] num){
        for(int i = 0;i<nums.length;++i){
            if(nums[i] != num[i] && nums[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static List<String> Core(String word){
        List<String> lists = new ArrayList<>();
        int length = word.length();
        for(int i = 0;i<length;++i){
            for(int j = 0;j<length-i;++j){
                String sub = word.substring(i,i+j+1);
                System.out.println(sub);
                lists.add(sub);
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        exam3 exam3 = new exam3();
        System.out.println(exam3.getMaxMul("adcbadcbedbadedcbacbcadbc"));
    }
}
