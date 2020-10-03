import java.util.Scanner;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
        
    }
    Node head;
    
    void insert(int data,int pos)
    {
        Node temp = new Node(data);
        if(head==null||pos==0)
        head = temp;
        else{
            Node ptr = head;
            while(pos-- - 1 > 0)
            {
                ptr = ptr.next;
                
            }
            temp.next = ptr.next;
            ptr.next = temp;
        }
    }

    void display()
    {
        Node ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
    }

    void delete(int pos)
    {
        if(pos==0)
        head = head.next;
        else{
            Node ptr = head;
            Node ptr1;
            while(pos-- -1>0)
            {
                ptr = ptr.next;
            }
            ptr1 = ptr.next;
            ptr.next = ptr1.next;
            ptr1.next = null;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        int data,pos;
        boolean run = true;
        while(run)
        {
            System.out.println("Enter your choice\n1.to insert\n2.to delete\n3.to display\n4.to exit");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the position and value of of node");
                pos = sc.nextInt();
                data = sc.nextInt();
                l.insert(data,pos);
                break;
                
                case 2: System.out.println("Enter position which you want to delete");
                pos = sc.nextInt();
                l.delete(pos);
                break;
                
                case 3: l.display();
                break;

                case 4:
                run = false;
            }
        }
        sc.close();
    }
    
}