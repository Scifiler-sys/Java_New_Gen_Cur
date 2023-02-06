package OOP;

/*
    * Polymorphism is the ability to take on many forms
    * For us, this means that a similar syntax suddenly have more than 1 functionality
*/

public class Polymorphism extends SuperClass{

    //Method overloading
    //When two methods within the same class has the same method signature except for its parameters
    public void someMethod()
    {
        System.out.println("Some implementation");
    }

    public void someMethod(String someString)
    {
        System.out.println("Implementation changed");
        System.out.println(someString);
    }

    //Method overriding
    //When one method in the child class has the same method signature as its parent class
    @Override //Not required but your compiler will help you out if you are actually doing method overriding
    public void someSuperMethod()
    {
        //It is generally good idea that we use method overriding to add on extra functionality to an existing feature rather than replacing the entire thing
        super.someSuperMethod(); //Good practice
        System.out.println("Child implementation");
    }

    //Fun fact, it is possible to also have different return type for a overriden method
    //However, it is not just simple as change the return type
}
