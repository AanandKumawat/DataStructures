package string;

public class printAllSubStrings {
    public static void printSubString(String str){
        int sum=0;
                for (int k = 0; k < str.length(); k++) {
            for (int i = 0; i < str.length(); i++) {
                for (int j = k; j <= i; j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.print(" ");
            }
//            System.out.println();
        }
        System.out.println(sum);
    }
    public static void printSubStrM2(String str){
        int sum=0;
        for (int i=0;i<=str.length();i++){
            for (int j=i+1;j<=str.length();j++){
//                System.out.print(" "+str.substring(i,j));
                String substr=str.substring(i,j);
//                System.out.println(substr);
                sum=sum(substr,sum);
            }
//            System.out.println();
        }
        System.out.println(sum);
    }

    public static int sum(String str,int sum){
       int num= Integer.parseInt(str);
       sum+=num;
        return sum;
    }
    public static void main(String[] args) {

//printSubString("6759");
        System.out.println();
printSubStrM2("421");
    }

}