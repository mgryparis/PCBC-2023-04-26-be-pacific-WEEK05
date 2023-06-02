package week05;

//Create an interface named Logger.
//Add two void methods to the Logger interface, each should take a String as an argument:  Log & Error
//Create two classes that implement the Logger interface:  AsteriskLogger & SpacedLogger

public interface Logger {
	public void Log(String logString);
	public void Error(String errorString);
}
