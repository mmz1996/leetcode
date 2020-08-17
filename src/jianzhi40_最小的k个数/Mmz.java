package jianzhi40_最小的k个数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 1:12
 * @Created by mmz
 */
public class Mmz {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr == null  || arr.length<k || k == 0){
            return new int[0];
        }
        int[] result = new int[k];
        Core(arr,0,arr.length-1);
        for(int i :arr){
            System.out.println(i);
        }
        for(int i = 0;i<k;++i){
            result[i] = arr[i];
        }
        return result;
    }

    public void Core(int[] arr,int start,int end){
        if(start>end){
            return;
        }
        int i = start;
        int j = end;
        int temp = arr[start];
        while(start<end){
            while(start<end && arr[end] >temp){
                end--;
            }
            while(start<end && arr[start] < temp){
                start++;
            }
            if(start<end){
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        arr[i] = arr[start];
        arr[start] = temp;
        Core(arr,i,start-1);
        Core(arr,start+1,j);
    }

    public static void main(String[] args) {

        Mmz mmz = new Mmz();
        mmz.getLeastNumbers(new int[]{0,1,2,4,2,2,3,1,4}, 8);
    }
}
