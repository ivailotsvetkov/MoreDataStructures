

package utility.collection;

public class LinkedStack<T> implements StackADT<T>
{
   private int count;
   private LinearNode<T> top;

   public LinkedStack()
   {
      count = 0;
      top = null;
   }

   public String toString()
   {
      {
         String output = "{";
         LinearNode<T> current = top;
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
   }

   @Override
   public void push(T element)
   {
      if (count == 0)
      {
         top = new LinearNode<>(element, null);
      }
      else
      {

         LinearNode<T> newNode = new LinearNode<T>(element, top);
         top = newNode;
      }
      count++;

   }

   @Override
   public T pop()
   {
      {
         LinearNode<T> forDelete = null;
         if (!isEmpty())
         {
            forDelete = top;
            top = top.getNext();

            count--;
         }
         else
         {
            System.out.println("You didn't add any items.");
         }
         return forDelete.getElement();
      }
   }

   @Override
   public T peek()
   {

      return top.getElement();
   }

   @Override
   public int indexOf(T element)
   {
      for (int i = 0; i < size(); i++)
      {
         if (element.equals(top))
         {
            return i;
         }

      }
      return -1;
   }

   @Override
   public boolean isEmpty()
   {
      if (count == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   @Override
   public int size()
   {
      return count;
   }

}
