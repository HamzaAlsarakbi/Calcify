package com.calckify.calckify.model;

import java.util.Date;

public class Operation {

    private Date timestamp;
    private String input, output;

    /**
     * Constructs a math operation object
     * @param input takes input in string format
     * @param output output in string format
     */
    public Operation(String input, String output){
        this.input = input;
        this.output = output;
        timestamp = new Date();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

}
