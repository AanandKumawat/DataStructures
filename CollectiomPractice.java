import java.util.Comparator;
import java.util.TreeSet;

public class CollectiomPractice {
    public static void main(String[] args) {
        TreeSet<StringBuffer> set=new TreeSet<>(new MyComparator());
        set.add(new StringBuffer("aanand"));
        set.add(new StringBuffer("ayushiy"));
        set.add(new StringBuffer("rashmi"));
        set.add(new StringBuffer("mahima"));
        System.out.println(set);
    }
}

class MyComparator implements Comparator<StringBuffer>{
        @Override
       public int compare(StringBuffer obj1,StringBuffer obj2){
            String s1=obj1.toString();
            String s2=obj2.toString();
        return s1.compareTo(s2);
       }
}
