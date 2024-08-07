package IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutStream {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C:\\Users\\AAYUSH\\Desktop\\QspidersTraining\\Java\\Experiments\\IOStreams\\text1.txt");
			System.out.println("File Created!");
			System.out.println("Enter Data To Add :");
			String inp = sc.nextLine();
			for(int i=0;i<inp.length();i++) {
				fout.write(inp.charAt(i));
			}
			
		}
		catch(NullPointerException npe) {
			System.out.println("Issue Occurred!");
			npe.printStackTrace();
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("Issue in Creating File!");
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			System.out.println("Wrong Output Stream!");
			ioe.printStackTrace();
		}
		finally {
			try {
				fout.close();	
				System.out.println("File Closed!");
			}
			catch(IOException ioe) {
				System.out.println("Issue in Closing File!");
			}
		}
		
		sc.close();
		
	}
	
}
