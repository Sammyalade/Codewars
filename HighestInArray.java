public class HighestInArray{

	public int giveHighestElement(int[] elements){
		
		int highest = elements[0];
		
		if (elements[1] > highest){
			highest = elements[1];
		}
		
		if (elements[2] > highest){
			highest = elements[2];
		} 
		
		if (elements[3] > highest){
			highest = elements[3];
		} 
		
		if (elements[4] > highest){
			highest = elements[4];
		}
		return highest;
	}














}