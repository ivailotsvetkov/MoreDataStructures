package utility.collection;

public class LinkedListCircular<T> implements ListADT<T>

// Efficient to add and remove first – and add last
// Remove last is still time consuming

{
   private LinearNode<T> rear;

   private int count;

   public LinkedListCircular()
   {
      rear = null;
      count = 0;

   }

   private LinearNode<T> getNode(int index)
   {
      LinearNode<T> current = rear;
      for (int i = -1; i < index; i++)
      {
         current = current.getNext();
      }
      return current;
   }

   public String toString()
   {
      String output = "{";
      LinearNode<T> current = rear;
      for (int i = 0; i < size()*2; i++)
      {
         output += current.getElement();
         if (i != (size() - 1))
         {
            output += ", ";
         }
         current = current.getNext();
      }
      output += "}";
      return output;
   }

   @Override
   public void add(int index, T element)
   {
      if (index < 0 || index > count)
      {
         throw new IndexOutOfBoundsException();
      }
      LinearNode<T> newNode = new LinearNode<T>(element);
      if (count == 0)

      {
         newNode.setNext(newNode); // circular
      }
      else
      {
         LinearNode<T> previous = getNode(index - 1);
         newNode.setNext(previous.getNext());
         previous.setNext(newNode);
      }
      if (index == count)
      {
         rear = newNode;
      }
      count++;

   }

   @Override
   public void add(T element)
   {
      LinearNode<T> newNode = new LinearNode<T>(element);
      if (count == 0)

      {
         newNode.setNext(newNode); // circular
      }
      else
      {
         LinearNode<T> previous = getNode(count - 1);
         newNode.setNext(previous.getNext());
         previous.setNext(newNode);
      }

      rear = newNode;

      count++;

   }

   @Override
   public void set(int index, T element)
   {
      LinearNode<T> neshto = rear;
      for (int i = 0; i < index; i++)
      {
         neshto = neshto.getNext();
      }
      neshto.setElement(element);
   }

   @Override
   public T get(int index)
   {
      LinearNode<T> neshto = rear;
      for (int i = 0; i < index; i++)
      {
         neshto = neshto.getNext();
      }
      return neshto.getElement();
   }

   @Override
   public T remove(int index)
   {
      LinearNode<T> forDelete = null;
      if (index == 0)
      {
         forDelete = rear;
         rear = rear.getNext();
         count--;
      }
      else
      {
         LinearNode<T> previous = rear;
         for (int i = 0; i < index - 1; i++)
         {
            previous = previous.getNext();
         }

         forDelete = previous.getNext();
         LinearNode<T> nextNote = forDelete.getNext();
         previous.setNext(nextNote);
         count--;
      }
      return forDelete.getElement();
   }

   @Override
   public T remove(T element)
   {
      return remove(indexOf(element));
   }

   @Override
   public int indexOf(T element)
   {
      LinearNode<T> current = rear;
      for (int i = 0; i < count; i++)
      {
         if (element.equals(current.getElement()))
         {
            return i;
         }
         current = current.getNext();
      }
      return -1;
   }

   @Override
   public boolean contains(T element)
   {
      LinearNode<T> current = rear;
      for (int i = 0; i < count; i++)
      {
         if (element.equals(current.getElement()))
         {
            return true;
         }
         current = current.getNext();
      }
      return false;
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
}
