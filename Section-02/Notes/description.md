# What is Varibales?

A variable is a memory location which store some data.

<pre>
    int age = 21;
</pre>

Here,

- int : Data-type (Integer)
- age : Variable Name
- 21 : Value of the Variable

# What is Data-type?

Data type means what type of data we have.
Ex :- Byte, short, int, long, char, float, double, boolean

# Type's of Data-type?

Data-types are divided into two major parts. These are,

- Primitive Data-type :- Primitive data type consists of the numbers and the characters which are built in Program. It can be Manipulated or operated directly by the machine level Instructions.

- Non-Primitive Data-type :- Non-Primitive data types are those that are derived from primitive data-types. It cannot be manipulated directly by machine level instruction. These data types focus on formation of a set of data elements that is either "Homogeneous" or "Hetrogeneous".

# How we Input values from the user?

Step-1 :: import a library which is given below

<pre>
    import java.util.Scanner;
</pre>

Step-2 :: Create a Scanner Varibale, like this :-

<pre>
    Scanner input = new Scanner(System.in);
</pre>

Step-3 :: Extract different inputs from input variable. It's name can be changed.

<pre>
    int age = input.nextInt();      //Extract Integer value
    String name = input.next() Or input.nextline();      //Extract String value
    float value = input.nextFloat();            //Extract floating values
    double area = input.nextDouble();           //Extract Double values
</pre>

// Note :: Scanner library can be used to read both primitive data types and Strings.

# Resources leak Error?

The warning "Resource leak: 'input' is never closed" is likely because you haven't closed the Scanner resource after using it. It's a good practice to close resources like Scanner to avoid potential resource leaks.

<pre>
    input.close();
</pre>
