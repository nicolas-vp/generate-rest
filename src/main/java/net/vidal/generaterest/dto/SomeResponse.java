package net.vidal.generaterest.dto;

public class SomeResponse {
    private String testString;
    private Integer testInteger;

    public SomeResponse(String testString, Integer testInteger) {
        this.testString = testString;
        this.testInteger = testInteger;
    }

    public String getTestString() {
        return testString;
    }

    public Integer getTestInteger() {
        return testInteger;
    }
}
