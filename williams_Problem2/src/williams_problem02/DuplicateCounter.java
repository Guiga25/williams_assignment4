package williams_problem02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
	//Declaring a new HashMap to store the word and its count.
	Map<String, Integer> counter = new HashMap<String, Integer>();
	
	public void count(String dataFile) {
		//Try-Catch method for the IOException and FileNotFoundException instead of throw
		try {
			//Use BufferedReader and FileReader from the java.io library to read words from the input dataFile
			BufferedReader read = new BufferedReader(new FileReader(dataFile));
			String newLine = read.readLine();
			//While there is a new line: do things
			while(newLine != null) {
				//Splits words stored in 'words' by recognizing a space between words.
				String words[] = newLine.split(" ");
				for(String word: words) {
					//If the map does not contain the word/key, start a new one with a count of 1.
					if(!counter.containsKey(word)) {
						counter.put(word, 1);
					}
					//Otherwise, increase the counter of the existing word/key by 1.
					else {
						int count = counter.get(word);
						counter.put(word,  count + 1);
					}
				}
				//Read new line to continue loop, if next line is empty end loop
				newLine = read.readLine();
			}
			read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void write(String outputFile) {
		//Try-Catch method for the FileNotFoundException instead of throw
		try {
			//Use the PrintWriter and FileWriter from the java.io library to write unique words and counts to the outputFile
			PrintWriter write = new PrintWriter(outputFile);
			//Iterate through the HashMap and print out all entries
			for (Map.Entry<String, Integer> entry: counter.entrySet()) {
				write.println(entry.getKey() + ": " + entry.getValue());
			}
			write.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
