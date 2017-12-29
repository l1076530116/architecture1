package com.lb.architecture1.util.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {
    private JsonHelper(){}

    public static String object2Str(Object object){
        String reStr = "";
        ObjectMapper om = new ObjectMapper();
        try {
            reStr = om.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return reStr;
    }

    public static Object str2Object(String str,Class cls){
        Object retObj = null;
        ObjectMapper mapper = new ObjectMapper();

        try {
            retObj = mapper.readValue(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retObj;
    }
}
