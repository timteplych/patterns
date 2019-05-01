package ru.ttv.patterns;

/**
 * @author Teplykh Timofey  18.04.2019
 */
public class Contract {

    private String name;
    private String currency;
    private String consumer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
