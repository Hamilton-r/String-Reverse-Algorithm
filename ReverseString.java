package algorithms;

//include needed util
import java.util.Scanner;

/**
 * This class will reverse a string
 * @author Richard
 *
 */
public class ReverseString {

	/**
	 * This method will take in a string, convert that to two 
	 * char arrays, then swap the contents of one for the contents
	 * of the other except moving in opposite directions and so
	 * will reverse the order of the output string  
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		Scanner input = new Scanner(System.in);
		String inputString = "";
		int length = 0, indexOfArrayToChange = 0, indexOfReferenceArray = 0;
		
		//get input string
		System.out.print("Enter the string you want to reverse: ");
		inputString = input.nextLine();
		
		//find length of string, it needs to be reduced by one to prevent an error
		//as index start at 0.
		length = inputString.length()-1;
		//set 'indexOfReferenceArray' equal to string.length-1 for use later in loop
		indexOfReferenceArray = length;
		
		//convert to arrays
		char[] arrayToChange = inputString.toCharArray();
		char[] referenceArray = inputString.toCharArray();
		
		//loop through and reverse order as long as we are still within bounds of original string length
		while (indexOfArrayToChange<=length) {
			//change the first letter of one array to be the same as the last letter of reference array
			arrayToChange[indexOfArrayToChange] = referenceArray[indexOfReferenceArray];
			//increment/decrement to move through arrays
			indexOfArrayToChange++;
			indexOfReferenceArray--;
		}

		//convert back to string
		String newString = new String(arrayToChange);
		
		//output result
		System.out.println(newString);
		
		//close resources
		input.close();
		
	}

}
