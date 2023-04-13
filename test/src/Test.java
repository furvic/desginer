import java.util.*;

public class Test {

    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();
//        while (set.size()<5){
//            int num = (int) Math.floor(Math.random()*23);
//            if (!set.contains(num)){
//                set.add(num);
//
//            }
//        }
//            System.out.println(set);
//        System.out.println(111);


//        List<Integer> list=new ArrayList<Integer>();
//        for(int i=1;i<=22;i++){
//            list.add(i);
//        }
//        Collections.shuffle(list);
//        for(int i=0;i<5;i++){
//            System.out.print(list.get(i)+" ");
//        }


        String s = "dssdgsd";
        int i = s.hashCode();


        System.out.println(i % 2);


    }
}
