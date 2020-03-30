package williams_Problem01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {
	//Create an empty list of unique words using an ArrayList.
	List<String> uniqueWords = new ArrayList<>();
	
	public void remove(String dataFile){
		//Try-Catch method for the IOException instead of throw
		try {
			//Use BufferedReader and FileReader from the java.io library to read words from the input dataFile
			BufferedReader read = new BufferedReader(new FileReader(dataFile));
			String newLine = read.readLine();
			
			//While there is a new line: do things
			while (newLine != null) {
				//Splits words stored in 'temp' by recognizing a space between words
				String[] words = newLine.split(" ");
				for (String word : words) {
					//If the list of unique words doesn't contain the new word, then add it to the list.
					if(!uniqueWords.contains(word)) {
						uniqueWords.add(word);
					}
				}
				//Read the new line to continue the loop, if next line is empty end loop
				newLine = read.readLine();
			}
			read.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(String outputFile) {
		//Try-Catch method for the IO exception instead of throw
		try {
			//Use the PrintWriter and FileWriter from the java.io library to write unique words to the outputFile
			PrintWriter write = new PrintWriter(new FileWriter(outputFile));
			//Iterate through the ArrayList and print out all words.
			for(String words : uniqueWords) {
				write.println(words);
			}
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
