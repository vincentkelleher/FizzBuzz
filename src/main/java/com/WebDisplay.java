package com;

import com.fizzbuzz.FizzBuzz;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;
import static spark.Spark.setPort;

public class WebDisplay
{
    public static void main(String[] args) {
        setPort(8080);
        get(new Route("/fizzbuzz/:number") {
            @Override
            public Object handle(Request request, Response response) {
                FizzBuzz fb = new FizzBuzz();

                String responseString = "Test <br>";
                for (String answer : fb.getAnswers(Integer.parseInt(request.params(":number")))) {
                    responseString += answer + "<br>";
                }

                return responseString;
            }
        });

    }
}
