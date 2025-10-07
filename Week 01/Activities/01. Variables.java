public class Main {
    public static void main(String[] args){
        // Variable: is a named memory location used to store data during program execution
        // Java has two main categories of data types: Primitive & Reference
        // Primitive Data Types: that hold a single value directly to the memory
        // Reference Data Types: that a reference (or memory address) to an object in memory
        /*
        Primitive:                          Reference:
        ----------                          ----------
        - int(32bits): (e.g: 1,2,3)         - string:
        - double(64bits): (e.g: 1.5,2.1)    - array:
        - char(16bits): (e.g: 'c','h')      - object:
        - boolean: (e.g: true, false)
         */
        /*
        Two steps to creating a variable:
        ---------------------------------
        - Declaration
        - Initializing
         */

        // Integer
        // Declaration:
        int age;
        // Initializing:
        age = 20;
        // Declaration & Initializing (In one step):
        int year = 2025;
        int quantity = 1;

        // Double
        double price = 19.99;
        double gpa = 3.22;
        double temperature = 35.5;

        // Char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        // Boolean
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        // Strings
        String firstName = "Hazem";
        String food = "pizza";
        String email = "Hazemsaid001@outlook.com";
        String car = "Focus";
        String color = "Black";


        // SOUT of integers
        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println("I want "+quantity+" peperoni pizza");

        // SOUT of double
        System.out.println(price+" egp");
        System.out.println("Your GPA is: "+gpa);
        System.out.println("The weather now in cairo is: "+temperature);

        // SOUT char
        System.out.println("Your English grade is: "+grade);
        System.out.println("Hello"+symbol);
        System.out.println("The American currency is: "+currency);

        // SOUT boolean
        System.out.println("Are you student?: "+isStudent);
        System.out.println("Is this item in sale?: "+forSale);
        System.out.println("Are you online: "+isOnline);
        // Boolean using condition (if-condition)
        if (isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are NOT a student!");
        }

        //SOUT Strings
        System.out.println("Your first name is: "+firstName);
        System.out.println("Your favorite food is: "+food);
        System.out.println("Your email is: "+email);
        System.out.println("Your car model is "+car+" & the color is "+color);
        // Simple exercise
        System.out.println("Hello "+firstName);
        System.out.println("You are "+age+" years old");
        System.out.println("Your gpa is: "+gpa);
        System.out.println("Your average letter grade is: "+grade);
    }
}
