package com.yamamoto.yuta.david.domain.service;

import com.yamamoto.yuta.david.infrastructure.repository.MasterRepository;
import com.yamamoto.yuta.david.infrastructure.repository.entity.Master;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterService {

    private final MasterRepository masterRepository;

    public MasterService(MasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    public List<Master> get() {
        return masterRepository.get();
    }
}
