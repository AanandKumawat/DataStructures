import java.util.Arrays;

public class HouseRobber {
    static int houseRobber(int[]arr,int index,int []dp){
        if (index==0) {
            return arr[0];
        }
        if (index<0) {
            return 0;
        }
        if (dp[index]!=-1) {
            return dp[index];
        }

        int peek=arr[index]+houseRobber(arr, index-2,dp);
        int notpeek=houseRobber(arr, index-1,dp);
        return dp[index]=Math.max(peek, notpeek);
    }
    public static void main(String[] args) {
        int[]arr={10,8,2,4,6,1};
        int[]dp=new int[arr.length];
         Arrays.fill(dp,-1);
        System.out.println(houseRobber(arr,arr.length-1,dp));
    }
}
