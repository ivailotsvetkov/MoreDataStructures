package utility.collection;

public class DoubleLinkedList<T> implements DoubleListADT<T>
{
   private DoubleLinearNode<T> back;// nai-desno
   private DoubleLinearNode<T> front; // nai-levo
   private int count;

   public DoubleLinkedList()
   {
      back = null;
      front = null;
      count = 0;
   }

   private DoubleLinearNode<T> getNode(int index)
   {
      DoubleLinearNode<T> current = front;
      for (int i = 0; i < index; i++)
      {
         current = current.getNext();
      }
      return current;
   }

   @Override
   public void add(int index, T element)
   {
      if (index < 0 || index > count)
      {
         throw new IndexOutOfBoundsException();
      }
      else if (index == 0 && count == 0)
      {
         front = new DoubleLinearNode<T>(null, element, null);
         back = front;
      }
      else if (index == 0)
      {
         DoubleLinearNode<T> newNode = new DoubleLinearNode<>(element, front);
         front.setPrevious(newNode);
         front = newNode;
      }
      else if (index == count)
      {
         DoubleLinearNode<T> newNode = new DoubleLinearNode<T>(back, element,
               null);
         back.setNext(newNode);
         back = newNode;
      }
      else
      {
         DoubleLinearNode<T> next = getNode(index);

         DoubleLinearNode<T> previous = getNode(index - 1);

         DoubleLinearNode<T> newNode = new DoubleLinearNode<T>(
               next.getPrevious(), element, previous.getNext());
         previous.setNext(newNode);
         next.setPrevious(newNode);
      }
      count++;
   }

   @Override
   public void add(T element)
   {
      if (count == 0)
      {
         front = new DoubleLinearNode<T>(null, element, null);
         back = front;
      }
      else
      {
         DoubleLinearNode<T> newNode = new DoubleLinearNode<>(element, front);
         front.setPrevious(newNode);
         front = newNode;

      }
      count++;

   }

   @Override
   public void addFromBack(T element)
   {
      if (count == 0)
      {
         front = new DoubleLinearNode<T>(null, element, null);
         back = front;
      }
      else
      {

         DoubleLinearNode<T> newNode = new DoubleLinearNode<T>(back, element,
               null);
         back.setNext(newNode);
         back = newNode;
      }
      count++;
   }

   public String toString()
   {
      String output = "{";
      DoubleLinearNode<T> current = front;
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
   public void set(int index, T element)
   {
      DoubleLinearNode<T> neshto = front;
      for (int i = 0; i < index; i++)
      {
         neshto = neshto.getNext();
      }
      neshto.setElement(element);
   }

   @Override
   public T get(int index)
   {
      DoubleLinearNode<T> neshto = front;
      for (int i = 0; i < index; i++)
      {
         neshto = neshto.getNext();
      }
      return neshto.getElement();
   }

   @Override
   public T remove(int index)
   {
      DoubleLinearNode<T> forDelete = null;
      if (index == 0)
      {
         forDelete = front;
         front = front.getNext();
         count--;
      }
      else
      {
         DoubleLinearNode<T> previous = front;
         for (int i = 0; i < index - 1; i++)
         {
            previous = previous.getNext();
         }

         forDelete = previous.getNext();
         DoubleLinearNode<T> nextNote = forDelete.getNext();
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
      DoubleLinearNode<T> current = front;
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
   public T removeFromBack()
   {
      DoubleLinearNode<T> forDelete = back;
      back = back.getPrevious();
      back.setNext(null);
      count--;
      return forDelete.getElement();
   }

   @Override
   public T removeFromFront()
   {
      DoubleLinearNode<T> forDelete = front;
      front = front.getNext();
      front.setPrevious(null);
      count--;
      return forDelete.getElement();
   }

   @Override
   public boolean contains(T element)
   {
      DoubleLinearNode<T> current = front;
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

   public DoubleLinearNode<T> getBack()
   {
      return back;
   }

   public DoubleLinearNode<T> getFront()
   {
      return front;
   }

}
