package test;

import java.util.Stack;

public class StackTest {

    Stack<Character> stack = new Stack<Character>();

     String testStack(){

        stack.push('1');
        stack.push('3');
        stack.push('1');
        stack.push('3');
        stack.push('1');
        stack.push('3');

        return stack.toString();


    }



}
