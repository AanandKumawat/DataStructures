package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplStackByQueue {

    public static void main(String[] args) {
        St stack=new St();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        stack.display();

    }
}
class St{
    Queue<Integer>q=new LinkedList<>();
    // adding the elem
    public void add(int a){
        int n=q.size();
      
        q.add(a);
        for (int i=1;i<n    ;i++){
            q.add(q.remove());
        }
    }

    // remove
    public void remove(){
        if (q.size()==0){
            System.out.println("q is empty");
            return;
        }
        q.remove();
    }
    //display
    public void display(){
        System.out.println(q);
    }
}
