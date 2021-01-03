package com.yamamoto.yuta.david.application.controller;

import com.yamamoto.yuta.david.application.resource.SampleForm;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public SampleForm post(@RequestBody SampleForm sampleForm) {
        return sampleForm;
    }
}
