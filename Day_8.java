import java.util.Scanner;
import java.util.ArrayList;

public class Day_8 {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();
        ArrayList<Integer> correct = new ArrayList<>();

        //Adding questions, answers and correct options
        questions.add("What is the difference between ArrayList and LinkedList in Java?");
        questions.add("Which is a valid way to declare a list in Java?");
        questions.add("What will the following code print?\n" +
                "Integer a = 128;\n" +
                "Integer b = 128;\n" +
                "System.out.println(a == b);");
        questions.add("Which of the following is true about final in Java?");
        questions.add("Which collection does not allow duplicate elements?");
        questions.add("What is autoboxing in Java?");
        questions.add("Which method removes all elements from a List?");
        questions.add("What is the difference between == and .equals() in Java?");
        questions.add("Which statement about Java primitive types and wrapper classes is correct?");
        answers.add("1. ArrayList allows duplicates, LinkedList does not\n" +
                "2. ArrayList is synchronized, LinkedList is not\n" +
                "3. ArrayList is faster for random access; LinkedList is faster for insert/delete in the middle\n" +
                "4. ArrayList can store primitives directly; LinkedList cannot");
        answers.add("1. ArrayList<int> list = new ArrayList<>();\n" +
                "2. List<String> list = new ArrayList<>();\n" +
                "3. List<int> list = new List<>();\n" +
                "4. List list = int[];");
        answers.add("1. true\n2. false\n3. 128\n4. Compilation error");
        answers.add("1. A final class can be extended\n" +
                "2. A final variable can be reassigned\n" +
                "3. A final method cannot be overridden\n" +
                "4. A final method can only be private");
        answers.add("1. ArrayList\n2. LinkedList\n3. HashSet\n4. Vector");
        answers.add("1. Converting a primitive type to a String\n" +
                "2. Converting an object to a primitive\n" +
                "3. Converting a primitive type to its wrapper class\n" +
                "4. Converting an int to double automatically");
        answers.add("1. delete()\n2. clear()\n3. removeAllElements()\n4. truncate()");
        answers.add("1. == compares object contents; .equals() compares memory address\n" +
                "2. == compares memory address; .equals() compares object contents\n" +
                "3. They are identical\n" +
                "4. == works only on Strings");
        answers.add("1. int can be stored in an ArrayList directly\n" +
                "2. Integer can be null and used in collections\n" +
                "3. boolean and Boolean are completely identical\n" +
                "4. Double cannot be used in ArrayList");
        correct.add(3);
        correct.add(2);
        correct.add(2);
        correct.add(3);
        correct.add(3);
        correct.add(3);
        correct.add(2);
        correct.add(2);
        correct.add(2);
        char answer;
        System.out.println("\nWelcome to a quiz game!");
        System.out.println("You will be presented with 9 different questions and 4 possible answers for each with only one of them correct.");
        System.out.println("At teh end of the game you will be revealed your total score.");
        System.out.println("Lets begin your first round!\n");
        do{
            play(questions, answers, correct);
            System.out.println("Do you want to play again? (y/n)");
            answer = scanner.next().charAt(0);
            System.out.println("\n");
        }while(answer == 'y');

    }
    static void play(ArrayList<String> questions, ArrayList<String> answers, ArrayList<Integer> correct){
        int score = 0;
        int reply;
        for(int i = 0; i<9; i++){
            System.out.println(questions.get(i));
            System.out.println(answers.get(i));
            reply = scanner.nextInt();
            if (reply == correct.get(i)) score += 1;
        }
        System.out.println("Your total score is " + score + "!");
    }
}
