package bitManipulation;

import java.util.Arrays;
import java.util.HashSet;

public class Practice {
    // given a array in which all element occur twice ,only 1 elm is occur once  we have to find this number
    static void singleNumber(int []arr){
        HashSet<Integer>set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (set.contains(arr[i])){
                set.remove(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
    // approach second of find single number
    public static void approch2(int[]arr){
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++){
            if (i==arr.length-1||arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
                return;
            }else i++;
        }
        System.out.println("nothing is single");
    }
    //convert binary to decimal
    static void binaryToDecimal(int[] arr){
                int pow=0;
                int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            sum+=arr[i]*(int)Math.pow(2,pow);
            pow++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,2,1};
//        binaryToDecimal(arr);
//        singleNumber(arr);
        approch2(arr);

    }
}
