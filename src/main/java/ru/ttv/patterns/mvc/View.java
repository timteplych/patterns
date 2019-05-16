package ru.ttv.patterns.mvc;

/**
 * @author Teplykh Timofey  16.05.2019
 */
public interface View<T> {

    T generate(Model model);

}
