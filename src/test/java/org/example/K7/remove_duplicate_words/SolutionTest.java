package org.example.K7.remove_duplicate_words;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals("alpha beta gamma delta", Solution.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", Solution.removeDuplicateWords("my cat is my cat fat"));
    }
}