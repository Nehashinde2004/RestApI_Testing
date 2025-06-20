package com.example.springdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class LanguageController {

    // GET method for HTML
    @RequestMapping(value = "/html", method = RequestMethod.GET)
    public String htmlInfo() {
        return "HTML stands for HyperText Markup Language.";
    }

    // POST method for Java
    @RequestMapping(value = "/java", method = RequestMethod.POST)
    public String javaInfo() {
        return "Java is a high-level, class-based, object-oriented programming language.";
    }

    // PUT method for CSS
    @RequestMapping(value = "/css", method = RequestMethod.PUT)
    public String cssInfo() {
        return "CSS stands for Cascading Style Sheets. It styles HTML elements.";
    }

    // DELETE method for example (maybe removing a topic)
    @RequestMapping(value = "/topic", method = RequestMethod.DELETE)
    public String deleteInfo() {
        return "This API simulates deleting a topic.";
    }
}
