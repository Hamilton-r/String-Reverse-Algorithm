package algorithms;

//include needed util
import java.util.Scanner;

/**
 * This class will reverse an inputed string
 * @author Richard
 *
 */
public class ReverseString {

	/**
	 * This method will take in a string, convert that to a 
	 * char array, then swap the contents of the array from back to front
	 * meeting in the middle.
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		Scanner input = new Scanner(System.in);
		String inputString = "";
		int length = 0, indexStart = 0, indexEnd = 0;
		
		//get input string
		System.out.print("Enter the string you want to reverse: ");
		inputString = input.nextLine();
		
		//find length of string, it needs to be reduced by one to prevent an error
		//as index start at 0.
		length = inputString.length()-1;
		//set 'indexOfReferenceArray' equal to string.length-1 for use later in loop
		indexEnd = length;
		
		//convert to arrays
		char[] array = inputString.toCharArray();
		
		//loop through and reverse order until two vars meet in middle of array
		while (indexStart<=(length/2)) {
			//swap array elements
			char temp = array[indexStart];
			array[indexStart] = array[indexEnd];
			array[indexEnd] = temp;
			//increment/decrement to move through arrays
			indexStart++;
			indexEnd--;
		}

		//convert back to string
		String newString = new String(array);
		
		//output result
		System.out.println(newString);
		
		//close resources
		input.close();
		
	}

}
