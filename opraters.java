class Opraters {
    public static void main(String[] args) {
        // Declaring variables
        int a = 10;
        int b = 3;

        // Addition (+)
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        // Subtraction (-)
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        // Multiplication (*)
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);

        // Division (/)
        double division = (double) a / b; // Using double for decimal result
        System.out.println("Division: " + a + " / " + b + " = " + division);

        // Modulus (%) - returns remainder
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);

        // Increment (++)
        int x = 5;
        x++; // Post-increment
        System.out.println("After increment: " + x);

        // Decrement (--)
        int y = 5;
        y--; // Post-decrement
        System.out.println("After decrement: " + y);

        // Compound Assignment Operators
        int num = 10;
        num += 5; // Same as: num = num + 5
        System.out.println("After adding 5: " + num);

        num *= 2; // Same as: num = num * 2
        System.out.println("After multiplying by 2: " + num);

        System.out.println("\n----- Relational Operators -----");
        int p = 10;
        int q = 20;

        // Equal to (==)
        System.out.println(p + " == " + q + " is " + (p == q));

        // Not equal to (!=)
        System.out.println(p + " != " + q + " is " + (p != q));

        // Greater than (>)
        System.out.println(p + " > " + q + " is " + (p > q));

        // Less than (<)
        System.out.println(p + " < " + q + " is " + (p < q));

        // Greater than or equal to (>=)
        System.out.println(p + " >= " + q + " is " + (p >= q));

        // Less than or equal to (<=)
        System.out.println(p + " <= " + q + " is " + (p <= q));

        System.out.println("\n----- Logical Operators -----");
        boolean isStudent = true;
        boolean hasID = false;

        // Logical AND (&&)
        System.out.println("AND: " + (isStudent && hasID)); // false

        // Logical OR (||)
        System.out.println("OR: " + (isStudent || hasID)); // true

        // Logical NOT (!)
        System.out.println("NOT isStudent: " + (!isStudent)); // false

        // Complex logical expression
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = age >= 18 && hasLicense;
        System.out.println("Can drive: " + canDrive); // true

        // Short-circuit evaluation example
        boolean result = (p > q) && (p / 0 == 0); // Second part won't execute
        System.out.println("Short-circuit result: " + result);
    }
}