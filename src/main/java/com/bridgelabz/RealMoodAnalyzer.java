package com.bridgelabz;

public class RealMoodAnalyzer {
    public String checkMood(String message) {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (Exception e) {
            return "HAPPY";
        }
    }
}
