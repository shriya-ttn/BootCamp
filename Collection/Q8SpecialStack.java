package Collection;

/*
Design a Data Structure SpecialStack that supports all the stack operations like push(), pop()
, isEmpty(), isFull() and an additional operation getMin() which should return minimum element
 from the SpecialStack. (Expected complexity ­ O(1))
*/
//Slight problem in implementation of changing capacity value

import java.util.Stack;

public class Q8SpecialStack extends Stack<Integer>
{
    Stack<Integer> min = new Stack<Integer>();


    //int maxSize;
  /*  Q8SpecialStack(int size)
    {
        super();
        this.maxSize=size;
    }*/

    public void isEmptyy(){
       // if(isEmpty()) System.out.println("Stack Empty");
        if(super.size()==0)
       System.out.println("Stack  Empty");
        else System.out.println("Stack Empty");

    }

    public void isFull(){
        if (super.size()<super.capacity())
        {System.out.println("Not full yet");
       // return 1;
            }
        else {System.out.println("Stack Full"); }//return -1;}
    };

    void push(int x)
    {
        if(isEmpty())
        {
            super.push(x);
            min.push(x);
        }
        else if (super.size()<super.capacity())
        {
            super.push(x);
            int y = min.pop();
            min.push(y);

            if( x <= y )
                min.push(x);
        }
        else System.out.println("Stack full, entry not allowed");
    }


    public Integer pop()
    {
        if(super.isEmpty()==false) {
            int x = super.pop();
            int y = min.pop();


            if (y != x)
                min.push(y);
            return x;
        }
        else {
            System.out.println("Not allowed");
            return -1;
        }
    }


    int getMin()
    {
        int x = min.pop();
        min.push(x);
        System.out.print("Min value : ");
        return x;
    }


    public static void main(String[] args)
    {
        Q8SpecialStack s = new Q8SpecialStack();
        s.isEmptyy();
        s.push(5);
        s.push(2);
        s.push(1);

        s.push(20);
        s.isFull();
        s.push(30);
        System.out.println(s.getMin());
        System.out.println("Integer removed "+s.pop());
        System.out.println(s.getMin());
        s.push(9);
        s.getMin();
        System.out.println("Integer removed "+s.pop());
        System.out.println("Integer removed "+s.pop());
        System.out.println(s.getMin());
        System.out.println("Integer removed "+s.pop());
        System.out.println(s.getMin());
        System.out.println("Integer removed "+s.pop());
        System.out.println(s.getMin());
        //System.out.println("minimum element is "+s.getMin());
       // s.isFull();

    }
}



















/*

import java.util.LinkedList;
import java.util.Stack;

class SpecialStack {
    int size;
    int len;
    Stack<Integer> stack;
    LinkedList<Integer>minList;
    int minimumElement;x

    SpecialStack(int size){
        this.size=size;
        stack=new Stack<Integer>();
        minList=new LinkedList<>();
        len=0;
    }
    public void push(int x){
        if (stack.isEmpty())
        {
            minimumElement = x;
            stack.push(x);
            len++;
            minList.add(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        // If new number is less than original minEle
        if (x < minimumElement)
        {
            stack.push(x);
            minimumElement = x;
            minList.add(x);
            len++;
        }
        else{
            stack.push(x);
            len++;
        }
        System.out.println("Number Inserted: " + x);
    }
    public Integer pop(){
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.print("Top Most Element Removed: ");
        Integer t = stack.pop();
        len--;
        if(minList.contains(t)){
            minList.remove(t);
            if(!minList.isEmpty())
                minimumElement=minList.getLast();
        }
        return t;

        // Minimum will change as the minimum element
        // of the stack is being removed.
    }
    public boolean isEmpty(){
        return (len==0);
    }
    public boolean isFull(){
        return (len==size);
    }
    public Integer getMin(){
        if (stack.isEmpty()){
            // System.out.println("stack empty");
            return -1;
        }
        else
            return minimumElement;
    }
}


public class Q8SpecialStack {
    public static void main(String[] args) {
        SpecialStack specialStack=new SpecialStack(10);
        specialStack.push(5);
        specialStack.push(2);
        specialStack.push(1);
        specialStack.push(6);
        specialStack.push(9);
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        //System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.isEmpty());

    }
}
*/
