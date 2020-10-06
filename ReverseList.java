import java.util.Scanner;

public class ReverseList {
    static int max = 0;

    class Node
    {
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
        max++;
        Node temp = new Node(data);
        if(max>=pos){
        if(head==null||pos==0)
        {   
            temp.next = head;
            head = temp;
        }
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
    else
    System.out.println("Invalid Position");
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

     void reverse()
     {
        Node pre = null;
        Node cur = head;
        Node next = null;

        while(cur!=null)
        {
        next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
        }
        head = pre;
     }

    // Node delete()
    // {
    //     max--;
    //     Node temp = head;
    //     head = head.next;

    //     return temp;
    // }

    // Node head1;
    // void insert(Node temp)
    // {
    //     // temp = head1;
    //     if(head1==null)
    //     head1 = temp;
    //     else
    //     {
    //         temp.next = head1;
    //         head1 = temp;
    //     }
    // }
    // Node reverse;
    // void reverse()
    // {
    //     if(head==null)
    //     return;

    //     while(head!=null)
    //     {
    //         Node temp = delete();
    //         insert(temp);
            
    //     }
    // }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ReverseList ob = new ReverseList();
        int ch,pos,data;    
        boolean run = true;
        while(run)
        {
            System.out.println("Enter you choice");
            System.out.println("1.Insert\n2.Reverse\n3.Display\n4.Exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                System.out.println("Enter position and value of node");
                pos = sc.nextInt();
                data = sc.nextInt();
                ob.insert(data, pos);
                break;
                case 2:
                ob.reverse();
                break;
                case 3:
                ob.display();
                break;
                case 4:
                run = false;
                break;
            }
        }
        sc.close();
    }
}
