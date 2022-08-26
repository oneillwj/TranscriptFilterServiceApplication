package com.transcript.filterservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class TranscriptRequest {
    @JsonProperty("text")
    private String text;
    private ArrayList<String> ignoreText;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getIgnoreText() {
        return ignoreText;
    }

    public void setIgnoreText(ArrayList<String> ignoreText) {
        this.ignoreText = ignoreText;
    }
}


