import java.util.Scanner;

public class Stack {
    static int top = -1;
    static int a[] = new int [1000];

    void push(int data)
    {
        a[++top] = data;
    }

    int pop()
    {
        return a[top--];
    }

    int peek()
    {
        return a[top];
    }

    void display()
    {
        for(int i=0;i<=top;++i)
        System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack ob = new Stack();
        boolean run = true;
        int ch,data;
        while(run)
        {
            System.out.println("\nEnter your choice ");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter data value into stack");
                data = sc.nextInt();
                ob.push(data);
                break;
                case 2:
                System.out.println("Element deleted is "+ ob.pop());
                break;
                case 3:
                System.out.println("Top element is "+ob.peek());
                break;
                case 4:
                ob.display();
                break;
                case 5:
                run = false;
                break;
            }
        }
    }
}
