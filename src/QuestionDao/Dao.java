package QuestionDao;

import java.util.ArrayList;
import java.util.List;

import QuetionsEntity.Questions;

public class Dao {
	
	public List<Questions> getAllQuestions() {
		
		List<Questions> questions = new ArrayList<Questions>();
		
		questions.add(new Questions(1 , "Number of primitive data types in java?", 6, 7, 8, 9, 8));
		questions.add(new Questions(2 , "What is the size of float in java(in-bits)?", 8, 16, 32, 64, 32));
		questions.add(new Questions(3 , "What is the size of Double in java(in-bits)?", 8, 16, 32, 64, 64));
		questions.add(new Questions(4 , "What is the size of int in java(in-bits)?", 8, 16, 32, 64, 32));
		questions.add(new Questions(5 , "What is the size of Long in java(in-bits)?", 8, 16, 32, 64, 64));
		questions.add(new Questions(6 , "What is the size of Short in java(in-bits)?", 8, 16, 32, 64, 16));
		questions.add(new Questions(7 , "What is the size of Byte in java(in-bits)?", 8, 16, 32, 64, 8));
		questions.add(new Questions(8 , "What is the size of Boolean in java(in-bits)?", 8, 16, 1, 64, 1));
		questions.add(new Questions(9 , "What is the size of char in java(in-bits)?", 8, 16, 32, 64, 16));
		questions.add(new Questions(10 , "when java was invented?", 1966, 1970, 1985, 1995, 1995));
		
		return questions;
	}
}
