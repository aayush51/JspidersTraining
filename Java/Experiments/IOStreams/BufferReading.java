package IOStreams;

import java.io.*;

public class BufferReading  {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\AAYUSH\\Desktop\\QspidersTraining\\Java\\Experiments\\IOStreams\\text3.txt");
		System.out.println("File Opened!");
		BufferedReader br = new BufferedReader(fr);
		System.out.println("Reading...");
		System.out.println();
		
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		System.out.println();
		br.close();
		System.out.println("File Closed!");
		fr.close();
	}
}
