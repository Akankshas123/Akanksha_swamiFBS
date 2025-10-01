package p1;


public class Stack2 {
      int top;
      String[] stack;
      int size;

    public Stack2(int size) {
        this.size=size;
        this.stack=new String[size];
        this.top= -1;
    }

    public boolean isFull()
    {
        return top==size-1;
    }

    public boolean isEmpty()
    {
        return top== -1;
    }

    public void write(String line)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow - Cannot add more lines");
        }
        else
        {
            stack[++top]=line;
            System.out.println("Line added");
        }
    }

    public void undo()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to undo");
        }else{
            System.out.println("Undo performed: "+stack[top--]);
        }
    }

    public void display()
    {
        if(isEmpty())
        { 
            System.out.println("No content");
        }
        else
        {
            System.out.println("Current Text:");
            for (int i=0;i<=top;i++){
                System.out.println(stack[i]);
            }
        }
    }
}