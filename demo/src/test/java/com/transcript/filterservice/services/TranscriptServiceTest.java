package com.transcript.filterservice.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class TranscriptServiceTest {

    TranscriptService transcriptServiceSut = new TranscriptService();

    @Test
    void demoTest() {

        ArrayList<String> testRequestWords = asdfasdf;
        ArrayList<String> testDirtyWords = asdfasdf;
        ArrayList<String> expectedOutPut = asdfasdf;

        Assertions.assertEquals(expectedOutPut, transcriptServiceSut.dirtyTranscriptRequest(testRequestWords, testDirtyWords));



        String b = "hello";
        Assertions.assertEquals("hello", b);
    }
}
