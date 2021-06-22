package dev.rostislav.lemonade.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class WordCountService {

    /**
     *   Count occurrences of 'word' in 'text'. Case insensitive and ignores dashes, commas, and digits in 'text'.
     */
    public Integer calculateWordCount(String text, String word) {

        return StringUtils.countMatches(sanitizeInput(text), word.toLowerCase());
    }

    /**
     *  Sanitize input by removing all dashes, commas, digits, and making everything lowercase.
     */
    public String sanitizeInput(String input) {

        return input
                .replaceAll("[0-9]", "")
                .replaceAll(",", "")
                .replaceAll("-", "")
                .toLowerCase();
    }
}
