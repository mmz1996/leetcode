package question242_有效的字母异位;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/7 22:54
 * @Created by mmz
 */
public class Mmz {
    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        return Arrays.equals(schar,tchar);
   }
}
