package dev.rostislav.lemonade.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WordCountRequest {

    @JsonProperty("Text")
    private String text;

    @JsonProperty("Word")
    private String word;
}
