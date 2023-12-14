import org.junit.jupiter.api.Test;

public class OddPositionElementTest{


	@Test
	public void testThatOddPositionElementIsPrinted(){
		
		OddPositionElement object = new OddPositionElement();
		int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] oddPrint = object.printOddPosition(elements);
		


	}



}