package edu.ifrn.tsi.sgpt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello world! - BORA ABC FC";
    }
}
