import java.util.Scanner;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-12-12
 *
 * @Description
 *
 * Player class
 *
 */
public class Player
{
    // Initialize variables.
    private String name = "";
    private int score = 0;
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private Scanner scanner = new Scanner(System.in);

    // Player constructor.
    public Player(String name)
    {
        this.name = name;
    }

    // Return player name.
    public String getName()
    {
        return name;
    }

    // Get player score.
    public int getScore()
    {
        return score;
    }

    // Set player score
    public void setScore(int score)
    {
        this.score = score;
    }

    // Logic for player taking turns.
    public void takeTurn()
    {
        System.out.println("Score for " + name + " is: " + score);

        // Generate a dice roll.
        dice1.roll();
        dice2.roll();

        System.out.println(name + " rolled " + dice1.getValue() + " and " + dice2.getValue());

        // Logic for which die/dice to keep
        int choice = 0;

        while (choice < 1 || choice > 3)
        {
            System.out.print("Press 1 to keep die 1, press 2 to keep die 2, press 3 to keep both: ");

            try
            {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice)
                {
                    case 1:
                        score += dice1.getValue();
                        break;
                    case 2:
                        score += dice2.getValue();
                        break;
                    case 3:
                        score += dice1.getValue() + dice2.getValue();
                        break;
                    default:
                        System.out.println("Please enter a number between 1 and 3.");

                }
            }
            // Handle bad user input.
            catch (Exception e)
            {
                System.out.println("Only numbers are valid." + choice);
            }

        }

        System.out.println("New score for " + name + " is: "+score);

        // Player wins!
        if(score==30)
        {
            System.out.println("*** " + name + " WINS! ***");
            System.exit(0);
        }
        // Player busts!
        else if (score>30)
        {
            System.out.println("*** " + name + " BUSTS! ***");
            score=0;
        }

    }
}
