package FunctionalInterfaces;

/*
    It is when an interface only has one abstract method
    Also known as Single Abstract Method Interface (SAM interface)
*/
@FunctionalInterface //Only for your compiler to help you out as a coder and also enforce the constraints
public interface FirstFunctionalInterface {
    public void someMethod();
}
