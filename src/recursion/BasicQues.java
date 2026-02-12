package recursion;

public class BasicQues {
    public static void function(int n){
        if (n==1) {
            System.out.println(n);return;
        }
        System.out.println(n);
        function(n-1);
    }
    public static int factorial(int n){
        if (n==0)return 1;
        return n*factorial(n-1);
    }
    public static int fibonacci(int n){
        if (n==0)return 0;
        if (n==1) return 1;
        int prev=fibonacci(n-1);
        int prevPrev=fibonacci(n-2);
        return (prev+prevPrev);
    }
    public static int RecuPow(int a,int b){
        if (b==0)return 1;
//        System.out.println(ans);
      return a*RecuPow(a,b-1);
    }
    // above RecuPow method is taken more time complexity which is O(b) and in this method we reduce the time complexity of this tast which will be the O(logB)

    public static int PowRecursion(int a,int b){
        if (b==0)return 1;
       int pow=PowRecursion(a,b/2);
        if (b%2==0){
            return pow*pow;
        }else{
            return pow*pow*2;
        }

    }

    // reverse the number
    public static int reverseNumber(int num,int r){
        if (num==0)return r;
      return reverseNumber(num/10,r*10+num%10);
    }
  // sum of n natural number
    public static int sumOfNaturalNumber(int n){
        if (n==1)return n;

       return n+sumOfNaturalNumber(n-1);

    }

    public static  void main(String[] args) {
        // nth natural number
        // function(5);

//    factorial of nth number
//        System.out.println(factorial(5));

        //nth fibonacci series
//        System.out.println(fibonacci(5  ));


//        System.out.println( RecuPow(2,3));

//        System.out.println(PowRecursion(2,3));

//        System.out.println(reverseNumber(2345,0));

        System.out.println(sumOfNaturalNumber(5));
    }

}
