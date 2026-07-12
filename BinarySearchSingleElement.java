public class BinarySearchSingleElement {
    public static int singleElment(int[]arr){
          if (arr.length == 1) return arr[0];
        
        if (arr[0] != arr[1]) return arr[0];
        
        int n = arr.length;
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If mid element is single
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            if (((mid - low) + 1) % 2 == 1)if ((mid-low)+1%2==1) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }  
        return -1;  
    }
    public static void main(String[] args) {
        
        int[]arr={1,1,2,3,3,4,4,8,8};
        System.out.println();

    }
}
