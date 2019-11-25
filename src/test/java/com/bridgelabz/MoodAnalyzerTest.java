package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_Should_Return_Sad()
    {
        RealMoodAnalyzer moodAnalyzer =new RealMoodAnalyzer();
        Assert.assertEquals("SAD",moodAnalyzer.checkMood("THIS IS SAD MESSAGE"));

    }
    @Test
    public void givenMessage_WhenHappy_Should_Return_Happy()
    {
        RealMoodAnalyzer moodAnalyzer =new RealMoodAnalyzer();
        Assert.assertEquals("HAPPY",moodAnalyzer.checkMood("THIS IS HAPPY MESSAGE"));

    }
    @Test
    public void givenMessage_WhenNull_Should_Return_Happy()
    {
        RealMoodAnalyzer moodAnalyzer =new RealMoodAnalyzer();
        Assert.assertEquals("HAPPY",moodAnalyzer.checkMood(null));

    }
}
