package za.ac.cput;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
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


}
