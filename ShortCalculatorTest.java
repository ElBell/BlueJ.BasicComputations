import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ShortCalculatorTest {
    private static volatile ShortCalculator shortCalculator = new ShortCalculator();
    @Test
    public void testShortSum() {
        // : Given
        short first = 4;
        short second = 4;
        short expectedShort = 8;
        // : When
        short actualShort = shortCalculator.sumShort(first, second);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortDifference() {
        // : Given
        short baseValue = 5;
        short difference = 3;
        short expectedShort = 2;
        // : When
        short actualShort = shortCalculator.differenceShort(baseValue, difference);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortProduct() {
        // : Given
        short multiplicand = 4;
        short multiplier = 1;
        short expectedShort = 4;
        // : When
        short actualShort = shortCalculator.productShort(multiplicand, multiplier);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortDivisor() {
        // : Given
        short dividend = 6;
        short divisor = 3;
        short expectedShort = 2;
        // : When
        short actualShort = shortCalculator.quotientShort(dividend, divisor);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
    
    @Test
    public void testShortRemainder() {
        // : Given
        short dividend = 7;
        short divisor = 6;
        short expectedShort = 1;
        // : When
        short actualShort = shortCalculator.remainderShort(dividend, divisor);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
}
