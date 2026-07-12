public class Question {
    static void swap(int []nums,int i ,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        // shift 0,1,2 ;
        int[]nums={2,0,2,1,1,0,1,1,1,1};
        int low=0,high=nums.length-1;

        while (low<=high) {
            if (nums[low]==0) {
                low++;
            }else{
                swap(nums,low, high);
                high--;
            }
        }

      
        while (low==0) {
            low++;
        }
 
        high=nums.length-1;

        while (low<=high) {
            if (nums[low]==1) {
                low++;
            }else{
                swap(nums,low, high);
                high--;
            }
        }

        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
