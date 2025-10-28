package string;

public class StringCompression {
    public static void main(String[] args) {
        String str="asddsasddssdfgdsdfds";
        int i=0,j=0;
        while (j<str.length()){
            if (str.charAt(i)==str.charAt(j)){
                j++;
            }else {
                System.out.print(str.charAt(i));
                System.out.print(j-i);
                i=j;
            }
        }
        System.out.println(str.charAt(i)+""+(j-i));
    }
}
