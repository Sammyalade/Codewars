import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{


	
	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers(){
		Calculator calculator = new Calculator();
		int sum = calculator.add(5, 6);
		assertEquals(11, sum);
	}
	
	@Test
	public void testThatCalculatorCanAddTwoNegativeNumbers(){
		Calculator calculator = new Calculator();
		int sum = calculator.add(-3, -2);
		//System.out.print("sum is: " + sum + "\n");
		assertEquals(-5, sum);
	}
	
	@Test
	public void testThatCalculatorCanAddOneNegativeAndOnePositiveNumbers(){
		Calculator calculator = new Calculator();
		int sum = calculator.add(-3, 2);
		//System.out.print("sum is: " + sum + "\n");
		assertEquals(-1, sum);
	}
	
	@Test
	public void testThatCalculatorCanAddOneNegativeAndOnePositiveNumbers2(){
		Calculator calculator = new Calculator();
		int sum = calculator.add(3, -2);
		//System.out.print("sum is: " + sum + "\n");
		assertEquals(1, sum);
	}

	@Test
	public void testThatCalculatorCanMultiplyTwoPositiveNumbers(){
		Calculator calculator = new Calculator();
		int result = calculator.multiply(7, 10);
		//System.out.print("result is: " + result + "\n");
		assertEquals(70, result);
	
	}

	@Test
	public void testThatCalculatorCanMultiplyTwoNegativeNumbers(){
		Calculator calculator = new Calculator();
		int result = calculator.multiply(-7, -10);
		//System.out.print("result is: " + result + "\n");
		assertEquals(70, result);
	
	}

	@Test
	public void testThatCalculatorCanMultiplyOneNegativeAndOnePositiveNumbers(){
		Calculator calculator = new Calculator();
		int result = calculator.multiply(-7, 10);
		//System.out.print("result is: " + result + "\n");
		assertEquals(-70, result);
	
	}

	@Test
	public void testThatCalculatorCanMultiplyOneNegativeAndOnePositiveNumbers2(){
		Calculator calculator = new Calculator();
		int result = calculator.multiply(7, -10);
		//System.out.print("result is: " + result + "\n");
		assertEquals(-70, result);
	
	}
	
	@Test
	public void testThatCalculatorCanDivideTwoPositiveNumbers(){
		Calculator calculator = new Calculator();
		int result = calculator.divide(10, 2);
		assertEquals(5, result);
	
	}
	

}