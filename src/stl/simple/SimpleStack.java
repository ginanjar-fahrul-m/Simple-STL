package stl.simple;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author  Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
public class SimpleStack {

    private Stack<String> myStack;

    /**
     * Initialize String Stack
     * 
     */
    public SimpleStack() {
        myStack = new Stack<String>();
    }

    /**
     * Push single String to Stack.
     * Push: add an item on the top.
     * 
     * @param word
     *      a word item to be added at the top.
     */
    public void pushWord(String word) {
        myStack.push(word);
        System.out.println(word + " pushed on to stack");
    }

    /**
     * Pop single String from Stack.
     * Pop: return the item at the top and remove it.
     *      catch exception if it's empty.
     * 
     * @return a word item from Stack's top.
     */
    public String popWord() {
        String top = "";
        try {
            top = myStack.pop();	// pop the (empty) stack
            // any code in here would be skipped
        } catch (EmptyStackException e) { // catch and report the error
            System.out.println("Tried to pop an empty stack!\n" + e.getMessage());
        }
        return top;
    }

    /**
     * Push ArrayList String to Stack.
     * 
     * @param words 
     */
    public void pushWords(ArrayList<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String thisWord = iterator.next();
            pushWord(thisWord);
        }
    }

    /**
     * Push array String to Stack.
     * 
     * @param words
     *      an ArrayList String to be pushed sequentially at the top.
     */
    public void pushWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String thisWord = words[i];
            pushWord(thisWord);
        }
    }

    /**
     * Pop all Stack and print to screen.
     * 
     */
    public void popWords() {
        while (!myStack.empty()) {
            String poppedWord = popWord();
            System.out.println(poppedWord + " popped off stack");
        }
    }

    /**
     * Return size of Stack.
     * 
     * @return size of Stack.
     */
    public int getSize() {
        return myStack.size();
    }
}
