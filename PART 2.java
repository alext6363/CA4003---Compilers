PARSER_BEGIN(AlParse)

public class AlParse{

public static void main(String [] args){
	AlParse parser;
	try{
		parser = new AlParse(new java.io.FileInputStream(args[0]));
		}
	catch (java.io.FileNotFoundException e)
		{
			System.err.println("File " + args[0] + " not found. Please try a different file name.");
			return;
		}
		
		try{
			System.out.println("Running AlParse parser program...");
			parser.program();
		}
		catch(Exception e){
			System.out.println("\n");
			System.err.println(e.getMessage());
		}		
		
	}
}
PARSER_END(AlParse)