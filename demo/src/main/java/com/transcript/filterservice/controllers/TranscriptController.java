package com.transcript.filterservice.controllers;

import com.transcript.filterservice.models.TranscriptRequest;
import com.transcript.filterservice.services.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TranscriptController {

    @Autowired
    private TranscriptService transcriptService;

    @PostMapping("/transcribe")
     public HashMap<String, Integer> transcribe(@RequestBody TranscriptRequest transcriptRequest){
        return transcriptService.transcribe(transcriptRequest);
    }


}
