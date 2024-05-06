import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    @Test
    public void testParseWorks(){
        HugeInteger hugeInteger = new HugeInteger();
        int [] expected = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int[] actual = hugeInteger.parse("2222222222222222222222222222222222222222");
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testParseMethodIfTheLengthIsGreaterThan40(){
        HugeInteger hugeInteger = new HugeInteger();
        assertThrows(NumberNotInRangeException.class, ()-> hugeInteger.parse("222332222222222222222222222222222222222222"));
    }
    @Test
    public void testParseMethodIfTheLengthIsLesserThan40(){
        HugeInteger hugeInteger = new HugeInteger();
        assertThrows(NumberNotInRangeException.class, ()-> hugeInteger.parse("2222222222222222222222222222222222"));
    }
//    @Test
//    public void testParseMethodThatThrowsException(){
//        HugeInteger hugeInteger = new HugeInteger();
//        assertThrows(NumberNotInRangeException.class, ()-> hugeInteger.parse("222222222222222222222222222222222222222m"));
//    }
    @Test
    public void testMethodToString(){
        HugeInteger hugeInteger = new HugeInteger();
        String expected = "2222222222222222222222222222222222222222";
        hugeInteger.parse("2222222222222222222222222222222222222222");
        assertEquals(expected, hugeInteger.toString());

    }
    @Test
    public void testToAdd(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger2.parse("2222222222222222222222222222222222222222");
        assertEquals(160, hugeInteger.add(hugeInteger2));
    }
    @Test
    public void testToSubtract(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger1.parse("2222222222222222222222222222222222222222");
        assertEquals(0, hugeInteger.subtract(hugeInteger1));
    }
    @Test
    public void testIsEqualsTo(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger1.parse("2222222222222222222222222222222222222222");
        assertTrue(hugeInteger.equals(hugeInteger1));
    }
    @Test
    public void testIsNotEqualsTo(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger1.parse("3222222222222222222222222222223333222223");
        assertTrue(hugeInteger.isNotEqualsTo(hugeInteger1));
    }
    @Test
    public void testIsGreaterThan(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger1.parse("3222222222222222222222222222223333222223");
        assertTrue(hugeInteger.isGreaterThan(hugeInteger1));
    }

    @Test
    public void testLessThan(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger1.parse("3222222222222222222222222222223333222223");
        assertTrue(hugeInteger.isLessThan(hugeInteger1));
    }
    @Test
    public void testIsGreaterThanOrEqualsTo(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger1.parse("3222222222222222222222222222223333222223");
        assertTrue(hugeInteger.isGreaterThanOrEqualsTo(hugeInteger1));
    }
    @Test
    public void testIsLessThanOrEqualsTo(){
        HugeInteger hugeInteger = new HugeInteger();
        HugeInteger hugeInteger1 = new HugeInteger();
        hugeInteger.parse("2222222222222222222222222222222222222222");
        hugeInteger1.parse("3222222222222222222222222222223333222223");
        assertTrue(hugeInteger.isLessThanOrEqualsTo(hugeInteger1));
    }


}