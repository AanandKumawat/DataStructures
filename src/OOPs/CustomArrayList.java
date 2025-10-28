package OOPs;

import java.util.ArrayList;

class arrayList{
    int[] arr;
    int index=0;
    int size=0;
    public arrayList(int size) {
        arr=new int[size];
    }
    public void add(Integer elem){
        if (index==arr.length){
            int[]newArray=new int[arr.length*2];
              for (int i=0;i<arr.length;i++){
                  newArray[i]=arr[i];
              }
            arr=newArray;
        }
        arr[index++]=elem;
        size++;
    }
    public Integer get(int indx){
        return arr[indx];
    }
    public void set(int indx,int val){
        arr[indx]=val;
    }
    public void remove(int index){
      if (index<0 || index>=this.index){
          throw new IndexOutOfBoundsException("invalid index "+index);
      }
        for (int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        this.index--;
        size--;
    }
    //insert at the specific index
    public void insertAt(int index,int elm){
        if (index<0){
            throw new IndexOutOfBoundsException("invalid index "+index);
        }
        size++;
        this.index++;
        for (int i=size;i>=index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=elm;
    }

    public void printArray(){
        System.out.println();
        for (int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
    }


}
public class CustomArrayList {
    public static void main(String[] args) {

     arrayList list=new arrayList(4);
     list.add(10);
     list.add(2);
     list.add(12);
     list.add(90);
     list.add(11);
        list.add(10);
        list.add(2);
        list.add(12);
        list.add(90);
        list.add(11);
//        System.out.println(list.get(9));
//        list.set(10,999);
//        System.out.println(list.get(10));
//    list.remove(0);
            list.printArray();
        list.insertAt(1,7);

     list.printArray();
    }
}
