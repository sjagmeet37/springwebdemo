package com.tks.demo.springwebdemo.controller;

import com.tks.demo.springwebdemo.model.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@controller (method mappings) returns a view(mostly jsp)
@Controller
@RequestMapping("/greet")
public class IndexController {

    @Autowired
    Counter counter;

    @GetMapping
    public String getGreet(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        counter.incrementCounter();
        model.addAttribute("messageName", name );
        model.addAttribute("counterValue", counter.getCounter() );
        return "greeting";
    }

}

