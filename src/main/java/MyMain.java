public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int) ((Math.random() * 6.0) + 1);
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        int count2 = 0;
        for (int i = 0; i < 10000; i++) {
            int count1 = 0;
            for (int j = 0; j < 6; j++) {
                if (rollDie()==6){
                    count1++;
                }
            }
            if (count1 > 0){
                count2++;
            }
        }

        return (count2/100.0);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int count2 = 0;
        for (int i = 0; i < 10000; i++) {
            int count1 = 0;
            for (int j = 0; j < 12; j++) {
                if (rollDie()==6){
                    count1++;
                }
            }
            if (count1 >= 2){
                count2++;
            }
        }

        return (count2/100.0);
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int count2 = 0;
        for (int i = 0; i < 10000; i++) {
            int count1 = 0;
            for (int j = 0; j < 18; j++) {
                if (rollDie()==6){
                    count1++;
                }
            }
            if (count1 >= 3){
                count2++;
            }
        }

        return (count2/100.0);
    }

    public static void main(String[] args) {
        System.out.println("The probability of rolling at least one 6 when rolling six dice is: " + probabilityOneSix() + "%");
        System.out.println("The probability of rolling at least two 6's when rolling twelve dice is: " + probabilityTwoSixes() + "%");
        System.out.println("The probability of rolling at least three 6's when rolling eighteen dice is: " + probabilityThreeSixes() + "%");
        System.out.println();
        System.out.println("The probability of rolling at least one 6 when rolling six dice is the most probable!");
    }
}
