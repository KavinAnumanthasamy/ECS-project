package com.example.docker_demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @RequestMapping("/welcome")
    public String name(){
        return "This is an example of ECS in AWS";
    }
    
}
