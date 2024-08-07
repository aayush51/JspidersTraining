package IOStreams;

import java.io.*;
//import java.util.*;

public class FileInStream {
	
	public static void main(String[] args) {
		
		FileInputStream fin = null ;
		try {
			fin = new FileInputStream("C:\\Users\\AAYUSH\\Desktop\\QspidersTraining\\Java\\Experiments\\IOStreams\\text1.txt");
			System.out.println("File Opened!");
			String op = "";
			int ch = fin.read();
			while(ch>=0) {
				op= op + (char)ch;
				ch=fin.read();
			}
			System.out.println(op);
		}
		catch(NullPointerException npe) {
			System.out.println("Something went wrong!");
		}
		catch(IOException ioe) {
			System.out.println("Issue in reading file!");
			ioe.printStackTrace();
		}
		finally {
			try {
				fin.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
