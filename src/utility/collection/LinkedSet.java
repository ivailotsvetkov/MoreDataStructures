package utility.collection;

import java.util.Iterator;

public class LinkedSet<T> implements SetADT<T>
{
   private int size;
   public LinearNode<T> node;

   public LinkedSet()
   {
      size = 0;
      node = null;
   }

   public String toString()
   {
      String output = "{";
      LinearNode<T> current = node;
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
   public void add(T element)
   {
      LinearNode<T> newNode = new LinearNode<T>(element, node);
      node = newNode;
      size++;

   }

   @Override
   public T remove(T element)
   {
      LinearNode<T> current = node;
      for (int i = 0; i < size; i++)
      {
         if (element.equals(current.getElement()))
         {
            element = null;
         }
         current = current.getNext();
      }
      return null;
   }

   @Override
   public boolean contains(T element)
   {

      boolean found = false;

      LinearNode<T> current = node;

      for (int look = 0; look < size && !found; look++)
         if (current.getElement().equals(element))
            found = true;
         else
            current = current.getNext();

      return found;
   }

   @Override
   public boolean isEmpty()
   {
      if (size == 0)
      {
         return true;
      }
      return false;
   }

   @Override
   public int size()
   {
      // TODO Auto-generated method stub
      return size;
   }

   @Override
   public boolean isSubset(SetADT<T> set)
   {

      for (int i = 0; i < size; i++)
      {
         if (set.contains(node.getElement()))
         {
            return true;
         }
      }
      return false;
   }

   @Override
   public SetADT<T> intersection(SetADT<T> set)
   {
      SetADT<T> newSet = new LinkedSet<>();
      for (int i = 0; i < size; i++)
      {
         if (set.contains(getNode(i).getElement()))
            newSet.add(getNode(i).getElement());

      }
      return newSet;

   }

   @Override
   public SetADT<T> union(SetADT<T> set)
   {
      SetADT<T> set1 = new LinkedSet<>();
      for (int i = 0; i < size; i++)
      {
         if (!set1.contains(getNode(i).getElement()))
            set1.add(getNode(i).getElement());
      }
      return set1;
   }

   private LinearNode<T> getNode(int index)
   {
      LinearNode<T> current = node;
      for (int i = 0; i < index; i++)
      {
         current = current.getNext();
      }
      return current;
   }

   @Override
   public Iterator<T> iterator()
   {
      return new LinkedSetIterator();
   }

   private class LinkedSetIterator implements Iterator<T>
   {
      private LinearNode<T> current;

      public LinkedSetIterator()
      {
         current = null;
      }

      @Override
      public boolean hasNext()
      {
         if (current.getNext() != null)
         {
            return true;
         }
         return false;
      }

      @Override
      public T next()
      {
         if (hasNext())
         {
            return current.getNext().getElement();
         }
         
         return null;
      }

   }
}
