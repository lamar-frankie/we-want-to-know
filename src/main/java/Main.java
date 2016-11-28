/**
 * Created by fl76at on 11/25/16.
 */

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static java.lang.System.in;
import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args){

        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/sign-in", (req, res) -> {
            return new ModelAndView(null, "sign-in.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
