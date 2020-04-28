package question15;

import java.util.ArrayList;

public class  Solution{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        for(int i = 0;i<arrayList.size();++i){
            System.out.println(arrayList.get(i));
        }
    }
}