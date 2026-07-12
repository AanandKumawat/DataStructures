import java.sql.Array;
import java.util.Arrays;

public class SubSetWithKSum {
    public static void main(String[] args) {
        int[] arr={1,7,2,9,10};
        int k=9;
        int n=arr.length;
        Boolean[][]dp=new Boolean[k+1][n];
        for(Boolean[] i:dp){
            Arrays.fill(i,false);
        }
       System.out.println(subSetSum(arr, k, n-1,dp));
    }
    public static boolean subSetSum(int []arr,int k,int index,Boolean[][]dp){
          
        if (k==0) {
            return true;
        }
        if (index<0) {
            return false;
        }
         if (dp[k][index]!=null) {
            return dp[k][index];
         }
         boolean peek=false;
        if (arr[index]<=k) {
           peek=subSetSum(arr, k-arr[index], index-1,dp);
        }
        boolean notpeek=subSetSum(arr, k, index-1,dp);

        return dp[k][index] =peek||notpeek;
    }
}
