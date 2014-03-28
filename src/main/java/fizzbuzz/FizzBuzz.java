package fizzbuzz;

public class FizzBuzz
{
    public String answer(int number)
    {
        String answer = "";

        if (number % 3 == 0) {
            answer += "Fizz";
        }

        if (number % 5 == 0) {
            answer += "Buzz";
        }

        if (number % 3 != 0 && number % 5 != 0) {
            answer = String.valueOf(number);
        }

        return answer + " !";
    }
}
