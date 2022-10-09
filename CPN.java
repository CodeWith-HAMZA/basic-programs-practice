import java.util.Scanner;

class CPN {
    public static void main() {
        double Matric_Percentage = 0, Intermediate_Percentage = 0, CPN_Result;
        int Obtained_EntryTestMarks;
        Scanner inputFromConsole = new Scanner(System.in);
        System.out.println("Your 10th [Matric-Marks] %: ");
        Matric_Percentage = inputFromConsole.nextDouble();

        System.out.println("Your 12th [Intermediate-Marks] %: ");
        Intermediate_Percentage = inputFromConsole.nextDouble();

        System.out.println("Enter Test Marks:");
        Obtained_EntryTestMarks = inputFromConsole.nextInt();

        CPN_Result = (Matric_Percentage * 0.10) + (Intermediate_Percentage * 0.30) + (Obtained_EntryTestMarks * 0.60);

        System.out.println("Cpn is:" + (CPN_Result));

        return;
    }
}