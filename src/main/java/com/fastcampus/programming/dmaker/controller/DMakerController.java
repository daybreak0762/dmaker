package com.fastcampus.programming.dmaker.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController // DMakerController를  RestController 타입의 빈으로 등록
public class DMakerController {

    private static final Logger log = LoggerFactory.getLogger(DMakerController.class);

    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
        log.info("GET /developers HTTP/1.1");

        return Arrays.asList("snow", "elsa", "Olaf");
    }
}
