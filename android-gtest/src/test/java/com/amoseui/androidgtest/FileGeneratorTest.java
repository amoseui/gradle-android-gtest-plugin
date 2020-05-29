package com.amoseui.androidgtest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FileGeneratorTest {

    @Test
    public void testIsValid() {
        FileGenerator fileGenerator = new FileGenerator();
        assertTrue(fileGenerator.isValid());
    }
}
