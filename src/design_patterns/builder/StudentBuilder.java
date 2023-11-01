package design_patterns.builder;

public class StudentBuilder {

    /**
     * TODO Steps to create a builder class:
     * 1. create a private constructor without parameters
     * 2. create a public static method called "createInstance" that returns a StudentBuilder instance using constructor defined at step 1
     * 3. declare all instance variables from target class (Student class in our case) and make them private
     * 4. For each instance variable create a public method with same name as the variable.
     *  - INPUT: method has one argument of variable's type. Assign argument value to variable
     *  - OUTPUT: return this instance of builder (StudentBuilder in our case)
     * 5. create a method called "build" that instantiate a new Student and pass as arguments, corresponding variable from StudentBuilder class.

     * Great job! Now you have a builder class. Let put this at work!

     * TODO Go back to Student class and in main method create a new Student using StudentBuilder. Spot the differences from creating Student using new keyword.
     */
}
