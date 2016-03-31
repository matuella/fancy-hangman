package unittest.util;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import util.HangmanUtils;

public class HangmanUtilsUnitTest {

    private HangmanUtils hangmanUtils;

    @Before
    public void setUp() throws IOException{
        this.hangmanUtils = new HangmanUtils();
    }

    @Test
    public void testInputVerifierExists(){
        assertNotNull(this.hangmanUtils);
    }

    @Test
    public void testInputIsValid(){
        assertTrue(hangmanUtils.isAValidLetter('A'));
    }

    @Test
    public void testRandomizedAWord(){
        assertNotNull(hangmanUtils.randomWord());
    }

    @After
    public void tearDown(){
        this.hangmanUtils = null;
        assertNull(hangmanUtils);
    }
}
