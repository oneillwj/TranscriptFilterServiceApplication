package com.transcript.filterservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.transcript.filterservice.services.OrganizationUtil;

import java.util.ArrayList;

public class TranscriptRequest {
    @JsonProperty("text")
    private String text;
    private ArrayList<String> ignoreText;

    //add enum for optional sorting values
    //spring optional value in post body
    private OrganizationUtil.Organizations greatestToLeast;
    private OrganizationUtil.Organizations leastToGreatest;
    private OrganizationUtil.Organizations alphabetically;
    private OrganizationUtil.Organizations topFive;

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


