package BinarySearch;

public class floorInSortedArr {
    public static int floor(int[] arr,int target){
        int si=0,ei=arr.length-1,ans=-1;
        while (ei>=si){
            int mid=si+(ei-si)/2;
            if (arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                ans=mid;
                si=mid+1;
            }else {
                ei=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(floor(arr,5));
    }
}
