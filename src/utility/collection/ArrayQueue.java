package utility.collection;

public class ArrayQueue<T> implements QueueADT<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int front, count;
   private T[] queue;

   public ArrayQueue()
   {
      front = 0;
      queue = (T[]) new Object[DEFAULT_CAPACITY];
      count = 0;
   }

   public ArrayQueue(int initialCapacity)
   {
      front = 0;
      queue = (T[]) new Object[initialCapacity];
      count = 0;
   }

   public String toString()
   {
      String s = "";
      for (int i = front; i < count+front ; i++)
      {
         s += queue[i] + "\n";
      }
      return s;
   }

   private void expandCapacity()
   {
      T[] arr = (T[]) new Object[2 * queue.length];
      for (int i = 0; i < count; i++)
      {
         arr[i] = queue[i];
      }
      queue = arr;
   }

   @Override
   public void enqueue(T element)
   {
      int rear = (count + front) % queue.length;
      if (queue.length > count)
      {
         queue[rear] = element;
         count++;
      }
      else
      {
         expandCapacity();
         enqueue(element);
      }
   }

   @Override
   public T dequeue()
   {
      T element = null;
      if (!isEmpty())
      {
         element = queue[front];
         queue[front] = null;

         front++;
         count--;
      }
      else
      {
         System.out.println("Cannot remove.");
      }
      return element;
   }

   @Override
   public T first()
   {
      return queue[front];
   }

   @Override
   public int indexOf(T element)
   {
      for (int i = 0; i < size(); i++)
      {
         if (element.equals(queue[i]))
         {
            return i;
         }

      }
      return -1;
   }

   @Override
   public boolean isEmpty()
   {
      return count == 0;
   }

   @Override
   public int size()
   {
      return count;
   }

   @Override
   public T last()
   {
      int rear = (count + front) % queue.length;
      return queue[rear - 1];
   }
}
