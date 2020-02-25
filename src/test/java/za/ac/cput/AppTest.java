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
    public void testGetHello() {
        App ap = new App();

        assert("Hello World!!".equals(ap.getHello()));
    }
}
