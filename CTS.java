1. Hello World Program
java
Copy
Edit
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
2. Simple Calculator
java
Copy
Edit
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result;
        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operator"); return;
        }
        System.out.println("Result: " + result);
    }
}
3. Even or Odd Checker
java
Copy
Edit
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
4. Leap Year Checker
java
Copy
Edit
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap ? "Leap year" : "Not a leap year");
    }
}
5. Multiplication Table
java
Copy
Edit
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
6. Data Type Demonstration
java
Copy
Edit
public class DataTypes {
    public static void main(String[] args) {
        int i = 10;
        float f = 5.5f;
        double d = 20.99;
        char c = 'A';
        boolean b = true;

        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + b);
    }
}
7. Type Casting Example
java
Copy
Edit
public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("Double to int: " + i);

        int x = 10;
        double y = x;
        System.out.println("Int to double: " + y);
    }
}
8. Operator Precedence
java
Copy
Edit
public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result: " + result); // 5*2 = 10, then 10+10 = 20
    }
}
9. Grade Calculator
java
Copy
Edit
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        if (marks >= 90) System.out.println("Grade: A");
        else if (marks >= 80) System.out.println("Grade: B");
        else if (marks >= 70) System.out.println("Grade: C");
        else if (marks >= 60) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }
}
10. Number Guessing Game
java
Copy
Edit
import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            if (guess < number) System.out.println("Too low!");
            else if (guess > number) System.out.println("Too high!");
        } while (guess != number);
        System.out.println("Correct!");
    }
}
Let me continue with the next 31 programs (11 to 41) in the next message to keep it clear and organized.







You said:
yes


ChatGPT said:
Here are the Java answers for exercises 11 to 41, continuing from the previous 1–10:

11. Factorial using Loop
java
Copy
Edit
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
12. Fibonacci Series
java
Copy
Edit
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
13. Palindrome Number
java
Copy
Edit
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt(), rev = 0, orig = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(orig == rev ? "Palindrome" : "Not Palindrome");
    }
}
14. Armstrong Number
java
Copy
Edit
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3-digit number: ");
        int num = sc.nextInt(), sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        System.out.println(num == sum ? "Armstrong" : "Not Armstrong");
    }
}
15. Reverse a String
java
Copy
Edit
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + rev);
    }
}
16. Count Vowels and Consonants
java
Copy
Edit
import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();
        int v = 0, c = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
17. String Comparison
java
Copy
Edit
public class CompareStrings {
    public static void main(String[] args) {
        String a = "hello", b = "hello";
        String c = new String("hello");
        System.out.println("a == b: " + (a == b));       // true (same pool)
        System.out.println("a == c: " + (a == c));       // false (different objects)
        System.out.println("a.equals(c): " + a.equals(c)); // true
    }
}
18. Array Traversal
java
Copy
Edit
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
19. Matrix Addition
java
Copy
Edit
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                c[i][j] = a[i][j] + b[i][j];
        for (int[] row : c) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
20. Sorting an Array
java
Copy
Edit
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        Arrays.sort(arr);
        for (int i : arr) System.out.print(i + " ");
    }
}
21. Find Largest Element
java
Copy
Edit
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 7};
        int max = arr[0];
        for (int i : arr)
            if (i > max) max = i;
        System.out.println("Largest: " + max);
    }
}
22. Create and Use Class
java
Copy
Edit
class Car {
    String model;
    Car(String model) { this.model = model; }
    void display() { System.out.println("Car model: " + model); }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car("Honda");
        c.display();
    }
}
23. Method Overloading
java
Copy
Edit
public class Overloading {
    void print(int a) { System.out.println("int: " + a); }
    void print(String a) { System.out.println("String: " + a); }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.print(10);
        obj.print("Hello");
    }
}
24. Constructor Overloading
java
Copy
Edit
class Student {
    String name;
    int age;

    Student() {
        name = "Default";
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John", 20);
        s1.display();
        s2.display();
    }
}
25. Inheritance Example
java
Copy
Edit
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
26. Interface Example
java
Copy
Edit
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() { System.out.println("Drawing Circle"); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
27. Abstract Class Example
java
Copy
Edit
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing Rectangle"); }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
    }
}
28. Exception Handling
java
Copy
Edit
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
    }
}
29. Custom Exception
java
Copy
Edit
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("This is custom");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
30. Try with Resources (File Read)
java
Copy
Edit
import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
(Next message: programs 31–41 including collections, lambda, streams, JDBC, and advanced Java topics.)







You said:
yes


ChatGPT said:
Here are the Java programs 31 to 41, covering Collections, Lambda, Streams, File Handling, JDBC, and Advanced Java topics:

31. ArrayList Example
java
Copy
Edit
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
32. HashMap Example
java
Copy
Edit
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 90);
        map.put("Science", 85);
        map.put("English", 88);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
33. HashSet Example
java
Copy
Edit
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red"); // duplicate ignored

        for (String color : set) {
            System.out.println(color);
        }
    }
}
34. Lambda Expression
java
Copy
Edit
interface Sayable {
    void say(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        Sayable s = (msg) -> System.out.println("Message: " + msg);
        s.say("Hello Lambda");
    }
}
35. Stream API Example
java
Copy
Edit
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(System.out::println);
    }
}
36. Read/Write File using FileReader and FileWriter
java
Copy
Edit
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Java File Handling Example");
            fw.close();

            FileReader fr = new FileReader("test.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
37. JDBC Connection (MySQL)
java
Copy
Edit
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
38. Reflection Example
java
Copy
Edit
import java.lang.reflect.*;

class Person {
    private String name = "John";
    public void greet() {
        System.out.println("Hello, " + name);
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class<?> cls = p.getClass();

        Method m = cls.getDeclaredMethod("greet");
        m.invoke(p);

        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p, "Alice");

        m.invoke(p); // now prints: Hello, Alice
    }
}
39. Thread Creation
java
Copy
Edit
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
40. ExecutorService Thread Pool
java
Copy
Edit
import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = () -> System.out.println("Task executed by " + Thread.currentThread().getName());
        executor.execute(task);
        executor.shutdown();
    }
}
41. Virtual Threads (Java 21+)
java
Copy
Edit
public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread: " + Thread.currentThread());
        });
        Thread.sleep(100); // wait for thread
    }
}