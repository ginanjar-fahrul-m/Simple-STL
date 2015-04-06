package stl.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
public class SimpleQueue {

    private Queue<String> myQueue;

    /**
     * Initialize String Queue
     */
    public SimpleQueue() {
        myQueue = new LinkedList<String>();
    }

    /**
     * Enqueue single String to Queue's tail.
     * Enqueue: add an item at the tail.
     * 
     * @param word
     *      a word item to be added at the tail.
     */
    public void enqueueWord(String word) {
        myQueue.add(word);
        System.out.println(word + " enqueued on to the tail");
    }

    /**
     * Dequeue single String from Queue's head.
     * Dequeue: return the item at the head and remove it.
     * 
     * @return a word item from Queue's head, return null if it's empty.
     */
    public String dequeueWord() {
        return myQueue.poll();
    }

    /**
     * Peek single String from Queue Head.
     * Peek: return the item at the head (without removing it).
     * 
     * @return a word item from Queue's head, , return null if it's empty.
     */
    public String peekWord() {
        return myQueue.peek();
    }

    /**
     * Enqueue ArrayList String to Queue.
     * 
     * @param words
     *      an ArrayList String to be added sequentially at the tail.
     */
    public void enqueueWords(ArrayList<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String thisWord = iterator.next();
            enqueueWord(thisWord);
        }
    }

    /**
     * Enqueue array String to Queue.
     * 
     * @param words
     *      an array String to be added sequentially at the tail.
     */
    public void enqueueWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String thisWord = words[i];
            enqueueWord(thisWord);
        }
    }

    /**
     * Dequeue all Queue and print to screen.
     * 
     */
    public void dequeueWords() {
        while (!myQueue.isEmpty()) {
            String head = dequeueWord();
            System.out.println(head + " dequeued off queue");
        }
    }

    /**
     * Return size of Queue.
     * 
     * @return size of Queue.
     */
    public int getSize() {
        return myQueue.size();
    }
}
