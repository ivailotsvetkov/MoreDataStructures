package utility.collection;

import java.util.LinkedList;
import java.util.Stack;

public class Test
{

   public static void main(String[] args)
   {
      // BoundedArrayStack stack3 = new BoundedArrayStack<>(5);// bounded array
      // stack
      // stack3.push("322fsdytrytru");
      // stack3.push("32122fsdytrru");
      // stack3.push("32122fsdtru");
      // stack3.push("32122fsdytry");
      // System.out.println(stack3.toString());
      //
      //
      // System.out.println(stack3.pop());
      // System.out.println(stack3.toString());
      // System.out.println(stack3.toString());
      // ArrayStack stack = new ArrayStack<>(2);// array stack
      // stack.push("fdsfs342");
      // stack.push("fdsf321s342");
      // stack.push("fdsf1s342");
      // System.out.println(stack.toString());
      // Stack stack2 = new Stack<>(); // stack class
      // stack2.push("342432fdasdf");
      // stack2.push("3424dasdf");
      // stack2.push("342432fsdf");
      // stack2.push("32fdasdf");
      // System.out.println(stack2.toString());
      // stack2.pop();
      // System.out.println(stack2.toString());
      // System.out.println(stack2.peek());
      // System.out.println();
      //
      // BoundedArrayQueue queue = new BoundedArrayQueue<>(4); // queue
      // queue.enqueue("fdsf2");
      // queue.enqueue("fdfdsfsf2");
      // queue.enqueue("f232dsf2");
      // queue.enqueue("1111fdsf2");
      // System.out.println(queue.first());
      // System.out.println(queue.toString());
      // try
      // {
      //
      // System.out.println(queue.toString());
      // System.out.println(queue.dequeue());
      // System.out.println();
      // System.out.println(queue.toString());
      // System.out.println(queue.size());
      // queue.enqueue("fdsf");
      // System.out.println(queue.toString());
      // queue.enqueue("4324");
      // System.out.println(queue.toString());
      // queue.enqueue("kurec");
      // System.out.println(queue.toString());
      // }
      // catch (IllegalStateException e)
      // {
      // System.out.println("error catched");
      // }
      // System.out.println();
      // System.out.println();

       ListADT list = new LinkedListFrontRef(); // single linked list front
      
       list.add("kurec32");
       list.add("kure2");
       list.add("kur32");
       list.add("kure32");
       list.remove(1);
       list.add("gei");
       list.remove("kur32");
       System.out.println(list.toString());
       System.out.println(list.isEmpty());

      // ListADT list2 = new LinkedListDummy(); // single linked list -
      //
      // // working)
      // list2.add("kurec32");
      // list2.add("kure2");
      // list2.add("kur32");
      // list2.add("kure32");
      // list2.remove(0);
      // list2.remove("kure2");
      // System.out.println(list2.toString());

//       9
//       StackADT list4 = new LinkedStack<>(); // linked stack - working
//       list4.push("pedras");
//       list4.push("pedras10");
//       list4.push("pedras11");
//       list4.push("geI");
//       list4.push("pedal");
//       list4.pop();
//       System.out.println(list4.toString());
      // list4.pop();
      // System.out.println(list4.toString());
      // System.out.println(list4.peek());
      // list4.pop();
      // System.out.println(list4.toString());

      // QueueADT queue = new LinkedQueue<>(); //linked queue- working
      // queue.enqueue("pedrast");
      // queue.enqueue("pedrast22");
      // queue.enqueue("pedrast10");
      // queue.enqueue("pedrast1");
      // System.out.println(queue.toString());
      // System.out.println(queue.last());
      // queue.dequeue();
      // System.out.println(queue.toString());
      // System.out.println(queue.dequeue());
      // queue.enqueue("pedrast1111");
      // System.out.println(queue.toString());

      // SetADT set1 = new LinkedSet<>(); // linked set without iterator
      // SetADT set2 = new LinkedSet<>();
      // set1.add("A");
      // set1.add("C");
      // set1.add("D");
      // set1.add("E");
      // set1.add("F");
      // set2.add("B");
      // set2.add("C");
      // set2.add("E");
      // set2.add("G");
      // set2.add("H");
      // System.out.println(set1.isSubset(set2));
      // System.out.println(set2.isSubset(set1));
      // System.out.println(set1.size());
      // System.out.println(set2.size());
      // System.out.println(set1.contains("C"));
      // System.out.println(set1.union(set2));
      // System.out.println(set1.intersection(set2));

      // DoubleLinkedList list = new DoubleLinkedList<>(); /*
      // * double linked
      // * list-working
      // */
      // list.add("kurec");
      // list.add("kurec1");
      // list.add("kurec2");
      // list.add(3, "ebi si maikata");
      // list.addFromBack("pederas");
      // System.out.println(list.toString());
      // System.out.println(list.getBack().getElement());
      // System.out.println(list.getFront().getElement());
      // System.out.println(list.removeFromBack());
      // System.out.println(list.toString());
      // System.out.println(list.removeFromFront());
      // System.out.println(list.toString());
      // QueueADT queue = new ArrayQueue(3);
      // queue.enqueue("Pederas");
      // queue.enqueue("Pederas3");
      // queue.enqueue("Pederas4");
      // queue.dequeue();
      // queue.enqueue("fsdadsa");
      // // queue.enqueue("ebi se");

      // System.out.println(queue.toString());
//StackADT stack= new ArrayStack<>();
//stack.push("kurec");
//stack.push("kurec3");
//stack.push("kurec2");
//stack.pop();
//System.out.println(stack.toString());
   }

}
