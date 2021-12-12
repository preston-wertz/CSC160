import java.util.Random;
class Main
{
    public static void main(String[] args)
    {
        int score = 0, min=1, max=6;
        int dice1, dice2;
        System.out.println("Score is: "+score+"\n");

        // add logic for two players
        while (score != 30)
        {
            dice1 = min + (int)(Math.random() * ((max - min) + 1));
            dice2 = min + (int)(Math.random() * ((max - min) + 1));
            System.out.println("You rolled "+dice1+" and "+dice2);
            // add logic which die/dice to keep
            // assuming we keep both dice
            score+=dice1+dice2;
            System.out.println("New score is: "+score);

            if(score==30)
            {
                System.out.println("*** you win! ***");
            }
            else if (score>30)
            {
                System.out.println("*** you lose! ***");
                score=0;
            }

            System.out.println("----------------------------------------");
        }

    }
}
