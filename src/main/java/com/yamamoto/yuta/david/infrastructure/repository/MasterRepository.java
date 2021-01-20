package com.yamamoto.yuta.david.infrastructure.repository;

import com.yamamoto.yuta.david.infrastructure.repository.entity.Master;
import com.yamamoto.yuta.david.infrastructure.repository.entity.MasterExample;
import com.yamamoto.yuta.david.infrastructure.repository.mapper.MasterMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MasterRepository {

    private final MasterMapper mapper;

    public MasterRepository(MasterMapper mapper) {
        this.mapper = mapper;
    }

    public List<Master> get() {
        return mapper.selectByExample(new MasterExample());
    }
}
