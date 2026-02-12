package linkedList;

import com.sun.jmx.snmp.SnmpNull;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.NoFixedFacet;

class Lindkedlist{
   static Node head;
    static Node tail;
    int size;
    Lindkedlist(){
        head=tail=null;
    }


    // insert at the specific index

    void insert(int index,int val){
        Node newNode=new Node(val);
        if (size<index||index<0) System.out.println("something want wrong");
        if (index==0){
            addAtHead(val);
            return;
        }
        if (index==size){
            addAtTail(val);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
            }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        }

   // delete at the index
    void delete(int index) {
        if (size == 0 || index<0 ||index>=size ) {
            System.out.println("you something want wrong ");
            return;
        }
        if (index == 0) {
            deleteAtHead();
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
           size--;
         if (index==size-1)tail=temp;  //we are deleting the tail elem
              size--;

        }
    }


    // search the element
    int search(int value){
        if (tail==null) return -1;
        int index=0;
        Node temp=head;
        while (temp!=null){
            if (temp.val==value)return index;
            index++;
            temp=temp.next;
        }
        return -1;
    }

    // add the element at the tail

   void addAtTail(int num){
        Node newNode=new Node(num);
        if (tail==null) head=tail=newNode;
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    void addAtHead(int num){
        Node newNode=new Node(num);
        if (head==null)head=tail=newNode;
        else {
            newNode.next=head;
            head=newNode;
        }
       size++;

    }
    void deleteAtHead(){
        if (head==null){
            throw new NullPointerException("not have any node ! null");
        }
            head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
    }
    void deleteAtTail(){
        if (tail==null){
            throw new NullPointerException("tail at the null position ");
        }

    }
    void display(){
        if (head== null)return;
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }

}
public class LinkedListDataStructure {
    public static void main(String[] args) {
   Lindkedlist ll=new Lindkedlist();
   ll.addAtTail(100);
   ll.addAtTail(200);
   ll.addAtHead(300);
   ll.display();
//   ll.deleteAtHead();
//   ll.display();
//        System.out.println(ll.size);
//        System.out.println(ll.search(300));
   ll.insert(2,500);
   ll.display();
   ll.delete(1);
   ll.display();
    }

}
