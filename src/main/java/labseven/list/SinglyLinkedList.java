package labseven.list;

/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * A generic singly linked list implementation.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * @author Janyl Jumadinova
 * @author zackery devers
 */

public class SinglyLinkedList<E> implements Cloneable {

  /**
  * The Node of a singly linked list, which stores a reference to its
  * element and to the subsequent node in the list (or null if this
  * is the last node).
  */
  // : Make sure that you understand how a Node class
  // declaration is "nested" inside of the SinglyLinkedList
  private static class Node<E> {

    /** The element stored at this node. */
    private E element;

    /** A reference to the subsequent node in the list. */
    private Node<E> next;

    /**
     * Creates a node with the given element and next node.
     *
     * @param element the element to be stored
     * @param next reference to a node that should follow the new node
     */
    public Node(E element, Node<E> next) {
      this.element = element;
      this.next = next;
    }

    /**
     * Returns the element stored at the node.
     * @return the element stored at the node
     */
    public E getElement() {
      return element;
    }

    /**
     * Returns the node that follows this one (or null if no such node).
     * @return the following node
     */
    public Node<E> getNext() {
      return next;
    }

    /**
     * Sets the node's next reference to point to Node next.j
     * @param next the node that should follow this one
     */
    public void setNext(Node<E> next) {
      this.next = next;
    }
  }

  /** The head node of the list. */
  private Node<E> head;

  /** The last node of the list. */
  private Node<E> tail;

  /** Number of nodes in the list. */
  private int size;

  /** Constructs an initially empty list. */
  public SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  /**
   * Returns the number of elements in the linked list.
   * @return number of elements in the linked list
   */
  public int getSize() {
    return size;
  }

  /**
   * Checks to see if the linked list is empty.
   * @return true if the linked list is empty, false otherwise
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Returns (but does not remove) the first element of the list.
   * @return element at the front of the list (or null if empty)
   */
  public E getFirst() {
    if (isEmpty()) {
      return null;
    }
    return head.getElement();
  }

  /**
   * Returns (but does not remove) the last element of the list.
   * @return element at the end of the list (or null if empty)
   */
  public E getLast() {
    if (isEmpty()) {
      return null;
    }
    return tail.getElement();
  }

  /**
   * Adds an element to the front of the list.
   * @param element the new element to add
   */
  public void addFirst(E element) {
    head = new Node<>(element, head);
    if (size == 0) {
      tail = head;
    }
    size++;
  }

  /**
   * Adds an element to the end of the list.
   * @param element the new element to add
   */
  public void addLast(E element) {
    Node<E> newest = new Node<>(element, null);
    if (isEmpty()) {
      head = newest;
    } else {
      tail.setNext(newest);
    }
    tail = newest;
    size++;
  }

  /**
   * Removes and returns the first element of the list.
   * public
   * @return the removed element (or null if empty)
   */
  public E removeFirst() {
    if (isEmpty()) {
      return null;
    }
    final E answer = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0) {
      tail = null;
    }
    return answer;
  }

  /**
   * Produces a string representation of the contents of the list.
   * @return the textual representation of the SinglyLinkedList
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    Node<E> current = head;
    while (current != null) {
      sb.append(current.getElement());
      if (current != tail) {
        sb.append(", ");
      }
      current = current.getNext();
    }
    sb.append(")");
    return sb.toString();
  }

}
