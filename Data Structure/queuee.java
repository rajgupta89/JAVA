import java.util.*;
public class queuee {
    public static void main(String[] args) {
        PriorityQueue<String>queue=new PriorityQueue<String>();
        queue.add("amit sharma");       
        queue.add("vijay raj");       
        queue.add("jay shankr");       
        queue.add("raj");
        Iterator<String>itr=queue.iterator();
          System.out.println("head"+queue.element());       
          System.out.println("head"+queue.peek());      
          System.out.println("itrating the queue element"); 
          while(itr.hasNext()){
              

              System.out.println(itr.next());

          }
          queue.remove();
        //   queue.poll();
          System.out.println("After removing two elements");
          Iterator<String>itr2=queue.iterator();
          while(itr2.hasNext()){
              System.out.println(itr2.next());
          }
    }
}class queue {
    
}
