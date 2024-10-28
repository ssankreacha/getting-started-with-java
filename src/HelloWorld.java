//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, Shay ");
//
//        boolean isAlien = false;
//        // !isAlien is the same as isAlien == false
//        if (!isAlien)  {
//            System.out.println("It is not an alien!");
//            System.out.println("Hello");
//        }
//
//        // = is the assignment operator, == is the equals to operator
//        int topScore = 80;
//        if (topScore >= 100) {
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 81;
//        if ((topScore > secondTopScore) && (topScore < 100)) {
//            System.out.println("Greater than!");
//        }
//
//        if ((topScore > 90) || (secondTopScore <=90)) {
//            System.out.println("Either or both of the conditions are true");
//        }
//
//        int newValue = 50;
//        if (newValue == 50) {
//            System.out.println("This might be an error!");
//        }
//
//        boolean isCar = false;
//        // the !isCar => is not false, the ! (NOT) operator opposes initial assignment
//        if (!isCar) {
//            System.out.println("This is not supposed to happen!");
//        }
//
//        String makeOfCar = "VW";
//        // What are you testing (true/false) ? (if true) false : (if false) true
//        // Ternary Operation
//        boolean isDomestic = makeOfCar == "VW" ? false : true; // Ternary Operator
//        System.out.print(isDomestic);
//        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
//
//    }
//}

public class HelloWorld {
    public static void main(String[] args) {
        int myMaxIntValue = Integer.MAX_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        // System.out.println("myNewValue = " + myMaxIntValue); // This creates concatenation

        byte myMaxByteValue = Byte.MAX_VALUE; byte myMinByteValue = Byte.MIN_VALUE;
        short myMinShortValue = Short.MIN_VALUE; short myMaxShortValue = Short.MAX_VALUE;

        // System.out.println(myMaxByteValue); System.out.println(myMinByteValue);
        // System.out.println(myMinShortValue); System.out.println(myMaxShortValue);

        int myTotalInt = (myMinIntValue / 2);
        // System.out.println(myTotalInt);

        // Java doesn't know whether the variable will fit in a calculation; thus error.
        // (byte) is casting, converting the variable to the data type.
        byte myTotalByte = (byte) (myMinByteValue / 2);
        // System.out.println(myTotalByte);

        // (short) is casting, converting the variable to the data type.
        short myTotalShort = (short) (myMinShortValue / 2);
        // System.out.println(myTotalShort);
        // Using Literal values will result in no errors.

        float myMinFloat = Float.MIN_VALUE; float myMaxFloat = Float.MAX_VALUE;
        double myMinDouble = Double.MIN_VALUE; double myMaxDouble = Double.MAX_VALUE;

        // System.out.println(myMinFloat); System.out.println(myMaxFloat);
        // System.out.println(myMinDouble); System.out.println(myMaxDouble);

        // Casting; Using Suffix
        float myFirstFloat = (float) 4.5, mySecondFloat = 5.5f; // required
        double myFirstDouble = 10.5; // standard & preferred
        // System.out.println(myFirstDouble);
        // System.out.println(myFirstFloat);
        // System.out.println(mySecondFloat);

        float myThirdFloat = (5f / 2f);
        double mySecondDouble = (52 / 2d);
        // System.out.println(myThirdFloat);
        // System.out.println(mySecondDouble);

        char myChar = 'D'; char mySecondChar = '\u0044';
        // System.out.println(mySecondChar);

        boolean myFalseBoolean = false; boolean myTrueBoolean = true;
        String myString = "This is a string";
        // System.out.println(myString);
        // String myStringAgain = "This is another string!";
        // System.out.println(myString + " " +myStringAgain);

        {
            String numberString = "250.55";
            numberString = numberString + "49.5";
            // System.out.println(numberString); // String Concatenation
        }

        String aString = "10"; int aInt = 50;
        // System.out.println(aString + aInt); // Type Coercion

        String myFirstString = "Hello Everyone"; String mySecondString = " I am a coder";
        myFirstString = myFirstString + mySecondString;
        System.out.println(myFirstString);

        int result = 1 + 2; // 3
        int previousResult = result;
        result = result -1;

        // Alternatively, by assigning letters to char variables, we can concatenate using empty string.
        String aLetter = "A";
        String bLetter = "B";
        System.out.println(aLetter + bLetter);

        int newResult = 10;
        int finalResult = 10 % 3;
        System.out.println(finalResult); // 1

        // Increment Vs. Decrement Shorthand
        int theFirstNumber = 10;
        theFirstNumber--; // OR theFirstNumber++; (incrementing), +1 or -1
        System.out.println(theFirstNumber);

    }
}

// Primitive Data Types Challenge: Create variables for byte, short, int and long, and output a total sum.
// public class HelloWorld {
//    public static void main(String[] args) {
//
//        byte myByteNumber = 50;
//        short myShortNumber = 100;
//        int myIntNumber = 500;
//
//        long myLongNumber = 50_000L + (10 * (myByteNumber + myShortNumber + myIntNumber));
//        System.out.println(myLongNumber);
//
//    }
//}

// Floating Point & Double Number Challenge: Convert from Pounds To Kg.
// public class HelloWorld {
//    public static void main(String[] args) {
//        double myPounds = 160;
//        double kiloGram = 0.45359237;
//        double result = myPounds * kiloGram;
//        System.out.println(result);
//    }
//}

// The Char Challenge: Create 3 char variables to store the character for the question-mark symbol.

// public class HelloWorld {
//    public static void main(String[] args) {
//        char mySimpleChar = '?';
//        char myUnicodeChar = '\u003F';
//        char myDecimalChar = 63;
//        System.out.println(mySimpleChar); System.out.println(myUnicodeChar); System.out.println(myDecimalChar);
//    }
//}
//

// Operator Challenge
// public class HelloWorld {
//    public static void main(String[] args) {
//
//        double firstNumber = 20.00;
//        double secondNumber = 80.00;
//        double result = (firstNumber + secondNumber) * 100.00;
//
//        double theRemainder = result % 40.00;
//
//        boolean newValue = theRemainder == 0.00 ? true : false;
//        System.out.println(newValue);
//
//        // if value is not true... if the value is false
//        if (!newValue) {
//            System.out.println("Got Some Remainder!");
//        }
//        else {
//            System.out.println("Nope still true!");
//        }
//    }
//}

//// Compound Assignment Operator Challenge
//public class HelloWorld {
//    public static void main(String[] args) {
//        int result = 10;
//        result += 10;
//        System.out.println(result);
//    }
//}