import java.util.Arrays;

public class StickleThief {
   static int[]dp;
   static int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        
        return loot(0,arr);
        
    }
    
static int loot(int index,int[]arr){
        if(index>=arr.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int peek=arr[index]+loot(index+2,arr);
        int skip=loot(index+1,arr);
          int ans=Math.max(peek,skip);
          dp[index]=ans;
          return ans;       
    }

    public static void main(String[] args) {
        int[]arr={6,7,1,3,8,2,4};
        System.out.println(findMaxSum(arr));
    }
}