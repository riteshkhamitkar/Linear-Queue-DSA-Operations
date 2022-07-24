.................
Main.java
.................
class Main{
    public static void main(String[] args){
     QueueArray newQueue = new QueueArray(3);
     newQueue.enQueue(1);
     newQueue.enQueue(2);
     newQueue.enQueue(3);
     newQueue.enQueue(4);
     boolean result = newQueue.isEmpty();
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

    //isEmpty method

    public boolean isEmpty(){
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length){
            return true;
        }else{
            return false;
        }
    }

    //Enqueue method 
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is full!");
        }else if(isEmpty()){
         beginningOfQueue = 0;
         topOfQueue++;
         arr[topOfQueue] = value;   
         System.out.println("Succesfully inserted " + value + " in the queue");     
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;   
            System.out.println("Succesfully inserted " + value+ " in the queue");  
        }
    }
}

...........
//////finish///////////
