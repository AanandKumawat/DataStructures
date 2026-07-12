import java.util.Arrays;

public class MaximumSumOfNonAdjacentElm {

    public static int maxSum(int[]arr,int index,int[]dp){
        if (index==0) {
            return arr[index];
        }
        if (index<0) {
            return 0;
        }
        if (dp[index]!=-1) {
            return dp[index];
        }

        int pick=arr[index]+maxSum(arr, index-2,dp);
        int notPick=0+maxSum(arr, index-1,dp);
        return dp[index]=Math.max(pick, notPick);
    }
     
    // max sum tabulation
    static int maxSumTabulation(int []arr){
        int []dp=new int[arr.length];
        dp[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            int take=arr[i];
            if (i>1) {
                take+=dp[i-2];
            }
            int notake=0+dp[i-1];

            dp[i]=Math.max(take, notake);
        }
        return dp[arr.length-1];
    }

    public static void main(String[] args) {
        int[]arr={2,1,4,9};
        int[]dp=new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(maxSum(arr, arr.length-1,dp));

        System.out.println(maxSumTabulation(arr));
    }
}
