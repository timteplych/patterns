package ru.ttv.patterns.mvc;

import java.util.Map;

/**
 * @author Teplykh Timofey  16.05.2019
 */
public class HtmlView implements View<String> {

    @Override
    public String generate(Model model) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String,String> modelParameters = model.getModelParams();
        for (Map.Entry<String,String> pair: modelParameters.entrySet()){
            stringBuilder.append("<div>");
            stringBuilder.append(pair.getKey());
            stringBuilder.append(":");
            stringBuilder.append(pair.getValue());
            stringBuilder.append("</div");
        }
        return stringBuilder.toString();
    }

}
