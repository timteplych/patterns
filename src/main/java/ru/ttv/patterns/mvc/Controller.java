package ru.ttv.patterns.mvc;

/**
 * @author Teplykh Timofey  16.05.2019
 */
public class Controller {

    private Model model;

    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public Object action(String param, String value){
        model.setParam(param,value);
        return  view.generate(model);
    }
}
