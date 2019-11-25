package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_Should_Return_Sad()
    {
        RealMoodAnalyzer moodAnalyzer =new RealMoodAnalyzer();
        try {
            Assert.assertEquals("SAD",moodAnalyzer.checkMood("THIS IS SAD MESSAGE"));
        } catch (InvalidMoodException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void givenMessage_WhenHappy_Should_Return_Happy()
    {
        RealMoodAnalyzer moodAnalyzer =new RealMoodAnalyzer();
        try {
            Assert.assertEquals("HAPPY",moodAnalyzer.checkMood("THIS IS HAPPY MESSAGE"));
        } catch (InvalidMoodException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void givenMessage_WhenNull_Should_Return_Happy() {
        RealMoodAnalyzer moodAnalyzer =new RealMoodAnalyzer();
        try {
            ExpectedException exceptionRule= ExpectedException.none();
            exceptionRule.expect(InvalidMoodException.class);
            Assert.assertEquals("HAPPY",moodAnalyzer.checkMood(null));
        } catch (InvalidMoodException e) {
            e.printStackTrace();
        }

    }
}
