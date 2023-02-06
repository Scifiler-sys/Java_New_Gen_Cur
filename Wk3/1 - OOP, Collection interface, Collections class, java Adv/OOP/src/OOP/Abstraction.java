package OOP;

/*
    The process of hiding the implementation details and only showing the functionality to the user
    For us, we utilize interfaces or abstract classes

    There are useful case to just let the developer know the functionality of the method without showing the actual code itself
    But in a more real sense, abstraction is great with polymorphism and forcing other developers to follow a certain structure
*/
public interface Abstraction {

    //Abstract method doesn't need implementation details
    public void someAbstractMethod();
}
