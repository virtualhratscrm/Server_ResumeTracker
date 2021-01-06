package com.virtualHRco.resumeServer.controllers;


import com.virtualHRco.resumeServer.services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiV1")
public class ResumeServerController {

    @Autowired
    ResumeService service;

    @PostMapping("/submit")
    public Integer submitProfile(){
        /// return nothing ? id of user?
        return 1;
    }
}
