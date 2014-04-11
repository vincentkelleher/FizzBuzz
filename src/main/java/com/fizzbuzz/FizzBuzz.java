package com.fizzbuzz;

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
    
    public String[] getAnswers(int numberOfAnswers) {
        String[] answers = new String[numberOfAnswers];

        for (int i = 1; i <= numberOfAnswers; i++) {
            answers[i - 1] = answer(i);
        }

        return answers;
    }
}
