.................
Main.java
.................
class Main{
    public static void main(String[] args){
     QueueArray newQueue = new QueueArray(5);
     boolean result = newQueue.isFull();
     System.out.println(result);
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

    // isFull Method 

    public boolean isFull(){
        if(topOfQueue == arr.length -1){
            return true;
        }else{
            return false;
        }
    }
}

...........
//////finish///////////
