package Queue;

import java.sql.Statement;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalOnQueue {
    // add At Index
    private static void addAtIndex(Queue<Integer>queue,int index,int val){
              int size= queue.size();
              for (int i=1;i<=index;i++){
                  queue.add(queue.remove());
              }
              queue.add(val);
              for (int i=1;i<=size-index;i++){
                  queue.add(queue.remove());
                  }
    }
    //peek at specific index
    private static int pick(Queue<Integer> queue,int index){
        int size=queue.size();
        for (int i=1;i<index;i++){
            queue.add(queue.remove());
        }
        int pickElm=queue.peek();
        for (int i=0;i<=size-index;i++){
            queue.add(queue.remove());
        }
        return pickElm;
    }
    // remove from queue
    private static void remove(Queue<Integer>queue,int index){
        int size= queue.size();
        for (int i=1;i<=index;i++){
            queue.add(queue.remove());
        }
        queue.remove();
        for (int i=1;i<=size-index-1;i++){
            queue.add(queue.remove());
        }
    }

    // REVERSE THE  QUEUE
    private static void reverse(Queue<Integer> q){
   int n=q.size();
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<n;i++){
            st.push(q.peek());
            q.remove();
        }

       while (!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }

    }
    // reverse the k number of elements in queue
    private static void kReverse(Queue<Integer> q,int k){
        int size=q.size();
        Stack<Integer>st=new Stack<>();
        for (int i=1;i<=k;i++){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        for (int i=1;i<=size-k;i++){
            q.add(q.remove());
        }
    }

    //display queue
    private static void display(Queue<Integer> q){
        for (int i=1;i<=q.size();i++){
            System.out.print(" "+q.peek());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
//        TraversalOnQueue.addAtIndex(q,3,100);
//        System.out.println(TraversalOnQueue.pick(q,2));
//        TraversalOnQueue.display(q);

//        TraversalOnQueue.remove(q,3);
//        System.out.println();
//        TraversalOnQueue.display(q);

//        TraversalOnQueue.reverse(q);
        TraversalOnQueue.kReverse(q,3);
        display(q);


    }
}
