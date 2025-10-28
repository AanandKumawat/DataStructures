package divideANDConquer;

public class mergesort {
    public static void printArr(int []arr){
        for (int elem:arr){
            System.out.print(" "+elem);
        }
    }
    public static void mergeSort(int[]arr,int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr,int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int[]temp=new int[ei-si+1];

         while (i<=mid && j<=ei){
             if (arr[i]<=arr[j]){
                 temp[k++]=arr[i++];
             }
             else {
                 temp[k++]=arr[j++];
             }
         }
         // copy left all element
        while (i<=mid){
            temp[k++]=arr[i++];
        }

        while (j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp arr to origional array
        for ( k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
     int []arr={2,5,4,1,87,91,44,7,34};
     mergeSort(arr,0, arr.length-1);
     printArr(arr);
    }
}
