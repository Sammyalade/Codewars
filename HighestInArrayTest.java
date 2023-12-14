import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HighestInArrayTest{


	@Test 
	public void testThatReturnsLargestElementInAList(){
		HighestInArray highest = new HighestInArray();
		int[] elements = {1,2,3,4,5};
		
		int maxVal = highest.giveHighestElement(elements);
		System.out.print(maxVal);
		assertEquals(5, maxVal);
	}




}