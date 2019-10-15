
  public class LinkedListDriver
  {
    public static void main(String[] args)
    {
      IntLinkedList list = new IntLinkedList();
      list.addNodeToStart(5);
      list.addToTail(10);
      list.addNodeToStart(15);

      list.showList();
      System.out.println("Add to tail");
      list.addToTail(45);
      list.showList();
    } // end main method
  } // end driver class