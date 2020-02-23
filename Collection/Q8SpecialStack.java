package Collection;

/*
Design a Data Structure SpecialStack that supports all the stack operations like push(), pop()
, isEmpty(), isFull() and an additional operation getMin() which should return minimum element
 from the SpecialStack. (Expected complexity ­ O(1))
*/


import java.util.LinkedList;
import java.util.Stack;

class SpecialStack {
    int size;
    int len;
    Stack<Integer> stack;
    LinkedList<Integer>minList;
    int minimumElement;
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
