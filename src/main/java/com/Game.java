package com;

import com.fizzbuzz.FizzBuzz;

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
