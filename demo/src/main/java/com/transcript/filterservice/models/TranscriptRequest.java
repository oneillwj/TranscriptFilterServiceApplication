package com.transcript.filterservice.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TranscriptRequest {
    @JsonProperty("text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
