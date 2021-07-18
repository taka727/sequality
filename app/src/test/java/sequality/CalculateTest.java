package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));

    expected = 55;
    assertEquals(expected, calculate.tosum(1, 10));

    expected = 25;
    assertEquals(expected, calculate.oddevensum(1, 10,1));

    expected = 30;
    assertEquals(expected, calculate.oddevensum(1, 10,0));

    double result = 2.5;
    assertEquals(result, calculate.average(5, 2), 1);
    result = 5.5;
    assertEquals(result, calculate.average(55, 10), 1);
  }

}
