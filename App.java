package week05;
public class App	{

//		Create an interface named Logger.

//		Add two void methods to the Logger interface, each should take a String as an argument:  Log & Error
//		Create two classes that implement the Logger interface:  AsteriskLogger & SpacedLogger

//		The log method on the AsteriskLogger should print out the String it receives between 3 asterisks
//		on either side of the String (e.g. if the String passed in is “Hello”, then it should print
//		***Hello*** to the console).

//		The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
//		with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following
//		should be printed:
//		****************
//		***Error: Hello***
//		****************

//		The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//		If the log method received “Hello” as an argument, it should print H e l l o

//		The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

//		Create a class named App that has a main method.
//		In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//		Test both methods on both instances, passing in Strings of your choice.

	public static void main(String[] args) {
		Logger SL = new SpacedLogger();
		SL.Log("Milk was purchased");
		SL.Error("Purchased Milk was spoiled when opened");
		
		Logger AL = new AsteriskLogger();
		AL.Log("Eggs were broken to make an omelet");
		AL.Error("Eggs were broken when the carton was dropped on the floor");

	}
	
	
	
	
	
	
	
	
	
	
}