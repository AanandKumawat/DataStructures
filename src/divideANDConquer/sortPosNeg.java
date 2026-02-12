package divideANDConquer;

import static divideANDConquer.swapSorted.printArr;

public class sortPosNeg {
    static void partition(int[]arr){
        int i=0,j=arr.length-1;
        while (i<j){
             while (arr[i]<0)i++;
             while (arr[j]>=0)j--;
             if (i<j){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 i++;
                 j--;
             }
        }
    }
    public static void main(String[] args) {
        int[]arr={-1,2,4,-10,-8,12,6,-14,0};
        System.out.println("before sorted arr ");
        printArr(arr);
        System.out.println("after sorted arr");
        partition(arr);
        printArr(arr);
    }
}
