package LinkedList;
// import java.util.*;

public class Linkedlist1 {

    Node head;      
    private int size;    

    Linkedlist1(){
        this.size = 0;
    }

    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data)
    {
        // Initial Steps If We are inserting data at the start of the list :-
        // Check Whether the head is pointint to null
        // Creating The Newnode To be added first
        Node newNode = new Node(data);        //Creating Newnode  
        size++;
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data)
    {
        // Adding Element At The Last Position
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode;
        currentNode = head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.next = null;
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("LIST IS EMPTY");
            return;
        }

        Node currentNode;
        currentNode = head;

        while(currentNode != null)
        {
            System.out.print(currentNode.data+" --> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst()
    {
        // Just make head point to firstNode.next;
        // Node tempNode;
        // tempNode = head;
        // head = tempNode.next;
        if(head == null)
        {
            System.out.println("ARRAY IS EMPTY NOTHING TO DELETE HERE");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("ARRAY IS EMPTY NOTHING TO DELETE HERE");
            return;
        }

        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        
        secondLastNode.next = null;
    }

    public int getSize()
    {
        return size;
    }

    public void revereseLinkedlist()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null)
        {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            // Reversing The Rest Of The LinkedList
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }

    public static void main(String[] args) 
    {
        Linkedlist1 obj = new Linkedlist1();

        obj.addFirst("Akash");
        obj.addFirst("Prasad");
        obj.addFirst("Soham");
        obj.addLast("Priyansh");
        obj.addFirst("Lucifer");
        // obj.display();
        // obj.revereseLinkedlist();
        obj.display();
        obj.head = obj.reverseRecursive(obj.head);
        obj.display();

    }
}
