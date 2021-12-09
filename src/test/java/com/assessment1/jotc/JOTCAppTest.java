package com.assessment1.jotc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class JOTCAppTest {

    @Test(expected = IllegalArgumentException.class)
    public void processJOTCInputTest_invalidelementstart() throws IOException {
        int[] c = null;
        try (BufferedReader reader = new BufferedReader(new StringReader("10101010"))) {
            c = JOTCApp.processJOTCInput(reader);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void processJOTCInputTest_invalidelementend() throws IOException {
        int[] c = null;
        try (BufferedReader reader = new BufferedReader(new StringReader("0101011"))) {
            c = JOTCApp.processJOTCInput(reader);
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void processJOTCInputTest_invalidsizelessthan2() throws IOException {
        int[] c = null;
        try (BufferedReader reader = new BufferedReader(new StringReader("0"))) {
            c = JOTCApp.processJOTCInput(reader);
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void processJOTCInputTest_invalidsizegethan100() throws IOException {
        int[] c = null;
        try (BufferedReader reader = new BufferedReader(new StringReader("00100101000010010100001001010000100101000010010100001001010000100101000010010100001001010000100101000100"))) {
            c = JOTCApp.processJOTCInput(reader);
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void processJOTCInputTest_invalidinput() throws IOException {
        int[] c = null;
        try (BufferedReader reader = new BufferedReader(new StringReader("231654d"))) {
            c = JOTCApp.processJOTCInput(reader);
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void processJOTCInputTest_invalidconsecutiveone() throws IOException {
        int[] c = null;
        try (BufferedReader reader = new BufferedReader(new StringReader("010110"))) {
            c = JOTCApp.processJOTCInput(reader);
        }
    }
}
