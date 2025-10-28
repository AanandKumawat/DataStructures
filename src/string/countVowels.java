package string;

public class countVowels {
    public static void main(String[] args) {
        String str="aanand";
        String vowels="aieou";
        int count=0;
//        for (int i=0;i<str.length();i++){
//            for (int j=0;j<vowels.length();j++){
//                if (vowels.charAt(j)==str.charAt(i)){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count );

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'||ch=='i'||ch=='e'||ch=='u'||ch=='o'){
                count++;
            }
        }
        System.out.println(count);
    }
}
