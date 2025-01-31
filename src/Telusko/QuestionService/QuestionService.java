package Telusko.QuestionService;

import java.util.Scanner;

public class QuestionService {

    Question[] question = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        question[0] = new Question(121, "What1?", "A","B","C","D","A");
        question[1] = new Question(122, "What2?", "A","B","C","D","B");
        question[2] = new Question(123, "What3?", "A","B","C","D","A");
        question[3] = new Question(124, "What4?", "A","B","C","D","D");
        question[4] = new Question(125, "What5?", "A","B","C","D","C");
    }

    public void startQuiz() {
        int i = 0;
       for (Question q: question) {
           System.out.println("Question no: " + q.getQuestionId());
           System.out.println("Question: " + q.getQuestion());
           System.out.println(q.getOp1());
           System.out.println(q.getOp2());
           System.out.println(q.getOp3());
           System.out.println(q.getOp4());
           Scanner sc = new Scanner(System.in);
           System.out.print("Write the Option: ");
           String opt = sc.nextLine();
           selection[i]=opt;
           i++;
       }



    }

    public void checkAnswers() {
        int score=0;
        for (int i = 0; i<selection.length; i++) {
            if(selection[i].equals(question[i].getAnswer())) score++;
        }
        System.out.println("Score: " + score + "/" + "5");
    }
}
