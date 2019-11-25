package com.bridgelabz;

public class RealMoodAnalyzer {
    public String checkMood(String message) throws InvalidMoodException {
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
