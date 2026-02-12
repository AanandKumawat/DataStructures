package divideANDConquer;

public class swapSorted {
    public static void printArr(int[] arr){
        for (int i:arr){
            System.out.print(" "+i);
        }
        System.out.println();
    }
    static void function(int[] arr){
        int x=-1,y=-1;
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]>arr[i]){
                if (x==-1){
                    x=i-1;
                    y=i;
                }else {
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,4,18,10,12,14,14,16,6};
        System.out.println("before sorted arr ");
        printArr(arr);
        function(arr);
        System.out.println("after sorted arr ");
        printArr(arr);
    }
}
