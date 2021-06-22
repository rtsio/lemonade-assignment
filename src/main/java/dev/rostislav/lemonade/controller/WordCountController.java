package dev.rostislav.lemonade.controller;

import dev.rostislav.lemonade.request.WordCountRequest;
import dev.rostislav.lemonade.service.WordCountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@Slf4j
public class WordCountController {

    @Autowired
    private WordCountService wordCountService;

    @PostMapping("/count")
    public Integer getWordCount(@RequestBody WordCountRequest wordCountRequest) {

        if (wordCountRequest.getWord() == null || wordCountRequest.getText() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Word and Text values must be non-null");
        }
        return wordCountService.calculateWordCount(
                wordCountRequest.getText(),
                wordCountRequest.getWord()
        );
    }
}
