import java.util.*;

public class Draft {
    public static void main(String args[]) {
        int[] randomNumbers = new int[6]; // Stores 6 random numbers
        int[] inputNumbers = new int[6]; // Stores 6 numbers given by user
        ArrayList<Integer> equalNumbers = new ArrayList<Integer>(); // Stores matched numbers
        Random rand = new Random();

// Get Random 6 Numbers which are below 100
        System.out.println("Random Numbers :");
        for(int i=0 ; i < 6 ; i++)
        {
            randomNumbers[i] = rand.nextInt(100);
            System.out.println(randomNumbers[i]);

        }

// Take input of 6 numbers
        System.out.println("Enter 6 numbers :");
        for (int i=0;i<6;i++)
        {
            Scanner input = new Scanner(System.in);
            inputNumbers[i] = input.nextInt();

        }

// Comparing random numbers array and user input numbers array
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<6;j++)
            {
                if (randomNumbers[i] == inputNumbers[j]) { // Comparing matched numbers
                    equalNumbers.add(randomNumbers[i]); // Adding metched number to Array list
                }
            }
        }
// Printing final output
        if (equalNumbers.size() != 0) { // At least one matched number is there
            System.out.println("You are a Winner!!");
            System.out.println("Matched Numbers are : ");
                for(int i: equalNumbers)
            {
                System.out.println(i); // Printing list of matched numbers
            }
        }
        else { // If no matched numbers
            System.out.println("You are a Looser.");
        }
    }
}