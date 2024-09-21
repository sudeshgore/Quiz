package QuestionController;

import QuestionsService.Service;

public class Controller {
	Service service;

	public void playQuizController() {
		service = new Service();
		service.playQuizService();
	}
}
