import java.util.ArrayList;
import java.util.List;

import AbstractClasses.AnotherConcereteClass;
import AbstractClasses.SomeConcereteClass;
import OOP.Abstraction;
import OOP.Encapsulation;
import OOP.Polymorphism;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========== Encapsulation ============");
        Encapsulation en = new Encapsulation();
        en.setMustBeGreaterThan0(10);
        // en.setMustBeGreaterThan0(-10); // Gives an exception

        System.out.println("=========== Polymorphism ============");
        Polymorphism op = new Polymorphism();
        op.someMethod();
        op.someMethod("Different behavior");
        op.someSuperMethod();

        System.out.println("=========== Abstraction ============");
        List<Abstraction> someList = new ArrayList<>();
        someList.add(new SomeConcereteClass());
        someList.add(new AnotherConcereteClass());
        someList.add(new AnotherConcereteClass());
        someList.add(new SomeConcereteClass());

        //A more advance form of polymorphism when using Abstraction and inheritance together
        //Our method we implemented has different behavior depending on what object it is pointing at 
        for (Abstraction abstraction : someList) {
            abstraction.someAbstractMethod();
        }

        
    }
}
