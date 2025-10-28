package recursion;

import sun.misc.GC;

public class GCD {
    public static int gcd(int a,int b){
        int hcf=1;
        for (int i=2;i<=Math.min(a,b);i++){
            if (a%i==0&&b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
    //GCD by recursion
    public static int GCD(int a,int b){
      if (a==0)return b;
     return GCD(b%a,a);
    }
    public static void main(String[] args) {
//        System.out.println( gcd(12,18));
        System.out.println(GCD(12,18));
    }
}
