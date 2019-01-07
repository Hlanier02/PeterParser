/**
 * 
 */
package mainpackage;
import java.io.*;
import java.util.*;

/**
 * @author Henry L. and Keith T.
 *
 */
public class Core 
{// beginning of class

	/**
	 * @param args
	 */
	//Reading file method
	

	output = new ArrayList<String>();

	 FileReader something;//This will create the variable used by  method
		
	 try {
		   something = new FileReader("something.txt");  // create the stream
		}
	catch (FileNotFoundException e1) 
	{
	   System.out.println("File not Found"); // do something to handle the error -- maybe, end the program
	}

Scanner input; //Since the FileReader method can only accept certain characters this is needed to handle the primatives in an efficient manner
	try {
		
			input = new Scanner("something.txt");
		
		}
	catch (FileNotFoundException e2) {
		   System.out.println("File not Found"); // do something to handle the error -- maybe, end the program
		}
	

		
}//end of class
