package com.transcript.filterservice.services;

import com.transcript.filterservice.models.TranscriptRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@Service
public class TranscriptService {

    public ArrayList<String> cleanTranscriptRequest(TranscriptRequest transcriptRequestDirty, TranscriptRequest ignoreText){

        ArrayList<String> transcriptWords = (ArrayList<String>) Arrays.asList(transcriptRequestDirty.getText().toLowerCase().split(" "));
        ArrayList<String> ignoreTextWords = ignoreText.getIgnoreText();

        for(String ignoreWord: ignoreTextWords){
            for(String textWord: transcriptWords){
                if(//transcriptWords.contains(ignoreText.getText())){
                    //delete word in transcriptwords
                } else {
                    //go to next word
                }
            }

            //need to figure out a way of getting ignoretext to go to the next word to compare.
        }


    }

    public HashMap<String, Integer> transcribe(TranscriptRequest transcriptRequestClean){
        /*creates an array of Strings and sets it equal to the transcriptRequest
        sets them all to lowercase
        and splits each word in the array per every space*/
        String[] transcriptWords = transcriptRequestClean.getText().toLowerCase().split(" ");

        //creates a new hashmap
        HashMap<String, Integer> transcriptMap = new HashMap<>();

        //checks/adds words into the transcriptMap hashmap by using the transcriptWords array.
        for(String word: transcriptWords){
            if(transcriptMap.containsKey(word)){
                transcriptMap.put(word, transcriptMap.get(word) + 1);
            } else {
                transcriptMap.put(word, 1);
            }
        }

        //returns the complete hashmap
        return transcriptMap;
    }

    
}
