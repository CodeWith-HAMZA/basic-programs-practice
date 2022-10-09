import java.util.*;

class EvenOddCheck {
    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner inputFromConsole = new Scanner(System.in);
        int chechout = inputFromConsole.nextInt();
        if (chechout % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");

        }

    }
}