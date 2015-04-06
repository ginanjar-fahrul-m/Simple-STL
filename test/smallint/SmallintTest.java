/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smallint;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 */
public class SmallintTest {
    
    /**
     * 
     */
    public SmallintTest() {
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
     * Test of getV method, of class Smallint.
     */
    @Test
    public void testGetV() {
        System.out.println("getV");
        Smallint instance = new Smallint();
        int expResult = 0;
        int result = instance.getV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setV method, of class Smallint.
     */
    @Test
    public void testSetV() {
        System.out.println("setV");
        int v = 0;
        Smallint instance = new Smallint();
        instance.setV(v);
        assertEquals(instance.getV(), v);
    }

    /**
     * Test of add method, of class Smallint.
     */
    @Test
    public void testException() {
        System.out.println("testException");
        String message = "";
        try {
            Smallint s = new Smallint(9);
            Smallint instance = new Smallint(9);
            instance.add(s);
        } catch (SmallintException ex) {
            message = ex.getMessage();
        }
        assertEquals(message, new SmallintException(SmallintExceptionCode.S_OVERFLOW).getMessage());
        
        try {
            Smallint s = new Smallint(9);
            Smallint instance = new Smallint(8);
            instance.substract(s);
        } catch (SmallintException ex) {
            message = ex.getMessage();
        }
        assertEquals(message, new SmallintException(SmallintExceptionCode.S_UNDERFLOW).getMessage());
    }
    
    /**
     * Test of add method, of class Smallint.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Smallint expResult = null;
        Smallint result = null;
        try {
            Smallint s = new Smallint(2);
            Smallint instance = new Smallint(2);
            expResult = new Smallint(4);
            result = instance.add(s);
        } catch (SmallintException ex) {
            Logger.getLogger(SmallintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult.getV(), result.getV());
    }

    /**
     * Test of substract method, of class Smallint.
     * @throws Exception 
     */
    @Test
    public void testSubstract() throws Exception {
        System.out.println("substract");
        Smallint expResult = null;
        Smallint result = null;
        try {
            Smallint s = new Smallint(2);
            Smallint instance = new Smallint(2);
            expResult = new Smallint(0);
            result = instance.substract(s);
        } catch (SmallintException ex) {
            Logger.getLogger(SmallintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult.getV(), result.getV());
    }

    /**
     * Test of multiple method, of class Smallint.
     * @throws Exception 
     */
    @Test
    public void testMultiple() throws Exception {
        System.out.println("multiple");
        Smallint expResult = null;
        Smallint result = null;
        try {
            Smallint s = new Smallint(2);
            Smallint instance = new Smallint(3);
            expResult = new Smallint(6);
            result = instance.multiple(s);
        } catch (SmallintException ex) {
            Logger.getLogger(SmallintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult.getV(), result.getV());
    }

    /**
     * Test of divide method, of class Smallint.
     * @throws Exception 
     */
    @Test
    public void testDivide() throws Exception {
        System.out.println("divide");
        Smallint expResult = null;
        Smallint result = null;
        try {
            Smallint s = new Smallint(2);
            Smallint instance = new Smallint(2);
            expResult = new Smallint(1);
            result = instance.divide(s);
        } catch (SmallintException ex) {
            Logger.getLogger(SmallintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult.getV(), result.getV());
    }

    /**
     * Test of toString method, of class Smallint.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Smallint instance = new Smallint();
        String expResult = "0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
