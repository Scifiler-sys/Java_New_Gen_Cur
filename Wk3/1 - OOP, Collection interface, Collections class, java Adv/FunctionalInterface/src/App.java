import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import FunctionalInterfaces.SomeClass;

public class App {

    /*
        When Java tried to be JavaScript
        Essentially functional interfaces lets us create one line methods and pass it like a parameter like in JS or functions
        
        Main use case is for readability, it is ugly when you have to create an entire class with only one method that is only used ONCE in your program
    */
    public static void main(String[] args) throws Exception {
        System.out.println("========== Functional Interface ============");
        //Emulates functions which are methods that doesn't have a class
        //I only say emulate because at the behind the scenes... it still uses a class

        SomeClass someObject = new SomeClass();

        //These special one or multi line methods is called lambda expression
        //It gives us the ability to create a method and pass it in as a parameter to be used
        someObject.ConcreteMethod( () -> System.out.println("Hello World I just created a method within the parameter"));

        someObject.ConcreteMethod(() -> {
            System.out.println("We can go even more complex on writing this method if we want to");
            if (true) {
                System.out.println("Let's a go, Mario");
            }
        });

        someObject.ConcreteMethod((s1) -> {System.out.println(s1 + " And more!");});

        List<Integer> someNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            someNumbers.add(new Random().nextInt(10));
        }

        System.out.println(someNumbers);
        someNumbers.forEach(currentValue -> System.out.println(currentValue+10));
    }
}
