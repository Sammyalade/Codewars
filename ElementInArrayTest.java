import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ElementInArrayTest{


	@Test
	public void testThatElementOccurInAnArray(){


		ElementInArray object = new ElementInArray();
		
		int[] elements = {7, 8, 5, 3, 1};	

		String checkNumber = object.checkIfItExist(elements, 7);
		assertEquals("Available in the Element", checkNumber);
		
		
		
		



	}








}