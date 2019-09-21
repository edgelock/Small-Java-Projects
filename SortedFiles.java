package lol;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortedFiles {

	public static void main(String[] args) {
		BufferedReader reader1 = null;
		BufferedWriter writer1= null;
		   BufferedReader reader2 = null;
		BufferedWriter writer2= null;

		//Create an ArrayList object to hold the lines of input file

		ArrayList<String> lines1 = new ArrayList<String>();
		   ArrayList<String> lines2 = new ArrayList<String>();

		try
		{
		//Creating BufferedReader object to read the input fileA

		reader1 = new BufferedReader(new FileReader("C:\\Users\\Mani Patel\\Desktop\\java\\unsortedFileA.txt"));
		    String currentLine1 = reader1.readLine();

		while (currentLine1 != null)
		{
		lines1.add(currentLine1);

		currentLine1 = reader1.readLine();
		}

		//Sorting the ArrayList

		Collections.sort(lines1);

		//Creating BufferedWriter object to write into output fileA

		writer1 = new BufferedWriter(new FileWriter("C:\\Users\\Mani Patel\\Desktop\\java\\sortedFileA.txt"));
		  
		   for (String line : lines1)
		{
		writer1.write(line);

		writer1.newLine();
		}


		    reader2 = new BufferedReader(new FileReader("C:\\Users\\Mani Patel\\Desktop\\java\\unsortedFileB.txt"));
		  
		   //Reading all the lines of input fileB one by one and adding them into ArrayList

		String currentLine2 = reader2.readLine();

		while (currentLine2 != null)
		{
		lines2.add(currentLine2);

		currentLine2 = reader2.readLine();
		}

		//Sorting the ArrayList

		Collections.sort(lines2);

		//Creating BufferedWriter object to write into output fileB

		  
		writer2 = new BufferedWriter(new FileWriter("C:\\Users\\Mani Patel\\Desktop\\java\\sortedFileB.txt"));
		//Writing sorted lines into output fileB

		for (String line : lines2)
		{
		writer2.write(line);

		writer2.newLine();
		}
		}
		catch (IOException e)
		{
		e.printStackTrace();
		}
		finally
		{
		//Closing the resources

		try
		{
		if (reader1 != null)
		{
		reader1.close();
		}

		if(writer1 != null)
		{
		writer1.close();
		}
		       if (reader2 != null)
		{
		reader2.close();
		}

		if(writer2 != null)
		{
		writer2.close();
		}

		}
		catch (IOException e)
		{
		e.printStackTrace();
		}
		}
		
	}

}
