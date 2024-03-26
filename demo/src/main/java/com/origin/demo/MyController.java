package com.origin.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @RequestMapping("m")
   public static String myMethod(){
        return "<h1>Hello</h1>";
    }
    @PostMapping("process-form")
    public static String getData(@RequestParam int num1,@RequestParam int num2) {
        int res=num1+num2;
        return "result="+res;
    }
    
   
}
