.................
Main.java
.................
class Main{
    public static void main(String[] args){
     QueueArray newQueue = new QueueArray(5);
    }
}
..................................
QueueArray.java
..................................
public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new  int [size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size of: "+ size);
    }
}

...........
//////finish///////////
