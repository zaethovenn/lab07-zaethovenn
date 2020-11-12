package labseven;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labseven.list.SinglyLinkedList;
import org.junit.Test;

/**
 * A JUnit test suite for the SinglyLinkedList.
 *
 * @author Janyl Jumadinova
 * @author Add Your Name Here
 */

public class TestSinglyLinkedList {

  /** The size of the SinglyLinkedList with multiple values. */
  private static final int SIZE = 10;

  @Test
  public void testConstructSinglyLinkedListNotNull() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    assertTrue(list != null);
  }

  @Test
  public void testConstructSinglyLinkedListCorrectInitialState() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    assertEquals(list.getSize(), 0);
    assertTrue(list.isEmpty());
    assertEquals(list.getFirst(), null);
    assertEquals(list.getLast(), null);
  }

  @Test
  public void testSinglyLinkedListAfterAddFirst() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addFirst(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("Data"));
    assertEquals(list.getLast(), new String("Data"));
  }

  @Test
  public void testSinglyLinkedListAfterAddFirstAndRemoveFirst() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addFirst(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("Data"));
    assertEquals(list.getLast(), new String("Data"));
    list.removeFirst();
    assertEquals(list.getSize(), 0);
    assertTrue(list.isEmpty());
    assertEquals(list.getFirst(), null);
    assertEquals(list.getLast(), null);
  }

  @Test
  public void testSinglyLinkedListAfterAddLast() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addLast(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("Data"));
    assertEquals(list.getLast(), new String("Data"));
  }

  @Test
  public void testSinglyLinkedListAfterAddLastAndRemoveFirst() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addLast(new String("Data"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("Data"));
    assertEquals(list.getLast(), new String("Data"));
    list.removeFirst();
    assertEquals(list.getSize(), 0);
    assertTrue(list.isEmpty());
    assertEquals(list.getFirst(), null);
    assertEquals(list.getLast(), null);
  }

  @Test
  public void testSinglyLinkedListAfterAddFirstAddLast() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addFirst(new String("First"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("First"));
    assertEquals(list.getLast(), new String("First"));
    list.addLast(new String("Last"));
    assertEquals(list.getSize(), 2);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("First"));
    assertEquals(list.getLast(), new String("Last"));
  }

  @Test
  public void testSinglyLinkedListAfterAddLastAddFirst() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addLast(new String("Last"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getLast(), new String("Last"));
    assertEquals(list.getFirst(), new String("Last"));
    list.addFirst(new String("First"));
    assertEquals(list.getSize(), 2);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("First"));
    assertEquals(list.getLast(), new String("Last"));
  }

  @Test
  public void testSinglyLinkedListAfterAddFirstAddFirst() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addFirst(new String("First"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("First"));
    assertEquals(list.getLast(), new String("First"));
    list.addFirst(new String("New First"));
    assertEquals(list.getSize(), 2);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("New First"));
    assertEquals(list.getLast(), new String("First"));
  }

  @Test
  public void testSinglyLinkedListAfterAddLastAddLast() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addLast(new String("First Last"));
    assertEquals(list.getSize(), 1);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("First Last"));
    assertEquals(list.getLast(), new String("First Last"));
    list.addLast(new String("Last Last"));
    assertEquals(list.getSize(), 2);
    assertTrue(!list.isEmpty());
    assertEquals(list.getFirst(), new String("First Last"));
    assertEquals(list.getLast(), new String("Last Last"));
  }

  @Test
  public void testToStringDoesNotReturnNull() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    list.addLast(new String("First Last"));
    list.addLast(new String("Last Last"));
    String textualRepresentation = list.toString();
    assertTrue(textualRepresentation != null);
    assertTrue(textualRepresentation.contains(","));
    assertTrue(textualRepresentation.contains("("));
    assertTrue(textualRepresentation.contains(")"));
  }

  @Test
  public void testAddManyStringsToLinkedListWithAddFirst() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    for (int i = 0; i < SIZE; i++) {
      list.addFirst(Integer.toString(i));
    }
    assertTrue(!list.isEmpty());
    assertEquals(list.getSize(), SIZE);
  }

  @Test
  public void testAddManyStringsToLinkedListWithAddLast() {
    // TODO: create a SinglyLinkedList
    // TODO: populate list using addLast method
    // TODO: test that SinglyLinkedList is not empty
    // TODO: test that SinglyLinkedList size is correct
  }

  @Test
  public void testAddManyStringsToLinkedListWithAddFirstAndAddLast() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    for (int i = 0; i < SIZE; i++) {
      if (i % 2 == 0) {
        list.addFirst(Integer.toString(i));
      } else {
        list.addLast(Integer.toString(i));
      }
    }
    assertTrue(!list.isEmpty());
    assertEquals(list.getSize(), SIZE);
  }

  @Test
  public void testAddManyStringsToLinkedListWithAddLastAndThenRemove() {
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    for (int i = 0; i < SIZE; i++) {
      list.addFirst(Integer.toString(i));
    }
    assertTrue(!list.isEmpty());
    assertEquals(list.getSize(), SIZE);
    for (int i = 0; i < SIZE; i++) {
      list.removeFirst();
    }
    assertTrue(list.isEmpty());
    assertEquals(list.getSize(), 0);
  }

  @Test
  public void testAddManyStringsToLinkedListWithAddFirstAndThenRemove() {
    // TODO: create a SinglyLinkedList
    // TODO: populate list using addLast method
    // TODO: test that SinglyLinkedList is not empty
    // TODO: test that SinglyLinkedList size is correct
    // TODO: remove all elements using removeFirst method
    // TODO: test that SinglyLinkedList is empty
    // TODO: test that SinglyLinkedList size is 0
  }

  /* @Test
  * public void ...
  * students to add a test case for a recursive function
  */

  /* @Test
  * public void ...
  * students to add another test case for a recursive function
  */

  /* @Test
  * public void ...
  * students to add a third test case for a recursive function
  */

}
