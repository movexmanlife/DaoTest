package com.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RestController
public class HelloController {
    /**
     * localhost:8080/hello?id=xman
     */
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String index(String id, Model model) { // 这里id就是http传过来的参数的key
        Map<String, Object> args = model.asMap();
        System.out.println(args.get("id"));
        System.out.println(id);
        return "Hello world!";
    }

}

//@RestController
//public class HelloController {
    /**
     * localhost:8080
     */
//    @RequestMapping("/")
//    public String index(Model model) {
//        return "Hello world!";
//    }
//
//}