package recursion;

public class reverseArray {
    public static int[] reverse(int[] arr,int si,int ei){
        if (si>ei){
            return arr;
        }
        int temp=arr[si];
        arr[si]=arr[ei];
        arr[ei]=temp;
        reverse(arr,si+1,ei-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
//        System.out.println(reverse(arr,0,arr.length-1));
        for (int i:reverse(arr,0,arr.length-1)){
            System.out.println(i);
        }
    }
}
