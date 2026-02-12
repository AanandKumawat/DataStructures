package string;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("ramesh");
        int i=0,j=str.length()-1;
        while (i<j){
            char ch1=str.charAt(i);
            char ch2=str.charAt(j);
            str.setCharAt(i,ch2);
            str.setCharAt(j,ch1);
            i++;j--;
        }
        System.out.println(str);
    }
}
