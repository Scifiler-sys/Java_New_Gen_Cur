package OOP;

/*
    * Encapsulation is the process of wrapping and code together into a single unit
    * For us, that means validation of what data should be stored within this object should be handled within the class and nowhere else
        * Main reason is what if you need to change the validation requirement? It would be as easy as opening the class and changing your set/get methods
    * Another main use case of Encapsulation is data control
    * Ensuring data is pristine and expected
*/

public class Encapsulation {

    //What's important is to indicate your fields to be private
    //Because we cannot implement any logical data control with fields, as long as it fits the datatype you can put in anything
    private int mustBeGreaterThan0;

    //Setter methods
    public void setMustBeGreaterThan0(int mustBeGreaterThan0)
    {
        //Where we can implement actual validation and should only exist here
        //Main common mistakes is mistaking the validation in Service layer
        //Simple rule is this validation should just check that what is being inputted is correct, nothing else
        if (mustBeGreaterThan0 > 0) {
            this.mustBeGreaterThan0 = mustBeGreaterThan0;
        }
        else
        {
            //It is great to throw exceptions here
            //Why? Think of the audience, only developers should hit this validation problem
            //Our service layer are the one who is responsible for handling normal user ... unique... answers
            //Make your msg make sense to the prespective of a developer by using technical terminology
            throw new RuntimeException("Cannot set mustBeGreaterThan0 field lower than 1");
        }
    }

}
