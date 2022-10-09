import java.util.*;

class ArithematicOpt {
    public static void main(String[] arg) {
        Scanner inputFromConsole = new Scanner(System.in);
        float firstNumber, secondNumber;
        System.out.println("Enter first Number>");
        firstNumber = inputFromConsole.nextFloat();
        System.out.println("Enter Second Number> ");
        secondNumber = inputFromConsole.nextFloat();

        System.out.println("firstNumber + secondNumber  " + (firstNumber + secondNumber));
        System.out.println("firstNumber - secondNumber  " + (firstNumber - secondNumber));
        System.out.println("firstNumber / secondNumber  " + (firstNumber / secondNumber));
        System.out.println("firstNumber % secondNumber  " + (firstNumber % secondNumber));
    }
}