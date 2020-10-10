import java.util.*;

class Stack
{
    int top;
    char a[];
    Stack(int n)
    {
        top = -1;
        a = new char[n];
    }

    void push(char c,int n)
    {
        if(top>=n)
        {   
            System.out.println("Stack Overflow");
            return ;
        }
        else
        a[++top] = c;
    }

    void pop()
    {
        if(top<=-1)
        {   
            System.out.println("Stack Underflow");
            return ;
        }
        else
        top--;
    }

    void display()
    {
        for(int i=0;i<=top;++i)
        System.out.print(a[i]+" ");
    }

    char peek (int n)
    {
        if(top<=n)
        return a[top];
        else
        return 0;
    }
}
public class BalancedParanthesis {
    void checker(int n,char c[])
    {
        Stack st = new Stack(n);
        int flag = 1;
        for(int i=0;i<n;++i)
        {
            if(c[i]=='('||c[i]=='['||c[i]=='{')
            st.push(c[i], n);
            else if(c[i]==')'&&st.peek(n)=='(')
            {
                st.pop();
            }
            else if(c[i]==']'&&st.peek(n)=='[')
            {
                st.pop();
            }
            else if(c[i]=='}'&&st.peek(n)=='{')
            {
                st.pop();
            }
            else
            {
                flag = 0;
            }
        }
        if(flag==0)
        System.out.println("Not Balanced");
        else
        System.out.println("Balanced");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BalancedParanthesis ob = new BalancedParanthesis();
        System.out.println("Enter paranthesis string");
        String s = sc.nextLine();
        int n = s.length();
        char c[] = new char[n];

        for(int i=0;i<n;++i)
        c[i] = s.charAt(i);

        ob.checker(n, c);

        sc.close();
    }
}
