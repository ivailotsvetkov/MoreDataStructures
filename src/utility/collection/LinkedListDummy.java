package utility.collection;

public class LinkedListDummy<T> implements ListADT<T>
// Insert and remove at index 0 are now treated just
// like any other cases (no special case)

// Efficient to add and remove last
// Add and remove first are now time consuming

{

   private LinearNode<T> front;

   private int count;

   public LinkedListDummy()
   {
      front = new LinearNode<T>(); // dummy node
      count = 0;

   }

   private LinearNode<T> getNode(int index)
   {
      LinearNode<T> current = front;
      for (int i = -1; i < index; i++)
      {
         current = current.getNext();
      }
      return current;
   }

   public String toString()
   {
      String output = "{";
      LinearNode<T> current = front.getNext();
      for (int i = 0; i < size(); i++)
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
      else
      {
         LinearNode<T> previous = getNode(index - 1);
         LinearNode<T> newNode = new LinearNode<T>(element, previous.getNext());
         previous.setNext(newNode);

      }
      count++;
   }

   @Override
   public void add(T element)
   {

      add(count, element);

   }

   @Override
   public void set(int index, T element)
   {
      if (index < 0 || index > count)
      {
         throw new IndexOutOfBoundsException();
      }
      getNode(index).setElement(element);
   }

   @Override
   public T get(int index)
   {
      if (index < 0 || index > count)
      {
         throw new IndexOutOfBoundsException();
      }
      return getNode(index).getElement();
   }

   @Override
   public T remove(int index)
   {
      LinearNode<T> forDelete = null;

      LinearNode<T> previous = front;
      for (int i = 0; i < index - 1; i++)
      {
         previous = previous.getNext();
      }

      forDelete = previous.getNext();
      LinearNode<T> nextNote = forDelete.getNext();
      previous.setNext(nextNote);
      count--;

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
      LinearNode<T> current = front;
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
      LinearNode<T> current = front;
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
