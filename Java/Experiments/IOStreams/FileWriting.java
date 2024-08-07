package IOStreams;

import java.io.*;

public class FileWriting {
	
	public static void main(String[] args) {
		
		FileWriter fw = null ;
		try {
			fw = new FileWriter("C:\\Users\\AAYUSH\\Desktop\\QspidersTraining\\Java\\Experiments\\IOStreams\\text2.txt");
			System.out.println("File Created!");
			fw.write("How are you");
			System.out.println("Data Added!");
		}
		catch(IOException ioe) {
			System.out.println("Something went wrong!");
		}
		finally {
			try 
			{
				fw.close();
			}
			catch(IOException ioe) {
				System.out.println("Issue in closing file!");
			}
		}
	}
}
