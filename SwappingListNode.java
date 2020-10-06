import java.util.Scanner;

public class SwappingListNode {
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

    void swap(int x,int y)
    {
        Node currX,useX=null,currY,useY=null;
        currX=head;
        currY=head;
        while(currX!=null&&currX.data!=x)
        {
            useX = currX;
            currX = useX.next;
        }
        while(currY!=null&&currY.data!=y)
        {
            useY = currY;
            currY = useY.next;
        }

        if(currX==null||currY==null)
        return;
        else if(currX.data==currY.data)
        return;

        if(useX==null)
        head = currX;
        else if(useY==null)
        head = currY;


        if(useX!=null)
        useX.next = currY;
        if(useY!=null)
        useY.next = currX;

        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;
        
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

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        SwappingListNode ob = new SwappingListNode();
        int ch,data,pos,pos1,pos2;
        boolean run = true;
        while(run)
        {
            System.out.println("Enter your choice");
            System.out.println("1.Insert\n2.Swap\n3.Display\n4.Exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter position and value of node");
                        pos = sc.nextInt();
                        data = sc.nextInt();
                        ob.insert(data, pos);
                        break;
                case 2: System.out.println("Enter values you want to swap");
                        pos1 = sc.nextInt();
                        pos2 = sc.nextInt();
                        ob.swap(pos1, pos2);
                        break;
                case 3: ob.display();
                        break;
                case 4: run = false;
                break;
            }
        }
        sc.close();
    }
}
