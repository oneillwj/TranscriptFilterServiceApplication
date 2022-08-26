package com.transcript.filterservice.services;

import com.transcript.filterservice.models.TranscriptRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import organizationUtil class

import java.util.*;

@Service
public class TranscriptService {


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

       //if enum value is called in transcript request, call method for requested enum organization

        //returns the complete hashmap
        return transcriptMap;
    }

    protected ArrayList<String> dirtyTranscriptRequest(ArrayList<String> transcriptRequestDirty, ArrayList<String> ignoreTextWords){

        ArrayList<String> dirtyRequest = new ArrayList<>(transcriptRequestDirty);

        for(String ignoreWord: ignoreTextWords){
            //if currant textWord contains current ignoreWord
            //delete current textWord in transcript words arraylist
            dirtyRequest.removeIf(textWord -> textWord.equals(ignoreWord));

        }

        return dirtyRequest;

    }
    
}
