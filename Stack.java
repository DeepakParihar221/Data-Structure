import java.util.Scanner;

public class Stack {
    static int top;
    static int a[];
    Stack(int n)
    {
        a = new int [n];
        top = -1;
    }

    void push(int data,int n)
    {
        if(top>=n)
        {
            System.out.println("Stack Overflow");
            return;
        }
        a[++top] = data;
    }

    int pop()
    {
        if(top<=-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
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
        System.out.println("Enetr size of stack");
        int n = sc.nextInt();
        Stack ob = new Stack(n);
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
                ob.push(data,n);
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
        sc.close();
    }
}
