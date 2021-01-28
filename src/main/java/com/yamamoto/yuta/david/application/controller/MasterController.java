package com.yamamoto.yuta.david.application.controller;

import com.yamamoto.yuta.david.domain.service.MasterService;
import com.yamamoto.yuta.david.infrastructure.repository.entity.Master;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/master")
public class MasterController {

    private final MasterService service;

    public MasterController(MasterService service) {
        this.service = service;
    }

    @GetMapping
    public List<Master> get() {
        return service.get();
    }
}
