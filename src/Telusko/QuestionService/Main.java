package Telusko.QuestionService;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.startQuiz();
        questionService.checkAnswers();
    }
}
