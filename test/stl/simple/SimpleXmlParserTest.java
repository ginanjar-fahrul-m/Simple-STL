package stl.simple;

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
public class SimpleXmlParserTest {
    
    /**
     * 
     */
    public SimpleXmlParserTest() {
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
     * Test of simpleUnmarshal method, of class SimpleXmlParser.
     * @throws Exception 
     */
    @Test
    public void testSimpleUnmarshal() throws Exception {
        System.out.println("simpleUnmarshal");
        SimpleXmlParser.simpleUnmarshal();
        //can't be asserted see output
    }

    /**
     * Test of simpleMarshal method, of class SimpleXmlParser.
     * @throws Exception 
     */
    @Test
    public void testSimpleMarshal() throws Exception {
        System.out.println("simpleMarshal");
        SimpleXmlParser.simpleMarshal();
        //can't be asserted see output
    }
}
