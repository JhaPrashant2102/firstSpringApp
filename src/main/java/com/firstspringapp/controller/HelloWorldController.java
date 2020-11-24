package com.firstspringapp.controller;

import com.firstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hellocontroller")
public class HelloWorldController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping(value={"/query"},method= RequestMethod.GET)
    public String sayHello(@RequestParam(value="fName") String fName,@RequestParam(value = "lName") String lName){
        return "Hello "+fName+" "+lName+"!";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name+"!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "hello "+user.getFirstName()+" "+user.getSecondName()+"!";
    }
    @PutMapping("/put/{fName}")
    public String sayHelloPut(@PathVariable String fName,@RequestParam(value = "lName") String lName){
        return "Hello "+fName+" "+lName+"!";
    }
}
