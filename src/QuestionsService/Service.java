package QuestionsService;

import java.util.ArrayList;
import java.util.List;
import QuestionDao.Dao;
import QuetionsEntity.Questions;
import java.util.Scanner;

public class Service {
	Dao dao;

	public void playQuizService() {
		Scanner sc = new Scanner(System.in);
		dao = new Dao();
		List<Questions> questions = dao.getAllQuestions();
		List<Integer> QuestionAnswerByUser = new ArrayList<Integer>();
		
		
		for (int i = 0; i < questions.size(); i++) {
			System.out.println(questions.get(i).getQuesNo() + ":-" + questions.get(i).getQuestion());
			System.out.println(" A]." + questions.get(i).getOpt1() + "  B]." + questions.get(i).getOpt2());
			System.out.println(" C]." + questions.get(i).getOpt3() + "  D]." + questions.get(i).getOpt4());
			System.out.print("Enter your answer :- ");
			int answer = sc.nextInt();
			QuestionAnswerByUser.add(answer);
			System.out.println();
		}

		System.out.println();

		System.out.println("Do you want to see your score: ");
		String choice = sc.next();
		
		if (choice.equals("yes")) {
			int score = 0;
			for (int i = 0; i < questions.size(); i++) {
				System.out.println(questions.get(i).getQuesNo() + ":-" + questions.get(i).getQuestion());
				System.out.println("A]." + questions.get(i).getOpt1() + "  B]." + questions.get(i).getOpt2());
				System.out.println("C]." + questions.get(i).getOpt3() + "  D]." + questions.get(i).getOpt4());
				if (questions.get(i).getAnswer() == QuestionAnswerByUser.get(i)) {
					System.out.println("Correct answer: " + questions.get(i).getAnswer());
					System.out.println("Your Answer: " + QuestionAnswerByUser.get(i));
					System.out.println();
					score++;
				} else {
					System.out.println("Wrong Answer!");
					System.out.println("Correct answer: " + questions.get(i).getAnswer());
					System.out.println();
				}
			}
			
			System.out.println();
			System.out.println();
			System.out.println("Your have score: " + score);
		} 
		else {
			System.out.println("Ok, well performed!");
			return;
		}
	}

}
