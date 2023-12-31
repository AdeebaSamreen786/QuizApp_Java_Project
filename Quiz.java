import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score ;

    public Quiz(){
        this.questions = new ArrayList<>();
        this.score =0;
    }

    public  void addQuestion(Question question){
        questions.add(question);
    }

    public void startQuiz(){
        Scanner scanner = new Scanner(System.in);

        for (Question question:questions) {
            System.out.println(question.getQuestionText());

            String[]options = question.getOptions();

            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1)+ " . "+options[i]);
            }

            System.out.println("Enter your answer(1-"+options.length+"):");
            int userAnswer = scanner.nextInt();

            if(userAnswer == question.getCorrectOption()){
                System.out.println("Correct ! \n");
                score++;
            }else{
                System.out.println("Incorrect. The correct answer is :"+question.getCorrectOption()+"\n");
            }

        }

        System.out.println("Quiz Completed. Your scorer:"+score+"/"+questions.size());
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        //Add Ques.

        Question question1 = new Question("1)Which among the following best describes the Inheritance?",new String[]{"Copying the code already written","Using the code already written once","Using already defined functions in programming language","Using the data and functions into derived segment"},4);

        Question question2 = new Question("2)How many basic types of inheritance are provided as OOP feature?",new String[]{"4","3","2","1"},1);

        Question question3 = new Question("3)Which among the following best defines single level inheritance?",new String[]{"A class inheriting a derived class","A class inheriting a base class","A class inheriting a nested class","A class which gets inherited by 2 classes"},2);

        Question question4 = new Question("4)Which among the following is correct for multiple inheritance?",new String[]{"class student{public: int marks;}s; class stream{int total;}; class topper:public student, public stream{ };","class student{int marks;}; class stream{ }; class topper: public student{ };","class student{int marks;}; class stream:public student{ };","class student{ }; class stream{ }; class topper{ };"},1);

        Question question5 = new Question("5)Which programming language doesn’t support multiple inheritance?",new String[]{"C++ and Java","C and C++","Java and SmallTalke","Java"},4);

        Question question6 = new Question("6)Which among the following is correct for a hierarchical inheritance?",new String[]{"Two base classes can be used to be derived into one single class","Two or more classes can be derived into one class","One base class can be derived into other two derived classes or more","One base class can be derived into only 2 classes"},3);

       Question question7 = new Question("7)Which is the correct syntax of inheritance?",new String[]{"class derived_classname : base_classname{ /*define class body*/ };","class base_classname : derived_classname{ /*define class body*/ };","class derived_classname : access base_classname{ /*define class body*/ };","class base_classname :access derived_classname{ /*define class body*/ };"},3);

       Question question8 = new Question("8)Which type of inheritance leads to diamond problem?",new String[]{"Single level","Multi-level","Multiple","Hierarchical"},3);

       Question question9 = new Question("9)Which access type data gets derived as private member in derived class?",new String[]{"Private"," Public"," Protected","Protected and Private"},1);

       Question question10 = new Question("10)If a base class is inherited in protected access mode then which among the following is true?",new String[]{"Public and Protected members of base class becomes protected members of derived class"," Only protected members become protected members of derived class","Private, Protected and Public all members of base, become private of derived class"," Only private members of base, become private of derived class"},1);

      Question question11 = new Question("11)Members which are not intended to be inherited are declared as ________________",new String[]{"Public members","Protected members"," Private members","Private or Protected members"},3);

      Question question12 = new Question("12)While inheriting a class, if no access mode is specified, then which among the following is true? (in C++)",new String[]{"It gets inherited publicly by default","It gets inherited protected by default","It gets inherited privately by default","It is not possible"},3);

      Question question13 = new Question("13)If a derived class object is created, which constructor is called first?",new String[]{"Base class constructor","Derived class constructor","Depends on how we call the object","Not possible"},1);

      Question question14 = new Question("14)The private members of the base class are visible in derived class but are not accessible directly.",new String[]{"True"," False"},1);

      Question question15 = new Question("15)How can you make the private members inheritable?",new String[]{"By making their visibility mode as public only","By making their visibility mode as protected only","By making their visibility mode as private in derived class","It can be done both by making the visibility mode public or protected"},4);

      Question question16 = new Question("16)What is encapsulation in Java?",new String[]{"The process of combining data and methods into a single unit","The process of hiding data and methods within a class"," The process of creating multiple instances of a class","The process of reusing code from existing classes"},1);

      Question question17 = new Question("17)How can you restrict access to the attributes of a class in Java?",new String[]{"By declaring them as private","By declaring them as public","By not declaring any access modifier","By declaring them as protected"},1);

      Question question18 = new Question("18)In encapsulation, how can you access the private attributes of a class?",new String[]{"Directly, by referencing the attribute name","By using special keywords","By using public methods provided by the class","By declaring the attributes as static"},3);

      Question question19 = new Question("19)What is the primary role of a setter method?",new String[]{"To retrieve the value of a private attribute","To set or update the value of a private attribute","To delete an attribute","To display the class information"},2);

      Question question20 = new Question("20)What is the main role of a getter method?",new String[]{"To create a new attribute","To retrieve the value of a private attribute","To update an attribute's value"," To remove the attribute's value"},2);

      Question question21 = new Question("21)Which of these is a primary advantage of encapsulation?",new String[]{" Increases code complexity","Enhances performance","Code redundancy","Improved control over data access and modification"},4);

      Question question22 = new Question("22)What does the word 'Polymorphism' mean in Greek?",new String[]{"Many forms","Single form","No form"," Final form"},1);

      Question question23 = new Question("23)Which principle allows different classes to be treated as instances of the same class through inheritance?",new String[]{"Encapsulation","Abstraction"," Inheritance","Polymorphism"},4);

      Question question24 = new Question("24)In Java, what concept allows us to implement runtime polymorphism?",new String[]{"Method overloading","Method overriding","Constructors","Static methods"},2);

      Question question25 = new Question("25)Which of these allows compile-time polymorphism?",new String[]{"Method overloading"," Method overriding"," Both","None of the above"},1);

      Question question26 = new Question("26)Can we override static methods in Java?",new String[]{"Yes","No"," Sometimes"," Only in abstract classes"},2);

      Question question27 = new Question("27)Can we overload main() method in Java?",new String[]{"No, the main() method cannot be overloaded.","Yes, the main() method can be overloaded.","Only the return type of the main() method can be changed for overloading.","Overloading is not a concept applicable to Java methods."},2);

      Question question28 = new Question("28)Who developed the Java programming language?",new String[]{"Microsoft","Oracle"," Sun Microsystems","Google"},3);

      Question question29 = new Question("29)In which year was the first version of Java released?.",new String[]{"1991","1995","1998","2000"},2);

      Question question30 = new Question("30)What was the original name for Java?",new String[]{"C++++"," Oak"," Pine","Maple"},2);

      Question question31 = new Question("31)What does JVM stand for?",new String[]{"Java Version Machine"," Java Virtual Mechanism","Java Verified Module","Java Virtual Machine"},4);

      Question question32 = new Question("32)Which of the following is responsible for converting bytecode into machine code?",new String[]{"JDK","JRE","JVM"," Java Compiler"},3);

      Question question33 = new Question("33)What does JDK include?",new String[]{"Only a compiler"," Only a runtime environment","Both a compiler and a runtime environment"," None of the above"},3);

      Question question34 = new Question("34)Can you run a Java program without JRE?",new String[]{"Yes"," No"},2);

      Question question35 = new Question("35)What is an interface in Java?",new String[]{"A class","A data type","A blueprint for a class","A data structure"},3);

      Question question36 = new Question("36)Which keyword is used to implement an interface?",new String[]{"extends","new","interface","implements"},4);

      Question question37 = new Question("37)Can an interface extend another interface in Java?",new String[]{"No","Yes"},2);

      Question question38 = new Question("38)How many characteristics Object has?",new String[]{"2","3","5","1"},2);

      Question question39 = new Question("39)State characteristic of an object represents",new String[]{"the data of an object","the behaviors or actions of an object","the internal unique identity of an object","All of above"},1);

      Question question40 = new Question("40)What is a class in Java?",new String[]{"static reference","template or blueprint","instance of class","None of above"},2);

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);
        quiz.addQuestion(question4);
        quiz.addQuestion(question5);
        quiz.addQuestion(question6);
        quiz.addQuestion(question7);
        quiz.addQuestion(question8);
        quiz.addQuestion(question9);
        quiz.addQuestion(question10);
        quiz.addQuestion(question11);
        quiz.addQuestion(question12);
        quiz.addQuestion(question13);
        quiz.addQuestion(question14);
        quiz.addQuestion(question15);
        quiz.addQuestion(question16);
        quiz.addQuestion(question17);
        quiz.addQuestion(question18);
        quiz.addQuestion(question19);
        quiz.addQuestion(question20);
        quiz.addQuestion(question21);
        quiz.addQuestion(question22);
        quiz.addQuestion(question23);
        quiz.addQuestion(question24);
        quiz.addQuestion(question25);
        quiz.addQuestion(question26);
        quiz.addQuestion(question27);
        quiz.addQuestion(question28);
        quiz.addQuestion(question29);
        quiz.addQuestion(question30);
        quiz.addQuestion(question31);
        quiz.addQuestion(question32);
        quiz.addQuestion(question33);
        quiz.addQuestion(question34);
        quiz.addQuestion(question35);
        quiz.addQuestion(question36);
        quiz.addQuestion(question37);
        quiz.addQuestion(question38);
        quiz.addQuestion(question39);
        quiz.addQuestion(question40);




        //start the quiz
        quiz.startQuiz();

    }
}
