public class add_front_back_linkedlist {
  public Node head;
  
  public static class Node
  {
    int data;
    Node next;
    Node prev;

    public Node(Node previous, int data, Node next)
    {
      this.data = data;
      this.next = next;
      this.prev = previous;
    }    
  }
  
  public void display(Node head)
  {
    if(head == null)
    {
      return;
    }  
    Node current = head;
    while(current != null)
    {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.print(current);
  }

  public void search(int name)
  {
    if(head == null)
    {
      System.out.println("nothing in the list");
    }
    else
    {
      Node current = head;
      while(current != null)
      {
        if(name == current.data)
        {
          System.out.println("Number is on the list");
        }
        current = current.next;
      }
      
    }
  }

  public void addFront(int data)
  {
    if(head == null)
    {
      head = new Node(null, data, null);
    }
    else
    {
      Node newNode = new Node(null, data, head);
      head.prev = newNode;
      head = newNode;
    }
  }
  
  public void addRear(int data)
  {
    if(head == null)
    {
      head = new Node(null, data, null);
    }
    else
    {
      Node current = head;
      while(current.next != null)
      {
        current = current.next;
      }
      Node newNode = new Node(current, data, null);
      current.next = newNode;
    }

  }
  
  public static void main(String[] args)
  {
    add_front_back_linkedlist list = new add_front_back_linkedlist();
    
    list.addFront(6);
    list.addFront(8);
    
    
    list.addRear(13);
    list.addRear(2);
    
    list.addFront(64);
    
    list.search(8);
    list.addRear(22);
    list.display(list.head);    
    System.out.println(list);
  }
  
}
