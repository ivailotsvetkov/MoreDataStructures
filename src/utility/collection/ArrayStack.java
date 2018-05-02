package utility.collection;

public class ArrayStack<T> implements StackADT<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int top;
   private T[] stack;

   public ArrayStack()
   {
      top = 0;
      stack = (T[]) new Object[DEFAULT_CAPACITY];
   }

   public ArrayStack(int initialCapacity)
   {
      top = 0;
      stack = (T[]) new Object[initialCapacity];
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

   private void expandCapacity()
   {
      T[] arr = (T[]) new Object[2 * stack.length];
      for (int i = 0; i < top; i++)
      {
         arr[i] = stack[i];
      }
      stack = arr;
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

         expandCapacity();
         push(element);

      }
   }

   @Override
   public T pop()
   {
      if (!isEmpty())
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
