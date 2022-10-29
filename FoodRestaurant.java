import java.util.*;

public class FoodRestaurant {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String Foods[][] = {
                { "Chicken biryani ", "343" },
                { "Chicken tikka ", "443" },
                { "Chicken Leg-Piece ", "200" },
                { "Chicken Tandoori ", "1343" },
                { "Chicken Large Shawarma ", "433" }
        };

        while (true) {

            for (int i = 0; i < Foods.length; i++)
                System.out.println(i + 1 + ": " + Foods[i][0]);
            System.out.println("Select Your Pakage: ");
            int ch = in.nextInt();
            if (ch == 0)
                break;
            System.out.println("Selected Item: " + Foods[--ch][0] + " " + Foods[--ch][1] + "\n\n");
        }
    }
}