package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.MemberDto;
import org.example.service.RestTemplateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-template")
@RequiredArgsConstructor
public class RestTemplateController {
    private final RestTemplateService restTemplateService;


    @GetMapping
    public String getName(){
        return restTemplateService.getName();
    }

    @GetMapping("/path-variable")
    public String getNameWithPathVariable(){
        return restTemplateService.getNameWithPathVariable();
    }

    @GetMapping("/parameter")
    public String getNameWithParameter(){
        return restTemplateService.getNameWithParameter();
    }

    @PostMapping
    public ResponseEntity<MemberDto> postDto(){
        return restTemplateService.postWithParamAndBody();
    }

    @PostMapping
    public ResponseEntity<MemberDto> postWithHeader(){
        return restTemplateService.postWithHeader();
    }



}
