package utility.collection;

public class BoundedArrayQueue<T> implements QueueADT<T>
{
   private int front;
   private int count;
   private T[] queue;

   public BoundedArrayQueue()
   {
// pederas
   }

   public BoundedArrayQueue(int capacity)
   {
      queue = (T[]) new Object[capacity];
      front = 0;
      count = 0;
   }

   public String toString()
   {
      String s = "";
      for (int i = 0; i < queue.length; i++)
      {
         s += queue[i] + "\n";
      }
      return s;
   }

   @Override
   public void enqueue(T element)
   {
      if (count == queue.length)
      {
         throw new IllegalStateException();
      }
      int rear = (count + front) % queue.length;

      queue[rear] = element;
      count++;

   }

   @Override
   public T dequeue()
   {
      T element = null;
      if (!isEmpty())
      {
         element = queue[front];
         queue[front] = null;
         count--;
         front++;

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
      for (int i = 0; i < queue.length; i++)
      {
         if (queue[i] == null)
         {
            return true;
         }

      }
      return false;
   }

   @Override
   public int size()
   {
      int kur = 0;
      for (int i = 0; i < queue.length; i++)
      {
         if (queue[i] != null)
         {
            kur++;
         }
      }
      return kur;

   }

   @Override
   public T last()
   {
      // TODO Auto-generated method stub
      return null;
   }
}
