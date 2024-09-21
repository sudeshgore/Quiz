package QuizTest;

import java.util.Scanner;

import QuestionController.Controller;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are you ready to take quiz ? (yes/no)");
		String choice = sc.nextLine();

		if (choice.equals("yes")) {
			Controller cont = new Controller();

			cont.playQuizController();
		} else {
			System.out.println("No problem, Thank you for your time!");

		}

		sc.close();
	}

}
