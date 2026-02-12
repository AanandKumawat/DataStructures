package BinarySearch;

public class appearsOnce {
    public static int solve(int[] arr){
        if (arr.length==1)return arr[0];
        if (arr[0]!=arr[1])return arr[0];
        if (arr[arr.length-1]!=arr[arr.length-2])return arr[arr.length-1];
        int li=0,ei=arr.length-1;
        while (li<=ei){
            int mid=(li+ei)/2;
            if (arr[mid-1]!=mid && arr[mid+1]!=arr[mid])return arr[mid];
            int f=mid,s=mid;
            if (arr[mid-1]==mid) f=mid-1;
            else s=mid+1;

            if ((f-li)%2==0){
                li=s+1;
            }else {
                ei=f-1;
            }
        }
        return 2345;
    }

    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,4,4,5,5,6,6,7,7,9};
        System.out.println(solve(arr));

    }
}
