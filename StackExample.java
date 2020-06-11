import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        //Creating a stack
        Stack<Integer> stackOfNumbers = new Stack<>();

        //Pushing new item into stack
        stackOfNumbers.push(1);
        stackOfNumbers.push(2);
        stackOfNumbers.push(3);

        System.out.println("Stack=>" + stackOfNumbers);
        System.out.println();

        //Popping items from the stack
        Integer numberAtTop = stackOfNumbers.pop(); // Will throw exception is the stack is empty
        System.out.println("Stack.pop() =>" + numberAtTop);
        System.out.println("current Stack =>" + stackOfNumbers);
        System.out.println();

        //get the items ar the top of the stack without removing it
        numberAtTop = stackOfNumbers.peek();
        System.out.println("stack.peek()=>" + numberAtTop);
        System.out.println("current Stack=>" + stackOfNumbers);

        

    }
}
