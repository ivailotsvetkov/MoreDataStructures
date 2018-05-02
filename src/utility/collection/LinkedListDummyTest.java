package utility.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListDummyTest
{
   private LinkedListDummy<String> list;

   @Before
   public void setUp() throws Exception
   {
      list = new LinkedListDummy<>();
   }

   @After
   public void tearDown() throws Exception
   {
   }

   @Test
   public void testLinkedListDummy()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testToString()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testAddIntT()
   {
      list.add(0, "kurec");
      assertEquals(1,list.size());
      assertEquals("kurec", list.get(1));
   }

   @Test
   public void testAddT()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testSet()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testGet()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testRemoveInt()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testRemoveT()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testIndexOf()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testContains()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testIsEmpty()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testSize()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testObject()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testGetClass()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testHashCode()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testEquals()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testClone()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testToString1()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testNotify()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testNotifyAll()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testWaitLong()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testWaitLongInt()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testWait()
   {
      fail("Not yet implemented");
   }

   @Test
   public void testFinalize()
   {
      fail("Not yet implemented");
   }

}
