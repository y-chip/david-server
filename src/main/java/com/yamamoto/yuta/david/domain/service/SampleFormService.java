package com.yamamoto.yuta.david.domain.service;

import com.yamamoto.yuta.david.infrastructure.repository.SampleRepository;
import com.yamamoto.yuta.david.infrastructure.repository.entity.Sample;
import org.springframework.stereotype.Service;

@Service
public class SampleFormService {

    private final SampleRepository sampleRepository;

    public SampleFormService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public Sample get() {
        return sampleRepository.get(1)
                .orElseThrow(() -> new RuntimeException("cant get"));
    }

    public Sample save(Sample sample) {
        sample.setId(1);
        sampleRepository.save(sample);
        return this.get();
    }
}
