import com.sun.org.apache.regexp.internal.RE;

/**
 * @Classname exam_202008226
 * @Description TODO
 * @Date 2020/8/26 19:14
 * @Created by mmz
 */
public class exam_202008226 {


    public void core(int a,int b){
        int[] aresult = new int[32];
        int[] bresult = new int[32];

        int newa = a;
        int newb = b;
        int counta  = 0;
        int countb = 0;
        while(newa !=0){
            if((newa &1) ==1){
                aresult[counta]++;
            }
            counta++;
            newa = newa >>1;
        }
        while(newb !=0){
            if((newb &1) ==1){
                bresult[countb]++;
            }
            countb++;
            newb = newb >>1;
        }
        for(int i :aresult){
            System.out.println(i);
        }
        for(int i = 0 ;i<aresult.length;i=i+2){
            int temp = aresult[i];
            aresult[i] = aresult[i+1];
            aresult[i+1] =temp;
        }
        for(int i = 0 ;i<bresult.length;i=i+2){
            int temp = bresult[i];
            bresult[i] = bresult[i+1];
            bresult[i+1] =temp;
        }
        int afirst = aresult[0];
        int bfirst = bresult[0];
        int asecond = aresult[1];
        int bsecond = bresult[1];

        for(int i=0;i<aresult.length-2;++i){
            aresult[i] = aresult[i+2];
        }
        aresult[30] = bsecond;
        aresult[31] = bfirst;
        for(int i = 0;i<bresult.length-2;++i){
            bresult[i] = bresult[i+2];
        }
        bresult[30] = asecond;
        bresult[31] = afirst;

        int resulta =0,resultb=0;
        for(int i :aresult){
            System.out.println(i+ "mmz");
        }
        for(int i=31;i>=0;i--){
            resulta =resulta<<1;
            resulta +=1&aresult[i];
        }

        System.out.println(resulta);
    }
    public static void main(String[] args) {
        exam_202008226 exam_202008226 = new exam_202008226();
        exam_202008226.core(1,2);
    }
}







