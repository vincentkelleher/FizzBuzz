import fizzbuzz.FizzBuzz;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;

public class WebDisplay
{
    public static void main(String[] args) {

        get(new Route("/fizzbuzz/:number") {
            @Override
            public Object handle(Request request, Response response) {
                FizzBuzz fb = new FizzBuzz();

                String responseString = "";
                for (String answer : fb.getAnswers(Integer.parseInt(request.params(":number")))) {
                    responseString += answer + "<br>";
                }

                return responseString;
            }
        });

    }
}
