package com.transcript.filterservice.services;


import com.transcript.filterservice.models.TranscriptRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TranscriptServiceTest {

    TranscriptService transcriptServiceSut = new TranscriptService();

    @Test
    void demoDirtyTranscriptRequestTest() {

        ArrayList<String> testRequestWords = new ArrayList<>(Arrays.asList("the", "turkey", "fell", "on", "the", "stump"));
        ArrayList<String> testDirtyWords = new ArrayList<>(Arrays.asList("the"));
        ArrayList<String> expectedOutPut = new ArrayList<>(Arrays.asList("turkey", "fell", "on", "stump"));

        Assertions.assertEquals(expectedOutPut, transcriptServiceSut.dirtyTranscriptRequest(testRequestWords, testDirtyWords));

    }

    @Test
    void demoTranscribeTest(){

        TranscriptRequest testTranscriptRequest = new TranscriptRequest();

        testTranscriptRequest.setText("The turkey fell on the stump");

        ArrayList<String> ignoreTextTest = new ArrayList<>(Arrays.asList("on"));
        testTranscriptRequest.setIgnoreText(ignoreTextTest);

        HashMap<String, Integer> expectedOutPut = new HashMap<>(){{
            put("the", 2);
            put("turkey", 1);
            put("fell", 1);
            put("stump", 1);
        }};

        Assertions.assertEquals(transcriptServiceSut.transcribe(testTranscriptRequest), expectedOutPut);


    }



}
