package by.asptour.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("Hello");
        return "index";
    }

    @RequestMapping(value = "bulgaria", method = RequestMethod.GET)
    public String bulgaria() {
        System.out.println("Bulgaria");
        return "bulgaria";
    }
}
