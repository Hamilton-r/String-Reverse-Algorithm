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
	 * This method will read a String from standard input 
         * and print the character-reversed string to standard output.  
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		Scanner input = new Scanner(System.in);
		
		//get input string
		System.out.print("Enter the string you want to reverse: ");
		String inputString = input.nextLine();
		
		//set 'indexEnd' equal to string.length-1 for use later in loop
		int indexEnd = inputString.length()-1;
		
		//convert to array
		char[] array = inputString.toCharArray();
		
		int indexStart = 0;
		//loop through and reverse order until two vars meet in middle of array
		while (indexStart < indexEnd) {
			//swap array elements
			char temp = array[indexStart];
			array[indexStart] = array[indexEnd];
			array[indexEnd] = temp;
			//increment/decrement to move through array
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
