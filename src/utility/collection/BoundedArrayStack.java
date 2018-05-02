package utility.collection;

public class BoundedArrayStack<T> implements StackADT<T>
{
   private int top;
   private T[] stack;

   public BoundedArrayStack(int capacity)
   {
      stack = (T[]) new Object[capacity];
      top = 0;

   }

   public String toString()
   {
      String s = "";
      for (int i = 0; i <= top - 1; i++)
      {
         s += stack[i] + "\n";
      }
      return s;
   }

   @Override
   public void push(T element)
   {
      if (stack.length > top)
      {

         stack[top] = element;
         top++;
      }
      else
      {
         System.out.println("Can't add anymore.");
      }
   }

   @Override
   public T pop()
   {
      if (isEmpty() == false)
      {
         top--;

      }

      else
      {
         System.out.println("Cannot remove any items.");
      }
      return stack[top];

   }

   @Override
   public T peek()
   {
      return stack[top - 1];
   }

   @Override
   public int indexOf(T element)
   {
      for (int i = 0; i < size(); i++)
      {
         if (element.equals(stack[i]))
         {
            return i;
         }

      }
      return -1;
   }

   @Override
   public boolean isEmpty()
   {
      if (top == 0)
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
      return top;
   }
}
