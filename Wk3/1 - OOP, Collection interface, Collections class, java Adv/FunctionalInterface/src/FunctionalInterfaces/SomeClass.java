package FunctionalInterfaces;

public class SomeClass {
    

    public void ConcreteMethod(FirstFunctionalInterface FFI)
    {
        FFI.someMethod();
    }

    public void ConcreteMethod(ParameterFunctionalInterface PFI)
    {
        PFI.someMethod("Some hardcoded string this method uses");
    }
}
