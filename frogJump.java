import java.util.Arrays;

import org.omg.CORBA.MARSHAL;

public class frogJump {
    public static int frogJumpRecursive(int[]arr,int index){
        if (index==0) {
            return 0;
        }

       int  left=frogJumpRecursive(arr, index-1)+Math.abs(arr[index]-arr[index-1]);
         int right=Integer.MAX_VALUE;
       if (index>=2){
         right=frogJumpRecursive(arr, index-2)+Math.abs(arr[index]-arr[index-2]);
       }

       return Math.min(left,right);
    }


    public static int frogJumpMemoization(int[]arr,int index,int []dp){
        if (index==0) {
            return 0;
        }
        if (dp[index]!=-1) {
            return dp[index];
        }
        int left=frogJumpMemoization(arr, index-1, dp)+Math.abs(arr[index]-arr[index-1]);
        int right=Integer.MAX_VALUE;
        if (index>=2){
            right=frogJumpMemoization(arr, index-2, dp)+Math.abs(arr[index]-arr[index-2]);
        }
        return dp[index]=Math.min(left, right);
    }
    static int frogMemo(int[]arr){
        int[]dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return frogJumpMemoization(arr, arr.length-1, dp);
    }


    static int frogJumpTabulation(int[]arr){
        int[]dp=new int[arr.length];
        dp[0]=0;
        int ss=Integer.MAX_VALUE;

        for(int i=1;i<dp.length;i++){
            int left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            if (i>1){
                ss=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            } 
            dp[i]=Math.min(ss, left);
        }
    return dp[dp.length-1];

    }


    static int frogJumpSpaceOptimization(int[]arr){
        
        int previ=0;
        int previ2=0;

        for(int i=1;i<arr.length;i++){

            int fs=previ+Math.abs(arr[i]-arr[i-1]);
            int ss=Integer.MAX_VALUE;
            if (i>1) {
                ss=previ2+Math.abs(arr[i]-arr[i-2]);
            }
            int curr=Math.min(fs, ss);
            previ2=previ;
            previ=curr;
        }
        return previ;

    }
    public static void main(String[] args) {
        int[]arr={30,10,60,10,60,50};
        System.out.println(frogJumpRecursive(arr,arr.length-1));
        System.out.println(frogMemo(arr));
 
        System.out.println(frogJumpTabulation(arr));
    }
}
