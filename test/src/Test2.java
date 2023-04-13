

import java.util.ArrayList;
import java.util.List;
public class Test2 {

    private static ArrayList<Integer> tmpArr = new ArrayList<>();
    public static void main(String[] args) {
        int [] com = {1,2,3,4,5,6,7,8,9,10,11,12,14,13,15,16,17,18,19,20,21,22};
        int k = 5;
        if(k > com.length || com.length <= 0){
            return ;
        }
        System.out.println("--------------");
        System.out.println("排列结果：");
        arrangement(k,com);
    }

    public static void arrangement(int k,int []arr){
        if(k == 1){
            for (int i = 0; i < arr.length; i++) {
                tmpArr.add(arr[i]);
                System.out.println(tmpArr.toString() + ",");
                tmpArr.remove((Object)arr[i]);
            }
        }else if(k > 1){
            for (int i = 0; i < arr.length; i++) {
                tmpArr.add(arr[i]);
                arrangement(k - 1, removeArrayElements(arr, tmpArr.toArray(new Integer[1]))); //没有取过的元素，继续挑选
                tmpArr.remove((Object)arr[i]);
            }
        }else{
            return ;
        }
    }

    public static int[] removeArrayElements(int[] arr, Integer... elements){
        List<Integer> remainList = new ArrayList<>(arr.length);
        for(int i=0;i<arr.length;i++){
            boolean find = false;
            for(int j=0;j<elements.length;j++){
                if(arr[i] == elements[j]){
                    find = true;
                    break;
                }
            }
            if(!find){
                remainList.add(arr[i]);
            }
        }
        int[] remainArray = new int[remainList.size()];
        for(int i=0;i<remainList.size();i++){
            remainArray[i] = remainList.get(i);
        }
        return remainArray;
    }
}
