/*
 * PROJECT:    
 * DATE:       May xx, 2018
 * AUTHOR:     Alex Rebolledo
 * NOTES:      
 */
package stringreverser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexr
 */
public class StringReverserTest {
    
    public StringReverserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of reverseString method, of class StringReverser.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String word = "celeste";
        StringReverser instance = new StringReverser();
        String expResult = "etselec";
        StringBuilder resultBuild = instance.reverseString(word);
        String result = resultBuild.toString();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
