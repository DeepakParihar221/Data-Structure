import java.util.Scanner;

class Stack
{
    char st[];
    int top ;
    Stack(int n)
    {
        st = new char [n];
        top = -1;
    }
    void push(char s,int n)
    {
        if(top>=n)
        {   
            System.out.println("Stack Overflow");
            return;
        }
        st[++top] = s;
    }

    char pop()
    {
        if(top<=-1)
        {   
            System.out.println("Stack Underflow");
            return '0';
        }
        return st[top--];
    }
}    
public class RevStringUsingStack {
    void reverse(int n,char s[])
    {
        Stack st = new Stack(n);
        for(int i=0;i<n;++i)
        st.push(s[i], n);

        for(int i=0;i<n;++i)
        s[i] = st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = new char[1000];
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int n = str.length();
        for(int i=0;i<n;++i)
        s[i] = str.charAt(i);

        RevStringUsingStack ob = new RevStringUsingStack();
        ob.reverse(n, s);
        for(int i=0;i<n;++i)
        System.out.print(s[i]);

        sc.close();
    }
}
