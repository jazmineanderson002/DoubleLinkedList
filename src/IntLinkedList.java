public class IntLinkedList
{
  // Instance Variables
  private Node head;
  private Node current;
  private Node previous;
  private Node tail;

  // Constructor
  public IntLinkedList()
  {
    head = null;
    tail = null;
    current = head;
    previous = head;
  } // end head constructor

  public void addNodeToStart(int addData)
  {
    // Create new node and replace previous as new head
    resetIteration();
    head = new Node(addData, head);
    if (current != null)
    {
      current.pLink = head;
    }
    else
    {
      tail = head;
    }
  } // end method addNodeToStart
  public void addToTail(int tailData)
  {
    reverseReset();
    tail = new Node(tail, tailData);
    if (current != null)
    {
      current.nLink = tail;
    }
  }

  // Delete Method
  public void deleteNodeFromTail()
  {
    if (tail != null)
    {
      tail = tail.pLink;
      tail.nLink = null;
    } // end if head not null
    else
    {
      System.out.println("Deleting from an empty list.");
      System.exit(0);
    } // end else
  } // end delete Node
  public void deleteNodeFromStart()
  {
    if (head != null)
    {
      head = head.nLink;
    } // end if head not null
    else
    {
      System.out.println("Deleting from an empty list.");
      System.exit(0);
    } // end else
  } // end delete Node

  // Length Method
  public int length()
  {
    int count = 0;
    Node position = head;

    while(position != null)
    {
      count++;
      position = position.nLink;
    } // end while

    return count;
  } // end length method

  /*
      Methods Relating to Iteration
  */
  public void goToNext()
  {
    if (current != null)
    {
      previous = current;
      current = current.nLink;
    } // end if
    else if (head != null)
    {
      System.out.println("Iteration reached end of line.");
      System.exit(0);
    } // else if
    else
    {
      System.out.println("You can't iterate an empty list.");
      System.exit(0);
    }
  } // end method goToNext

  public void resetIteration()
  {
    current = head;
    previous = null;
  } // end method reset
  public void reverseReset()
  {
    current = tail;
  }

  public int getDataAtNode()
  {
    int result = -1;
    if (current != null)
      result = current.data;
    else
      System.out.println("You can't get blood from a turnip.");
    return result;
  } // end method getDataAtNode

  // hasNext Method
  public boolean hasNext()
  {
    if (current.nLink != null)
    {
      return true;
    }
    else
    {
      return false;
    }
  } // end method hasNext

  public void showList()
  {
    Node position = head;
    while (position != null)
    {
      System.out.println(position.data);
      position = position.nLink;
    }
  } // end showList method

  /*
   Private Inner Class Node
   Only Accessible By Outer Class IntLinkedList
  */
  public class Node
  {
    // Instance Variable
    private int data;
    private Node nLink;
    private Node pLink;

    // Constructor
    private Node(int data, Node nLink) // Head
    {
      this.data = data;
      this.nLink = nLink;
      pLink = null;
    } // end Node constructor
    private Node(Node pLink, int data) // Tail
    {
      this.data = data;
      this.pLink = pLink;
      nLink = null;
    }

    // toString
    public String toString()
    {
      return "Data: " + data + "links to: " + nLink;
    } // end toString

  } // end class node

} // end LinkedList class
