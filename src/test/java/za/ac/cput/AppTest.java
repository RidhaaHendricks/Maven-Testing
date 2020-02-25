package za.ac.cput;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testCompareWords() {

        // TO TEST OBJECT EQUALITY
        App app = new App(){};

        assertEquals("True", app.compareWords("hello", "hello"));
    }

    @Test
    public void testCompareIden() {

        // TO TEST OBJECT IDENTITY
        App app = new App(){};

        assertSame("True", app.compareIden("test", "test"));
        assertNotSame("False", app.compareIden("test", "test"));
    }

    @Test
    public void largestValTest() {
        try {
            App app = new App(){};

            app.largestVal(new int[] {});
            fail("Should have thrown an exception");
        } catch (final RuntimeException e) {
            assertTrue(true);
        }
    }

    // TO TEST USING TIMEOUT
    @Test (timeout = 3)
    public void testWithTimeout() {
        System.out.println(" * UtilsJUnit4Test:test method 2 − testWithTimeout( )") ;
        App app = new App(){};
        app.WithTimeout();
        System.out.printf("Computing %d!%n", app.WithTimeout());
    }

    // TO DISABLE A TEST
    @Ignore
    @Test (timeout = 3)
    public void disableTestWithTimeout() {
        System.out.println(" * UtilsJUnit4Test:test method 2 − testWithTimeout( )") ;
        App app = new App(){};
        app.WithTimeout();
        System.out.printf("Computing %d!%n", app.WithTimeout());
    }
}
