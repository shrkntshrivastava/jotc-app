package com.assessment1.jotc;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ResultTest {
    @Test
    public void jumpingOnCloudsTest() {
       int result = Result.jumpingOnClouds(new int[] {0,0,0,1,0,1,0});
       assertEquals(result, 3);
    }
}
