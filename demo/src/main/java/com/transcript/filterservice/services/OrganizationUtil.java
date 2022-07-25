package com.transcript.filterservice.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Component
public class OrganizationUtil {


    protected HashMap<String, Integer> organizeMap(HashMap<String, Integer> unorganizedMap, String type){

    }

    protected List<Integer> organizeMapGreatest(HashMap<String, Integer> unorganizedMap){

        List<Integer> organizeList = new ArrayList<>(unorganizedMap.values());
        Collections.sort(organizeList);


        return organizeList;
    }

}
