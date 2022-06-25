package com.transcript.filterservice.services;

import com.transcript.filterservice.models.TranscriptRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TranscriptService {

    public HashMap<String, Integer> transcribe(TranscriptRequest transcriptRequest){

        String[] transcriptWords = transcriptRequest.getText().toLowerCase().split(" ");
        HashMap<String, Integer> transcriptMap = new HashMap<>();

        //goes through transcriptRequest(text array) and checks/adds words into hashmap
        for(String word: transcriptWords){
            if(transcriptMap.containsKey(word)){
                transcriptMap.put(word, transcriptMap.get(word) + 1);
            } else {
                transcriptMap.put(word, 1);
            }
        }

        return transcriptMap;
    }
}
