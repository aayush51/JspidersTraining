package IOStreams;

import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\AAYUSH\\Desktop\\QspidersTraining\\Java\\Experiments\\IOStreams\\text2.txt");
			System.out.println("File Opened!");
			int ch = fr.read();
			while (ch>=0) {
				System.out.print(""+(char)ch);
				ch = fr.read();
			}
		}
		catch (IOException e) {
			System.out.println("Error in reading!");
		}
		finally {
			try {
				fr.close();
			}
			catch (IOException e) {
				System.out.println("Error in closing!");
			}
		}
		
		
	}
}
