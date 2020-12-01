package question394_字符串解码;

import java.util.Scanner;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/12 20:02
 * @Created by mmz
 */
public class Mmz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            for(int i = 0;i<n;++i){
                String str1 = scanner.next();
                String str2 = scanner.next();
                String str3 = scanner.next();
                int count = scanner.nextInt();
                System.out.println(core(str1, str2, str3, count));
            }
        }
    }

    public static int core(String str1,String str2,String str3,int count){
        int n = str1.length();
        int m = str2.length();
        int t = str3.length();
        int counts = 0;
        if(n+m !=t){
            return -1;
        }
        boolean[][] flags = new boolean[n+1][m+1];

        flags[0][0] = true;

        for(int i =0;i<=n;++i){
            for(int j = 0;j<=m;++j){
                int temp = i+j-1;
                if(i>0){
                    flags[i][j] = flags[i][j] || (flags[i-1][j] && str1.charAt(i-1) == str3.charAt(temp));
                    counts++;
                }

                if(j>0){
                    flags[i][j] = (flags[i][j] || flags[i][j-1] && str2.charAt(j-1) == str3.charAt(temp));
                    counts++;
                }
            }
        }

        if(flags[n][m] && counts<=count){

            return 1;
        }else{
            return -1;
        }
    }
}
