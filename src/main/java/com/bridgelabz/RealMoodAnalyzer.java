package com.bridgelabz;

public class RealMoodAnalyzer {
    private String message;

    public RealMoodAnalyzer(String message) {
        this.message = message;
    }

    public String checkMood(String message) throws  InvalidMoodException{
        this.message=message;
        return checkMood();
    }
    public String checkMood() throws InvalidMoodException {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new InvalidMoodException("Please enter proper mood");
        }
    }
}
