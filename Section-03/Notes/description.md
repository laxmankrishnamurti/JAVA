# Key-Points ::

- In Java, (&&) and (||) operators perform short-curcuit evalution. It means if left condition dosen't full fill then both operators move on right condition. But, (&&) only perform when all conditions are true.

- (a >> 2) means, shift of binary digits of "a" to the right by 2-positions.
- (a << 2) means, shift of binary digits of "a" to the left by 2-positions.

# Structure of Loops.

- Initialization
- Condition
- Updation

# What is Function?

Functions is a block of code that perform a specific task. It can be used by multiple times, means it enhance code Reusability.

- It helps to organize codes.
- Principle :: DRY(Don't Repeat Yourself)
- We know that Java is a Object Oriented Programming language so that's why we call function as a "method".
- We can't write methods outside the class.
- Remember :: Execution of code starts from "main-function". The JVM only invoke main-function except that JVM ignore all the methods that we had defined. If in main-function any other method is in used then only that condition JVM invoke the method.

- Important :: Don't make methods too longer than 20-25 line of codes. And try to break your task into multiple methods so that Code Redability should be maintained and our code persist in organized way.

# Syntax of Methods?

<pre>
    public/private int addTwoNum (int num1, int num2) {
        int sum; 
        sum = num1 + num2;
        return sum;
    }
    addTwoNum(10, 20);
</pre>

Note :: We can't return multiple values from a method.

# Parameters and Arguments?

Parameter :: Parameters are the variable that we define while creating methods and we want some inputs for propar function of the method.

Arguments :: Arguments the value that methods takes.

Ex : let we take above example of Syntax of methods.

Here,
num1 & num2 :: Parameters and int is the type of the parameter that we are going to take.
10 & 20 :: Arguments
