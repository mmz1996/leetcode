import java.util.HashMap;
import java.util.HashSet;

/**
 * @Classname KuaiShou
 * @Description TODO
 * @Date 2020/9/25 11:44
 * @Created by mmz
 */
public class KuaiShou {
    public  static int core(String string){
        if(string == null || string.length() <=0){
            return -1;
        }
        char[] chars = string.toCharArray();
        int length = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i =0;i<string.length();++i){
            if(hashMap.containsKey(chars[i])){
                int tmp =  i-hashMap.get(chars[i]);
                if(tmp > length){
                    length = tmp;
                }
                hashMap.put(chars[i],i);
            }else{
                hashMap.put(chars[i],i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String string = new String("abca");
        System.out.println(core(string));
    }
}
