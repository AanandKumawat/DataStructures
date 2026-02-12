package linkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class CustomLinkedList {
    private static int getByIndex(int index,Node head){
        Node temp=head;
        for (int i=1;i<=index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public static void displayRec(Node head){

        if (head==null){
            return;
        }
        System.out.print(head.val+" ");
        displayRec(head.next);
        System.out.print(head.val+" ");

    }
    public static void displayList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
//        displayList(n1);
        displayRec(n1);
        System.out.println(getByIndex(3,n1));
    }
}
