package question215_数组中第k个最大元素;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/6 22:38
 * @Created by mmz
 */
public class Mmz {

    public static int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length <=0){
            return -1;
        }
        return nums[CoreFind(nums,nums.length-k,0,nums.length-1)];

    }
    static int CoreFind(int[] arr,int k,int start,int end){
        if(start<end){
            int pos = quick(arr,start,end);
            if(pos == k){
                return pos;
            }else if(pos < k){
                return CoreFind(arr,k,pos+1,end);
            }else{
                return CoreFind(arr,k,start,pos-1);
            }
        }
        return start;
    }

    static int quick(int[] arr,int start,int end){
        if(start>end){
            return -1;
        }
        int index = arr[start];
        int i = start;
        int j = end;
        while(i<j){
            while(i<j && arr[j] >= index){
                j--;
            }
            while(i<j && arr[i] <= index){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        arr[start] = arr[i];
        arr[i] = index;

        return i;
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));

    }
}
