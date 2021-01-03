package com.yamamoto.yuta.david.application.controller;

import com.yamamoto.yuta.david.application.resource.SampleForm;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample-form")
@CrossOrigin("http://localhost:4200")
public class SampleFormController {

    @GetMapping
    public SampleForm get() {

        SampleForm sampleForm = new SampleForm();
        sampleForm.setString("hoge");
        return sampleForm;
    }
}
