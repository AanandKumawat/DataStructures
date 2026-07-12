import java.util.Arrays;

public class Practice {
    static int Knapsack(int[]wt,int[]val,int W,int n,int[][]dp){

        if (n==0 || W==0) {
            return 0;
        }

        if (dp[n][W]!=-1) {
            return dp[n][W];
        }

        int include=0;
          if (wt[n-1]<=W) {
            
            include=val[n-1]+Knapsack(wt, val, W-wt[n-1], n-1, dp);
        }
           int exclude=Knapsack(wt, val, W, n-1, dp);

          return  dp[n][W]=Math.max(include, exclude);
    }
    public static void main(String[] args) {
        int wt[]={2,5,1,3,4};

        int val[]={15,14,10,45,30};
        int W=7;
        int dp[][]=new int[val.length+1][W+1];

        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
         System.out.println(Knapsack(wt,val,W,val.length,dp));
    }
}
