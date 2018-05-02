package utility.collection;

public class DoubleLinearNode<T>
{
   private DoubleLinearNode<T> next;
   private DoubleLinearNode<T> previous;
   private T element;

   public DoubleLinearNode(DoubleLinearNode<T> previous, T element,
         DoubleLinearNode<T> next)
   {
      this.next = next;
      this.element = element;
      this.previous = previous;
   }

   public DoubleLinearNode(T element, DoubleLinearNode<T> next)
   {
      this.next = next;
      this.element = element;
      previous=null;
   }

   public DoubleLinearNode(T element)
   {
      this.next = null;
      this.element = element;
      this.previous = null;
   }

   public DoubleLinearNode()
   {
      next = null;
      element = null;
      this.previous = null;
   }

   public DoubleLinearNode<T> getNext()
   {
      return next;
   }

   public void setNext(DoubleLinearNode<T> node)
   {
      next = node;
   }

   public T getElement()
   {
      return element;
   }

   public void setElement(T elem)
   {
      element = elem;
   }

   public DoubleLinearNode<T> getPrevious()
   {
      return previous;
   }

   public void setPrevious(DoubleLinearNode<T> previous)
   {
      this.previous = previous;
   }
}
