package com.yamamoto.yuta.david.infrastructure.repository;

import com.yamamoto.yuta.david.infrastructure.repository.entity.Sample;
import com.yamamoto.yuta.david.infrastructure.repository.mapper.SampleMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SampleRepository {

    private final SampleMapper mapper;

    public SampleRepository(SampleMapper mapper) {
        this.mapper = mapper;
    }

    public Optional<Sample> get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void save(Sample sample) {
        mapper.updateByPrimaryKey(sample);
    }
}
