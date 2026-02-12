package recursion;

public class sumOfArrElm {
    public static int sum(int[] arr,int inx){
        if (inx==arr.length)return 0;
        int sum=arr[inx];
          return sum+sum(arr,inx+1);

    }

    public static void main(String[] args) {
     int[]arr={10,20,30,40};
        System.out.println(sum(arr,0));
    }
}
