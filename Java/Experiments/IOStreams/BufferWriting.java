package IOStreams;

import java.io.*;

public class BufferWriting {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\AAYUSH\\Desktop\\QspidersTraining\\Java\\Experiments\\IOStreams\\text3.txt");
		System.out.println("File Created: " + fw.toString());
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Writing...");
		
		bw.write("Hello, world!");
		bw.newLine();
		bw.write("Java Programming");
		bw.newLine();
		bw.write("InputOutputStream");
		
		bw.close();
		fw.close();

		System.out.println("File Closed!");
	}
}
