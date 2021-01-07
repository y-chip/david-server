package com.yamamoto.yuta.david.infrastructure.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.yamamoto.yuta.david.infrastructure.repository.entity.Sample;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.text.SimpleDateFormat;
import java.util.Optional;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class SampleRepositoryTest {

    @Autowired
    private SampleRepository sampleRepository;

    private static ObjectMapper objectMapper;

    @BeforeAll
    static void setUp() {
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
    }

    @Test
    void get() throws JsonProcessingException {
        Optional<Sample> sample = sampleRepository.get(1);
        println(sample.get());
    }

    void println(Object o) throws JsonProcessingException {
        System.out.println(objectMapper.writeValueAsString(o));
    }
}