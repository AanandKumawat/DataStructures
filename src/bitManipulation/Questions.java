package bitManipulation;

public class Questions {
     static int TwoSPower(int n){
         return (1<<n);
     }

static void BinaryToDecimal(int[]arr){
            int sum=0;
        int k=0,n= arr.length-1;
        for (int i=n;i>=0;i--){
            ;
            int ans=(int)Math.pow(2,k)*arr[i];
            sum+=ans;
            k++;
        }
        System.out.println(sum);

}
    static void leftShift(int number){
        System.out.println(number>>1);
        System.out.println(number<<1);
    }
    public static void main(String[] args) {
        int[]arr={1,0,0,0,1,0,1};
//        BinaryToDecimal(arr);
//        leftShift(22);
        System.out.println(TwoSPower(4));
    }
}
