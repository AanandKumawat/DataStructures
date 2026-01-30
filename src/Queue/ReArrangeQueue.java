package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReArrangeQueue {
    public static Queue<Integer> rearenegeQueue(Queue<Integer>q){
        Stack<Integer>st=new Stack<>();
        int size=q.size();
        //step 1
        for (int i=1;i<=size/2;i++){
            st.push(q.remove());
        }
        //step 2
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        // step 3
        for (int i=1;i<=size/2;i++){
            st.push(q.remove());
        }
        //step 4
        while (!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
       // step 5
        while (!q.isEmpty()){
            st.push(q.remove());
        }
        // step 6
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(rearenegeQueue(q));
    }
}
