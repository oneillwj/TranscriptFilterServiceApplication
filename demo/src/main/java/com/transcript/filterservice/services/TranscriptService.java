package com.transcript.filterservice.services;

import com.transcript.filterservice.models.TranscriptRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class TranscriptService {

    protected ArrayList<String> dirtyTranscriptRequest(ArrayList<String> transcriptRequestDirty, ArrayList<String> ignoreTextWords){

        ArrayList<String> dirtyTranscriptRequest = transcriptRequestDirty;

        for(String ignoreWord: ignoreTextWords){
            for(String textWord: dirtyTranscriptRequest){
               //if currant textWord contains current ignoreWord
                if(textWord.equals(ignoreWord)){
                    //delete current textWord in transcript words arraylist
                    dirtyTranscriptRequest.remove(textWord);
                }
            }

        }

        return dirtyTranscriptRequest;

    }

    public HashMap<String, Integer> transcribe(TranscriptRequest transcriptRequest){
        /*creates an array of Strings and sets it equal to the transcriptRequest
        sets them all to lowercase
        and splits each word in the array per every space*/
        ArrayList<String> dirtyTranscriptWords = new ArrayList<>(Arrays.asList(transcriptRequest.getText().toLowerCase().split(" ")));


        //create arraylist for ignoreText
        ArrayList<String> ignoreTextWords = transcriptRequest.getIgnoreText();
        //setting words in ignoreTextWords to all lowercase with for loop.
        for(String word: ignoreTextWords){
            word = word.toLowerCase();
        }

        //creates arraylist for transcriptRequest after being cleaned in the dirtyTranscriptRequest method above
        ArrayList<String> cleanTranscriptWords = dirtyTranscriptRequest(dirtyTranscriptWords, ignoreTextWords);

        //creates a new hashmap
        HashMap<String, Integer> transcriptMap = new HashMap<>();

        //checks/adds words into the transcriptMap hashmap by using the cleantranscriptwords arraylist
       for(String word: cleanTranscriptWords){
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
