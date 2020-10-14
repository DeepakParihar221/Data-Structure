import java.util.Scanner;


class Stack {
    static int a[];
    int top;
    Stack(int n) {
        a = new int[n];
        top = -1;
    }

    void push(int data, int n) {
        if (top >= n) {
            System.out.println("Stack Overflow");
            return;
        }
        a[++top] = data;
    }

    int pop() {
        int temp = a[top];
        if (top <= -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        top--;
        return temp;
    }

    int peek() {
        return a[top];
    }

    void display() {
        for (int i = 0; i <= top; ++i)
            System.out.print(a[i] + " ");
    }
}
// Brute Force Approach, time complexity = O(n^2)

// public class NextGreater {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter no. of elements");
// int n = sc.nextInt();

// int a[] = new int [n];
// System.out.println("Enter array elements");
// for(int i=0;i<n;++i)
// a[i] = sc.nextInt();
// int max;
// int flag;
// for(int i=0;i<n;++i)
// {
// max = a[i];
// flag = 0;
// for(int j=i+1;j<n;++j)
// {
// if(max<a[j])
// {
// max = a[j];
// flag = 1;
// break;
// }
// }
// if(flag==1)
// System.out.print(max+" ");
// else
// System.out.print("-1 ");
// }
// sc.close();
// }

// }


//Using Stack reducing time complexity to O(n)
public class NextGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        Stack st = new Stack(n);

        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; ++i)
        a[i] = sc.nextInt();
        
        st.push(a[0], n);
        int next;
        for(int i=1;i<n;++i)
        {
            next = a[i];
            if(st.top==-1||next<st.peek())
            {
                st.push(next, n);                  
            }
            else if(next>st.peek())
            {
                while(st.top!=-1&&next>st.peek())
                {
                    
                    System.out.println(st.pop()+" --> "+next);
                }
                st.push(next, n);
            }

        }
        while(st.top!=-1)
        System.out.println(st.pop()+" --> "+-1);
    }
}