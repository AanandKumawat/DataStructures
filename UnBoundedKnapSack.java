import java.util.Arrays;

public class UnBoundedKnapSack {

    public static int knapSackRec(int []val,int[]wt,int index,int capacity,int[][]dp){
        if (index==val.length) {
            return 0;
        }

        if (dp[index][capacity]!=-1) {
            return dp[index][capacity];
        }
        int take=0;
        if (wt[index]<=capacity) {
            take=val[index]+knapSackRec(val, wt, index, capacity-wt[index], dp);
        }
        int notake=knapSackRec(val, wt, index+1, capacity, dp);
        return dp[index][capacity]=Math.max(take, notake);
    }

    public static int knapSack(int []val,int[]wt,int capacity){
        int n=val.length;
        int[][]dp=new int[n+1][capacity+1];

        // initialize dp arr 
        for(int i=0;i<val.length;i++){
            Arrays.fill(dp[i],-1);
        }
       return knapSackRec(val,wt,0,capacity,dp);
    }
    public static void main(String[] args) {
      int[] val = {5, 8};
int[] wt  = {2, 3};
int capacity = 5;

        System.out.println(knapSack(val,wt,capacity));
    }
}
