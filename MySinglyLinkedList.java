/**
 * This is a custom, stripped-down version of a LinkedList
 * which you will use for this problem instead of a regular
 * LinkedList.
 */
public class MySinglyLinkedList {
  private MySinglyLinkedListNode firstNode = null;
  private int length = 0;
  
  /**
   * Constructs a MyLinkedList from an integer array.
   */
  public MySinglyLinkedList(int[] numbersArray) {
    // set length
    length = numbersArray.length;
    
    // leave the first and last nodes as null if there
    // are no elements in the array
    if (numbersArray.length == 0) {
      return;
    }
    
    // set the first node to the first number
    firstNode = new MySinglyLinkedListNode(numbersArray[0], null);
    
    // create all the other nodes
    MySinglyLinkedListNode prevNode = firstNode;
    for (int i = 1; i < numbersArray.length; i++) {
      MySinglyLinkedListNode currentNode =
        new MySinglyLinkedListNode(numbersArray[i], null);
      prevNode.setNext(currentNode);
      prevNode = currentNode;
    }
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(length);
    
    MySinglyLinkedListNode currentNode = firstNode;
    for (int i = 0; i < length; i++) {
      sb.append(currentNode.toString());
      if (i < length - 1) {
        sb.append(" ");
        currentNode = currentNode.getNext();
      }
    }
    
    return sb.toString();
  }
 
  //Reverses this linked list
  public void reverse() {
    MySinglyLinkedListNode current = firstNode;
    MySinglyLinkedListNode previous = null;
    MySinglyLinkedListNode next = null;
    
    while (current != null) {
      next = current.getNext();
      current.setNext(previous);
      previous = current;
      current = next;
    }
    firstNode = previous;
  }
}
