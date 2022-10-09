import java.util.*;

class EvenOddCheck {
    public static void main(void) {

        System.out.println("enter the number");
        Scanner inputFromConsole = new Scanner(System.in);
        int num = inputFromConsole.nextInt();
        
        EvenOddCheck checker = new EvenOddCheck();
                
        String result = checker.isEvenOrOdd(num);
        System.out.println(result);
        
        
        return;
    }
    
    
   String isEvenOrOdd(int givenNumber){
        return(
            ((givenNumber / 2) * 2 == givenNumber ) ?
                "This One Is Even":
                "This One Is Odd"
        );
    }
}
