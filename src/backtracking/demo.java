package backtracking;

import static divideANDConquer.mergesort.printArr;

public class demo {
    public static void changeArr(int[] arr,int index,int val){
        if (index==arr.length){
            printArr(arr);
            return;
        }

         arr[index]=val;
         changeArr(arr,index+1,val+1);
         arr[index]=val-2;

    }

    public static void main(String[] args) {
        int[]arr=new int[5];
        changeArr(arr,0,1);
        System.out.println();
    printArr(arr);
    }
}
