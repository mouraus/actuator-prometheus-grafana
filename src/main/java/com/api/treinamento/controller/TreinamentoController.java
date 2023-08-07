package com.api.treinamento.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treinamento")
@CrossOrigin
public class TreinamentoController {


    @GetMapping(path = "/helloWorld")
    private ResponseEntity<Object> helloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }


}
