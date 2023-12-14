import java.util.Arrays;
public class ElementInArray{


	public String checkIfItExist(int[] elements, int userInput){
		String checker = null;
		if (userInput != elements[0] && userInput != elements[1] && userInput != elements[2] && userInput != elements[3] && userInput != elements[4]) checker = (Arrays.toString(elements)); 
			
		else
		if (userInput == elements[0] || userInput == elements[1] || userInput == elements[2] || userInput == elements[3] || userInput == elements[4]) checker = ("Available in the Element");
			
		
		return checker;

	}



}