package com.saas.test1;



import static com.saas.test1.App.isValidUserName;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
        String userName = "PrathiShetty";
        String userName1 = "Prathi Shetty";
        String userName2 = "Prathi_Shetty";
        String userName3 = "Prathi@Shetty";
        String userName4 = "Prathi/Shetty";
        String userName5 = "Prathi#Shetty";
        assertTrue(isValidUserName(userName));
        assertFalse(isValidUserName(userName1));
        assertFalse(isValidUserName(userName2));
        assertFalse(isValidUserName(userName3));
        assertFalse(isValidUserName(userName4));
        assertFalse(isValidUserName(userName5));
    }
}
