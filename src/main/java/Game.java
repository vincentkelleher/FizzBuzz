import fizzbuzz.FizzBuzz;

/**
 * Created by Vincent on 28/03/2014.
 */
public class Game
{
    public static void main(String[] args)
    {
        FizzBuzz fb = new FizzBuzz();

        for (int i = 0; i < 100; i++) {
            System.out.println(fb.answer(i));
        }
    }
}
