import java.util.LinkedList;

/**
 * @Classname exam
 * @Description TODO
 * @Date 2020/8/26 14:30
 * @Created by mmz
 */
public class exam {
    public int getMaxSubstringLen (String str) {
        // write code here
        int max = 0;
        char[] chars = str.toCharArray();


        for(int i = 0;i<chars.length;++i){
            int[] result = new int[5];
            StringBuffer stringBuffer = new StringBuffer();
            for(int j = i;j<chars.length;++j){

                stringBuffer.append(chars[j]);
                if(chars[j] >='a' && chars[j] <='e'){
                    result[chars[j]-'a']++;
                }
                if(core(result)){
                    if(max <stringBuffer.length()){
                        max = stringBuffer.length();
                    }
                }
            }
        }
        return max;
    }

    public boolean core(int[] result){
        for(int i =0;i<result.length;++i){
            if(result[i] %2 != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        exam e = new exam();
        System.out.println(e.getMaxSubstringLen("asdfajskfbb"));
    }
}
