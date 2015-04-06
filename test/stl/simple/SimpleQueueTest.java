package stl.simple;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
public class SimpleQueueTest {
    
    /**
     * 
     */
    public SimpleQueueTest() {
    }

    /**
     * 
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     * 
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of enqueueWord method, of class SimpleQueue.
     */
    @Test
    public void testEnqueueWord() {
        System.out.println("enqueueWord");
        String word = "first";
        SimpleQueue instance = new SimpleQueue();
        instance.enqueueWord(word);
        assertEquals(1, instance.getSize()); //current size = 1
    }

    /**
     * Test of dequeueWord method, of class SimpleQueue.
     */
    @Test
    public void testDequeueWord() {
        System.out.println("dequeueWord");
        SimpleQueue instance = new SimpleQueue();
        String expResult = "first";
        instance.enqueueWord("first");
        String result = instance.dequeueWord();
        assertEquals(expResult, result); //current head is "first"
        assertEquals(0, instance.getSize()); //head removed, size = 0
    }

    /**
     * Test of peekWord method, of class SimpleQueue.
     */
    @Test
    public void testPeekWord() {
        System.out.println("peekWord");
        SimpleQueue instance = new SimpleQueue();
        String expResult = "first";
        instance.enqueueWord("first");
        String result = instance.peekWord();
        assertEquals(expResult, result); //current head is "first"
        assertEquals(1, instance.getSize()); //head isn't removed, size still = 1
    }

    /**
     * Test of enqueueWords method, of class SimpleQueue.
     */
    @Test
    public void testEnqueueWords_ArrayList() {
        System.out.println("enqueueWords");
        ArrayList<String> words =  new ArrayList<String>();
        words.add("first");
        words.add("second");
        SimpleQueue instance = new SimpleQueue();
        instance.enqueueWords(words);
        assertEquals(2, instance.getSize()); //added two words, size = 2
        assertEquals("first", instance.dequeueWord()); //current head is "first"
        assertEquals(1, instance.getSize()); //head removed, size changed to 1
        assertEquals("second", instance.dequeueWord()); //current head is "second"
        assertEquals(0, instance.getSize()); //head removed, size changed to 0
    }

    /**
     * Test of enqueueWords method, of class SimpleQueue.
     */
    @Test
    public void testEnqueueWords_StringArr() {
        System.out.println("enqueueWords");
        String[] words = {"first", "second"};
        SimpleQueue instance = new SimpleQueue();
        instance.enqueueWords(words);
        assertEquals(2, instance.getSize()); //added two words, size = 2
        assertEquals("first", instance.dequeueWord()); //current head is "first"
        assertEquals(1, instance.getSize()); //head removed, size changed to 1
        assertEquals("second", instance.dequeueWord()); //current head is "second"
        assertEquals(0, instance.getSize()); //head removed, size changed to 0
    }

    /**
     * Test of dequeueWords method, of class SimpleQueue.
     */
    @Test
    public void testDequeueWords() {
        System.out.println("dequeueWords");
        ArrayList<String> words = new ArrayList<String>();
        words.add("first");
        words.add("second");
        SimpleQueue instance = new SimpleQueue();
        instance.enqueueWords(words);
        assertEquals(2, instance.getSize()); //added two words, size = 2
        instance.dequeueWords();
        assertEquals(0, instance.getSize()); //words dequeued, size = 0
    }
}
