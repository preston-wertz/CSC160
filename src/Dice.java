/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-12-12
 *
 * @Description
 *
 * Dice class for a six sided die.
 *
 */
public class Dice
{
    // Initialize variables.
    private int value = 1;
    private int min=1, max=6;

    // Create Dice object.
    Dice()
    {
        this.roll();
    }

    // Get dice value.
    public int getValue()
    {
        return value;
    }

    // Roll dice.
    public int roll()
    {
        value = min + (int)(Math.random() * ((max - min) + 1));
        return value;
    }
}
