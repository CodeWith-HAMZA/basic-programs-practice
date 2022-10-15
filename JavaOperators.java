class JavaOperators {
    public static void main(String[] args) {

        // Arithemetic-Operators
        int a = 12, b = 5;

        // addition operator
        System.out.println("\na + b = " + (a + b));

        // subtraction operator
        System.out.println("\na - b = " + (a - b));

        // multiplication operator
        System.out.println("\na * b = " + (a * b));

        // division operator
        System.out.println("\na / b = " + (a / b));

        // modulo operator
        System.out.println("\na % b = " + (a % b));

        // [Variants-In-Assignmen-Operatort]
        int c = 4;
        int d;

        d = c; // assigning value using
        System.out.println("\nd using =: " + d);

        d += c;
        System.out.println("\nd using +=: " + d);

        d *= c;
        System.out.println("\nd using *=: " + d);

        d /= c;
        System.out.println("\nd using /=: " + d);

        d %= c;
        System.out.println("\nd using /=: " + d);

        int n = 7, n2 = 11;

        // [Relational] -Operators
        System.out.println("n is " + n + " and n2 is " + n2);

        // == operator
        System.out.println(n == n2);

        // != operator
        System.out.println(n != n2);

        // > operator
        System.out.println(n > n2);

        // < operator
        System.out.println(n < n2);

        // >= operator
        System.out.println(n >= n2);

        // <= operator
        System.out.println(n <= n2);

        // [Logical] -Operators
        // && operator
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 > 3) && (8 < 5));

        // || operator
        System.out.println((5 < 3) || (8 > 5));
        System.out.println((2 > 3) || (3 < 5));
        System.out.println((5 < 3) || (8 < 5));

        // ! operator
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));

        // [Increament-Decreament] -Operators
        int increment = 12, decreament = 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + increment);

        // increment operator
        result1 = ++increment;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + decreament);

        // decrement operator
        result2 = --decreament;
        System.out.println("After decrement: " + result2);

        // [instanceof] - Operator
        String str = "Programiz";
        boolean result;

        // checks if str is an instance of
        // the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);

        // [Ternary]-Opt
        int februaryDays = 29;
        String Result;

        // ternary operator
        Result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(Result);
    }

}