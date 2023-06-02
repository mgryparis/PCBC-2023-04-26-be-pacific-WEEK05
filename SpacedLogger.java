package week05;

//The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//If the log method receives “Hello” as an argument, it should print H e l l o
//The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

public class SpacedLogger implements Logger{

	@Override
	public void Log(String logString) {
		System.out.println(spacedOut(logString));
	}

	@Override
	public void Error(String errorString) {
		System.out.println("ERROR: "+spacedOut(errorString));
	}
	
	private String spacedOut(String inStr)	{
		int len = inStr.strip().length();
		StringBuilder sb = new StringBuilder();
		for	(int i=0; i<len; i++)	{
			sb.append(inStr.charAt(i)+" ");
		}
		String outStr = sb.toString().strip();
		return outStr;
	}

}
