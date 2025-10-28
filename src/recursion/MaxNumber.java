package recursion;

public class MaxNumber {
    public static int Maxi(int[] arr,int index,int mac){
        if (index==arr.length)return mac;
        mac=arr[index];
        return Math.max(Maxi(arr,index+1,mac),mac);
    }
    public static void main(String[] args) {
        int[]arr={10,20,40,100,50,60};
        System.out.println(Maxi(arr,0,Integer.MIN_VALUE));
    }
}
