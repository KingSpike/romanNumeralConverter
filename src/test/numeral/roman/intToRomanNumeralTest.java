package numeral.roman;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class intToRomanNumeralTest {
    @Test
    private void testM(){
        Assertion assertion = new Assertion();
        assertion.assertEquals("MMMCMXLII", "" + intToRomanNumeral.breakDownInt(3942));
    }

    @Test
    private void testD(){
        Assertion assertion = new Assertion();
        assertion.assertEquals("DCCCXLII", "" + intToRomanNumeral.breakDownInt(842));
    }

    @Test
    private void testC(){
        Assertion assertion = new Assertion();
        assertion.assertEquals("CCCXXII", "" + intToRomanNumeral.breakDownInt(322));
    }

    @Test
    private void testL(){
        Assertion assertion = new Assertion();
        assertion.assertEquals("LXII", "" + intToRomanNumeral.breakDownInt(62));
    }

    @Test
    private void testX(){
        Assertion assertion = new Assertion();
        assertion.assertEquals("XLII", "" + intToRomanNumeral.breakDownInt(42));
    }

    @Test
    private void testV(){
        Assertion assertion = new Assertion();
        assertion.assertEquals("VI", "" + intToRomanNumeral.breakDownInt(6));
    }

    @Test
    private void testI(){
        Assertion assertion = new Assertion();
        assertion.assertEquals("III", "" + intToRomanNumeral.breakDownInt(3));
    }
}
