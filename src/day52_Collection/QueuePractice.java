package day52_Collection;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,12,4,5,23,6,7,3,2,1));

        System.out.println("arrayDeque = " + arrayDeque); // arrayDeque: keeps the insertion order

        arrayDeque.poll(); // 10 removes // poll: removes the first objects, returns it. FIFO
        arrayDeque.poll(); // 12 removes
        System.out.println("arrayDeque = " + arrayDeque); // [4, 5, 23, 6, 7, 3, 2, 1]

        //getFirst() & getLast() : allows element to be used from beginning or end

        Object num1 = (Integer) ( ( ArrayDeque )arrayDeque).getFirst(); // (Integer)Object
        System.out.println("num1 = " + num1); // first num : 4
        System.out.println(( ( ArrayDeque )arrayDeque).getLast()); // last num: 1

       // arrayDeque.add(null); // arrayDeque: does not take null

        System.out.println("====================================================");

        // LinkedList :  does not have index, accepts null, keeps insertion order, getFirst(), getLast()
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,12,4,5,23,6,7,3,2,1));
        System.out.println("linkedList = " + linkedList);

        linkedList.poll(); // 10 removes
        linkedList.poll(); // 12 removes

        System.out.println("linkedList = " + linkedList);

        System.out.println( ((LinkedList<Integer>) linkedList).get(0) );
        System.out.println( ((LinkedList<Integer>) linkedList).get(linkedList.size()-1) );

        System.out.println( ((LinkedList<Integer>) linkedList).getFirst() );
        System.out.println( ((LinkedList<Integer>) linkedList).getLast() );
        
        linkedList.add(null); //LinkedList :  accepts the null object

        System.out.println("linkedList = " + linkedList); // [4, 5, 23, 6, 7, 3, 2, 1, null]

        System.out.println("====================================================");

        //PriorityQueue: does not have index, does not keep the insertion order, does not take null, does not allow FIFO
         Queue<Integer> priorityQueue = new PriorityQueue<>();
         priorityQueue.addAll((Arrays.asList(10,12,4,5,23,6,7,3,2,1)));
         System.out.println("priorityQueue = " + priorityQueue);
         
         priorityQueue.poll(); // order is random, there is no guaranty
        System.out.println("priorityQueue = " + priorityQueue);
        
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

       // System.out.println( ((PriorityQueue)  priorityQueue).getFirst(); // the is no reletionship Deuque
      //  System.out.println( ((PriorityQueue)  priorityQueue).getLast(); no getfirst and getLast
        
        //priorityQueue.add(null); // does not take null

        
        
        

    }
}
