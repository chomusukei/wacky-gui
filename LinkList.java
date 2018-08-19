package Array;

//Create a Queue Linked List for people that ordered.

public class LinkList
{
    Node head;
    
    public LinkList()
    {
        head = null;        
    }
    
    //Insert new node to the link list.
    public void insert(int i)
    {
        Node newNode = new Node(i);
        
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node p = head;
            while (p.next != null)
            {
                p = p.next;
            }
            p.next = newNode;
        }
        
    }    
    
    //Display all node's info in link list.
    public void display()
    {
        Node p = head;
        
        //If there is node in link list.
        if (p != null)
        {
            while(p != null)
            {
                System.out.println(p.qno);
                p = p.next;
            }
        }
        //When no more node/people in link list
        else
        {
            System.out.println("No more people in queue");
        }
    }
    
    //Delete node
    public Node delete()
    {
        Node p = head;
        head = head.next;
        return p;
    }
}

//Create a node for link list.
class Node
{
   int qno;
   Node next;
   
   public Node(int qno)
   {
       this.qno = qno;
   }
}

