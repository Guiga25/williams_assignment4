package williams_problem02;

public abstract class Application {
	public static void main(String[] args) {	
		//Create new instance of DuplicateCounter called duplicateCounter
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		//Call the count and write methods of DuplicateCounter to do the job
		duplicateCounter.count("problem2.txt");
		duplicateCounter.write("unique_word_counts.txt");
	}
}