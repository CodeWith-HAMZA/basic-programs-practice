
import java.util.Scanner;

class CPN {

    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        String[][] Arr = { { "Enter You Matric Marks:> ", "850", "" }, { "Enter You InterMediate Marks:> ", "1100", "" }, { "Enter You Entry-Test Marks:> ", "100", "" } };
        
        for (int i = 0; i < Arr.length; i++) {
            Out(Arr[i][0]);
            Arr[i][2] = String.valueOf(RatioOfObtainedTotal(inputObject.nextDouble(), Double.parseDouble(Arr[i][1])));
        }
        double Resultant_CPN = Double.parseDouble(Arr[0][2]) * 10 + Double.parseDouble(Arr[1][2]) * 30 + Double.parseDouble(Arr[2][2]) * 60;
        Out("Your Total CPN:> " + String.valueOf(Resultant_CPN));
    }
    static void Out(String _givenStr) {
        System.out.println(_givenStr);
    }
    static double RatioOfObtainedTotal(double ObtainedMarks, double totalMarks) {
        return (ObtainedMarks / totalMarks);
    }

}
