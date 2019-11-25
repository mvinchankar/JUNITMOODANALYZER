package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_Should_Return_Sad() {
        RealMoodAnalyzer moodAnalyzer = new RealMoodAnalyzer(null);
        try {
            Assert.assertEquals("SAD", moodAnalyzer.checkMood("THIS IS SAD MESSAGE"));
        } catch (InvalidMoodException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessage_WhenHappy_Should_Return_Happy() {
        RealMoodAnalyzer moodAnalyzer = new RealMoodAnalyzer(null);
        try {
            Assert.assertEquals("HAPPY", moodAnalyzer.checkMood("THIS IS HAPPY MESSAGE"));
        } catch (InvalidMoodException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessage_WhenNull_Should_Return_Happy() {
        RealMoodAnalyzer moodAnalyzer = new RealMoodAnalyzer(null);
        try {
            moodAnalyzer.checkMood(null);
        } catch (InvalidMoodException e) {
            e.printStackTrace();
            Assert.assertEquals("Please enter proper mood", e.getMessage());
        }

    }

    @Test
    public void givenMessage_WhenProper_Should_Return_Object() {
        RealMoodAnalyzer moodAnalyzer = MoodAnalyzerFactory.createMoodAnalyzer("I am in Happy Mood");
        try {
            String mood = moodAnalyzer.checkMood();
//            Assert.assertEquals("HAPPY", mood);
        } catch (InvalidMoodException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessage_WhenProper_Should_Return_Object_Using_Reflector() {
        RealMoodAnalyzer moodAnalyzer = new RealMoodAnalyzer();
        ObjectReflector.dump(moodAnalyzer, 0);

    }
}
