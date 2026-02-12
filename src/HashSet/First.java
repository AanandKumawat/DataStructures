package HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class First {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
         char[]ch1=s1.toCharArray();
         char[]ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }

    // find distinct elements in array
    public static void distinct(int []arr){
        HashSet<Integer>set=new HashSet<>();
        for (int i=0;i<arr.length-1;i++){
            set.add(arr[i]);
        }
        System.out.println(set);

    }
    public static void main(String[] args) {
//        HashSet<Integer>set=new HashSet<>();
//        set.add(10);set.add(20);set.add(10);set.add(30);set.add(40);set.add(15);set.add(110);
//        for (Integer elm:set){
//            set.remove(elm);
//            set.add(elm*2);
//        }
//        System.out.println(set);
        System.out.println(areAnagrams("geeks","kseeg"));
    }
}
