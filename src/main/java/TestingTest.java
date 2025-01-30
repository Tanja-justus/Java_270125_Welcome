//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingTest{

@Test

    // Test Summe a+b
 public void add_expectThree_whenAPlusBEqualsThree() {

        int a = 1;
        int b = 2;
        int expected = 3;

        int actual = Testing.add(a, b);
        // then
        assertEquals(expected, actual);
    }
    @Test
        //Test ist Gerade Zahl
   public void istGerade_expectTrue_whenModuleTrueEqualsTrue() {

        int a = 10;
        boolean expected =true;
        boolean actual = Testing.istGerade(a);
        assertEquals(expected, actual);
    }

    //Test hat Gross gemacht
    @Test
     public void istGross_expectText_whenTEXTEqualsTEXT() {

        String a = "Text";
        String expected ="TEXT";
        String actual = Testing.textGross(a);
        assertEquals(expected, actual);
    }
    @Test
// Test ist  Zahl -Positiv
    public void istPositiv_expectTrue_whenPositivTrueEqualsTrue() {

        int a = 7;
        boolean expected =true;
        boolean actual = Testing.istPositiv(a);
        assertEquals(expected, actual);
    }
}
