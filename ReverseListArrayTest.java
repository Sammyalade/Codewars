import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;
public class ReverseListArrayTest{

	
	@Test
	public void testThatArrayCanPrintInReverseOrder(){
	
		ReverseListArray object = new ReverseListArray();
		
		int [] elements = {77, 12, 55, 23, 90};		
		int[] reversedArray = object.reversedArrayList(elements);
		System.out.println(Arrays.toString(reversedArray));
		assertArrayEquals(new int[] {90,77,55,23,12}, reversedArray);
		
	
	
	}





}