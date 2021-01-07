package com.yamamoto.yuta.david.application.controller;

import com.yamamoto.yuta.david.domain.service.SampleFormService;
import com.yamamoto.yuta.david.infrastructure.repository.entity.Sample;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample-form")
@CrossOrigin("http://localhost:4200")
public class SampleFormController {

    private final SampleFormService service;

    public SampleFormController(SampleFormService service) {
        this.service = service;
    }

    @GetMapping
    public Sample get() {
        return service.get();
    }

    @PostMapping
    public Sample save(@RequestBody Sample sample) {
        return service.save(sample);
    }
}
