package lol;
import java.io.*;
public class MergedFile {

	public static void main(String[] args) {
		
		public class MergedFile
		{
		public static void main(String[] args) throws IOException
		{
		// PrintWriter object for mergedfile.txt
		PrintWriter pw = new PrintWriter("C:\\Users\\Mani Patel\\Desktop\\java\\mergedFile.txt");
		  
		// BufferedReader object for file1.txt
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Mani Patel\\Desktop\\java\\sortedFileA.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Mani Patel\\Desktop\\java\\sortedFileB.txt"));
		  
		  
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		  
		// loop to copy lines of
		// file1.txt and file2.txt
		// to mergedfile.txt alternatively
		while (line1 != null || line2 !=null)
		{
		if(line1 != null)
		{
		pw.println(line1);
		line1 = br1.readLine();
		}
		if(line2 != null)
		{
		pw.println(line2);
		line2 = br2.readLine();
		}
		}
		  
		pw.flush();
		  
		// closing resources
		br1.close();
		br2.close();
		pw.close();

	}

}

	}
	}