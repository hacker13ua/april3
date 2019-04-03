package org.esurovskiy.april3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Main1 {
    public static void main(String[] args) {
        String s = "(2-3)+[222]+{2*(2-2)}";
        System.out.println(Arrays.asList(s.toCharArray()));
        Deque<Character> deque = new LinkedList<>();
        for (final char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                deque.addLast(c);
            } else if (c == '}' || c == ')' || c == ']') {
                final Character open = deque.pollLast();
                if (isClosed(open, c)) {
                    continue;
                }
                else {
                    System.out.println("Invalid string");
                    return;
                }
            }
        }
        if (deque.size()==0){
            System.out.println("OK");
        }
        else {
            System.out.println("Invalid");
        }
    }

    private static boolean isClosed(final Character open, final Character closed) {
        if(open.equals('{')){
            return closed.equals('}');
        }
        if(open.equals('(')){
            return closed.equals(')');
        }
        if(open.equals('[')){
            return closed.equals(']');
        }
        return false;
    }
}
