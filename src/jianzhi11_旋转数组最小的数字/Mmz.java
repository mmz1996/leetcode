package jianzhi11_旋转数组最小的数字;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/12 23:26
 * @Created by mmz
 */
public class Mmz {
    public int minArray(int[] numbers) {
        if(numbers.length <=0 || numbers == null){
            return -1;
        }
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] >=numbers[start]){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
