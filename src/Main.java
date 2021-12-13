import java.util.Random;
import java.util.Scanner;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-12-12
 *
 * @Description
 *
 * 30 or Bust Final
 *
 */
class Main
{
    public static void main(String[] args)
    {
        // Introduction text.
        System.out.println("Welcome to dice game: 30 or Bust!");
        System.out.println("Each player must get to 30 to win!");
        System.out.println("Each player has two six sided die, after each roll you will be allowed the option to chose weather or not you would like to keep either which of the die or both. ");

        // Create a new Scanner
        Scanner scanner = new Scanner(System.in);

        // add names for player 1 and player 2
        String name1, name2;
        System.out.print("Player 1 please enter your name!: ");
        name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.print("Player 2 please enter your name!: ");
        name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        System.out.println("Welcome " + player1.getName() + " and " + player2.getName() + "!" );
        System.out.println("May luck be ever in your favor!!");
        System.out.println();

        // Add logic for two players
        while (player1.getScore() != 30 && player2.getScore() != 30)
        {
            if (player1.getScore() != 30)
            {
                player1.takeTurn();
            }

            System.out.println();

            if (player2.getScore() != 30)
            {
                player2.takeTurn();
            }

            // Format.
            System.out.println("----------------------------------------");
        }

    }
}
