package com.ivan.horlov.htmlparser.controller;

import com.ivan.horlov.htmlparser.dto.UrlDto;
import com.ivan.horlov.htmlparser.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UrlController {

    private final MainService mainService;

    @PostMapping("/post/url")
    public ResponseEntity<String> parse(@RequestBody UrlDto urlDto){
        System.out.println(urlDto.getUrl());
        mainService.parseHtmlByUrl(urlDto.getUrl());
        return new ResponseEntity<>("All good. All right.", HttpStatus.OK);
    }
}
