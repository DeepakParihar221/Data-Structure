import java.util.Scanner;

public class Queue {
    static int rear, front, size;
    int n;
    static int a[];
    Queue(int n)
    {
        rear = front = size = 0;
        this.n = n;
        a = new int[n];
    }

    boolean isFull(int size,int n)
    {
        if(size==n)
        return true;

        return false;
    }

    void enqueue(int data)
    {
        if(isFull(size, n))
        System.out.println("Queue Overloaded");
        else
        {
            a[(rear++)%n] = data;
            size++;
        }
    }

    int dequeue()
    {
        if(size==0)
        {   
            System.out.println("Queue Underloaded");
            return -1;
        }
        int temp = a[(front)%n];
        front = (front+1)%n;
        size--;
        return temp;
    }

    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(a[(front+i)%n]+" ");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capacity of Queue");
        int n = sc.nextInt();
        Queue ob = new Queue(n);
        boolean run = true;
        while(run)
        {
            System.out.println("Enter your choice");
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter data value in queue ");
                int data = sc.nextInt();
                ob.enqueue(data);
                break;
                
                case 2:
                int delelted = ob.dequeue();
                System.out.println(delelted + " is deleted");
                break;

                case 3:
                ob.display();
                break;

                case 4:
                run = false;
                break;
            }
        }
        
    }
}
