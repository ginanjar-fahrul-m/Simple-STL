/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stl.simple;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 */
public class SimpleHashMapTest {
    
    /**
     * 
     */
    public SimpleHashMapTest() {
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
     * Test of addValue method, of class SimpleHashMap.
     */
    @Test
    public void testAddValue() {
        System.out.println("addValue");
        String key = "one";
        int value = 1;
        SimpleHashMap instance = new SimpleHashMap();
        instance.addValue(key, value);
    }

    /**
     * Test of getValue method, of class SimpleHashMap.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        String key = "one";
        int value = 1;
        SimpleHashMap instance = new SimpleHashMap();
        instance.addValue(key, value);
        int expResult = 1;
        int result = instance.getValue(key);
        assertEquals(expResult, result);
    }
}
