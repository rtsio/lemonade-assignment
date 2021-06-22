package dev.rostislav.lemonade.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordCountServiceTests {

    private final WordCountService wordCountService = new WordCountService();

    @Test
    public void testSanitize() {

        String input = "testing-replacement-and,SANITIZATION999";
        assertThat(wordCountService.sanitizeInput(input)).isEqualTo("testingreplacementandsanitization");
    }

    @Test
    public void testWordCount() {

        String input = "Hi! My name is (what?), MY name is (who?), my2 name is Slim Shady";
        String word = "MY";
        assertThat(wordCountService.calculateWordCount(input, word)).isEqualTo(3);
    }
}
