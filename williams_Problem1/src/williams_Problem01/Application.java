package williams_Problem01;

public abstract class Application {
	public static void main(String[] args) {
		//Create an instance of DuplicateRemover called duplicateRemover
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		//Call the remove and write methods of DuplicateRemover to do the job
		duplicateRemover.remove("problem1.txt");
		duplicateRemover.write("unique_words.txt");
	}
}
