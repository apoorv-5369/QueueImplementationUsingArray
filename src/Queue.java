public class Queue {
    int SIZE = 5;
    int[] items = new int[SIZE];
    int front, rear;
    Queue(){
        front=-1;
        rear=-1;
    }
    boolean isFull(){
        return front == 0 && rear == SIZE - 1;
    }
    boolean isEmpty(){
        return front == -1;
    }
    void enQueue(int element){
     if (isFull()){
         System.out.println("Queue is Full.");
     }else{
         if(front==-1) front=0;
         rear++;
         items[rear]=element;
         System.out.println("Added "+element);
     }
    }
    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return (-1);
        }else{
            element= items[front];
            if(front>=rear){
                front=-1;
                rear=-1;
            }else{
                front++;
            }
            System.out.println("Deleted "+ element);
            return  element;
        }
    }
    void display(){
        int i;
        if(isEmpty()){
            System.out.println(" Queue is Empty.");
        }else{
            System.out.println("\nFront Index is "+front);
            System.out.println("Items-> ");
            for(i=front; i<=rear;i++){
                System.out.println(items[i]+" ");
            }
            System.out.println("\nLast Index is "+rear);
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.display();
        q.deQueue();
        q.display();
    }
}
