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
public class SimpleStackTest {
    
    /**
     * 
     */
    public SimpleStackTest() {
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
     * Test of pushWord method, of class SimpleStack.
     */
    @Test
    public void testPushWord() {
        System.out.println("pushWord");
        String word = "first";
        SimpleStack instance = new SimpleStack();
        instance.pushWord(word);
        assertEquals(1, instance.getSize()); //current size = 1
    }

    /**
     * Test of popWord method, of class SimpleStack.
     */
    @Test
    public void testPopWord() {
        System.out.println("popWord");
        SimpleStack instance = new SimpleStack();
        String expResult = "first";
        instance.pushWord("first");
        String result = instance.popWord();
        assertEquals(expResult, result); //current top is "first"
        assertEquals(0, instance.getSize()); //top removed, size = 0
    }

    /**
     * Test of pushWords method, of class SimpleStack.
     */
    @Test
    public void testPushWords_ArrayList() {
        System.out.println("pushWords");
        ArrayList<String> words = new ArrayList<String>();
        words.add("first");
        words.add("second");
        SimpleStack instance = new SimpleStack();
        instance.pushWords(words);
        assertEquals(2, instance.getSize()); //added two words, size = 2
        assertEquals("second", instance.popWord()); //current top is "second"
        assertEquals(1, instance.getSize()); //head removed, size changed to 1
        assertEquals("first", instance.popWord()); //current top is "first"
        assertEquals(0, instance.getSize()); //head removed, size changed to 0
    }

    /**
     * Test of pushWords method, of class SimpleStack.
     */
    @Test
    public void testPushWords_StringArr() {
        System.out.println("pushWords");
        String[] words = {"first", "second"};
        SimpleStack instance = new SimpleStack();
        instance.pushWords(words);
        assertEquals(2, instance.getSize()); //added two words, size = 2
        assertEquals("second", instance.popWord()); //current top is "second"
        assertEquals(1, instance.getSize()); //head removed, size changed to 1
        assertEquals("first", instance.popWord()); //current top is "first"
        assertEquals(0, instance.getSize()); //head removed, size changed to 0
    }

    /**
     * Test of popWords method, of class SimpleStack.
     */
    @Test
    public void testPopWords() {
        System.out.println("popWords");
        ArrayList<String> words = new ArrayList<String>();
        words.add("first");
        words.add("second");
        SimpleStack instance = new SimpleStack();
        instance.pushWords(words);  
        assertEquals(2, instance.getSize()); //added two words, size = 2
        instance.popWords();
        assertEquals(0, instance.getSize()); //words dequeued, size = 0
    }
}
