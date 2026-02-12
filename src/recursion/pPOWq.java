package recursion;

public class pPOWq {
    public static int POW(int p,int q){
        if (q==0)return 1;
        return p*POW(p,q-1);
    }
    public static int diffPOW(int p,int q){
        if (q==0){
            return 1;
        }
        int halfPOW=POW(p,q/2);
        if (q%2==0) return halfPOW*halfPOW;
        else return halfPOW*halfPOW*p;
    }
    // print the multiples of k
    public static void PS(int num,int k){
        if (k==0)return;
        PS(num,k-1);
       int ans=num*k;
        System.out.println(
                ans
        );
    }
    public static void main(String[] args) {
//        System.out.println(POW(2,3));
//        System.out.println(diffPOW(2,8));
        PS(5,4);

            }
}
