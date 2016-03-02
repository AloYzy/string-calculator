package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import stringCalculator.StringCalculator;

public class CalculateTest {

	@Test
	public void simpleTest() {
		StringCalculator sc = new StringCalculator();
		assertEquals(1, sc.calculate("1+1-1"));
	}
	
	@Test
	public void symbolOnTheBeginning() {
		StringCalculator sc = new StringCalculator();
		assertEquals(10, sc.calculate("+10+1-1"));
	}
	
	@Test
	public void symbolAtTheEnd() {
		StringCalculator sc = new StringCalculator();
		assertEquals(1, sc.calculate("+10+1-10-"));
	}
	
	@Test
	public void emptyString() {
		StringCalculator sc = new StringCalculator();
		assertEquals(0, sc.calculate(""));
	}

}
