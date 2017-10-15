/**
 * 
 */
package lectures;

//include needed util
import java.util.Scanner;

/**
 * @author Richard
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		Scanner input = new Scanner(System.in);
		String myString = "";
		int length = 0, indexOfArrayToChange = 0, indexOfReferenceArray = 0;
		
		//get input string
		System.out.print("Enter the string you want to reverse: ");
		myString = input.nextLine();
		
		//find length of string
		length = myString.length()-1;
		indexOfReferenceArray = length;
		
		//convert to arrays
		char[] arrayToChange = myString.toCharArray();
		char[] referenceArray = myString.toCharArray();
		
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
