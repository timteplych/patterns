package ru.ttv.patterns.mvc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Teplykh Timofey  16.05.2019
 */
public class Model {
    private Map<String,String> modelParams = new HashMap<>();

    public void setParam(String key, String value){
        modelParams.put(key,value);
    }

    public Map<String, String> getModelParams() {
        return modelParams;
    }
}
