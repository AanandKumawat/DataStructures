package divideANDConquer;

public class quicksort {
   public static void printArr(int[] arr){
        for (int i:arr){
            System.out.print(" "+i);
        }
    }
    static void quicksort(int []arr,int si,int ei){
        if (si>=ei){
            return;
        }
        int pi=partition(arr,si,ei);
        quicksort(arr,si,pi-1);
        quicksort(arr,pi+1,ei);

    }
    static int partition(int[]arr,int si,int ei) {
        int piIndex = arr[si];
        int j = ei;
        int i = si + 1;
        while (j >= i) {
            if (arr[i] <= piIndex) {
                i++;
            } else if (piIndex < arr[j]) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
        }
        arr[si] = arr[j];
            arr[j] = piIndex;
        return j;
    }
    // method for finding the maximum element in arr
    static int testMax(int[]arr){
        int i=0,j=arr.length-1;
        while (i<j){
            if (arr[i]<arr[j]){
                i++;
            }else {
                j--;
            }
        }
        int ans=Math.max(arr[i],arr[j]);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,78,44,53,24,66};
        System.out.println("before quick sort :");
        printArr(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("after quick sort :");
        printArr(arr);
        System.out.println();
//        System.out.println(testMax(arr));
    }

}
