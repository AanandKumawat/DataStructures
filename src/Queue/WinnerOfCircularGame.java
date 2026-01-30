package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class WinnerOfCircularGame {
    private static int Game(Queue<Integer>queue,int k){

        while (queue.size()>1){
            for (int i=1;i<k;i++){
                queue.add(queue.remove());
            }
            queue.remove();
        }
        return queue.peek();
    }
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);queue.add(2);queue.add(3);queue.add(4);queue.add(5);
        System.out.println(Game(queue,2));
    }
}
