package com.designpatterns.behavioral.memento.texteditor;

class Client {

	public static void main(String[] args) {
		FileWriterCareTaker careTaker = new FileWriterCareTaker();
		FileWriterOriginator originator = new FileWriterOriginator("sampleFile.txt");
		
		System.out.println("---Creating and Saving 1st set of Data---");
		originator.write("First Set of Data \nDeepan\nString\nDesign Pattern\n\n");
		
		// Save the first set of date
		careTaker.save(originator);
		
		//Print the first set of data
		System.out.println(originator);
		
		System.out.println("\n\n---Writing 2nd set of data---");
		// Contine to write on the writer
		originator.write("Second Set of Data \nAdditional Data");
		
		//Print both first & second set of data
		System.out.println(originator);
		
		System.out.println("\n\n---Undo 2nd set of data and printing only 1st set of Data---");
		// Undo Operation
		careTaker.undo(originator);
		
		//Print after undo
		System.out.println(originator);

	}
}
