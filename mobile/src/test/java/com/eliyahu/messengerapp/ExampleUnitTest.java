package com.eliyahu.messengerapp;

import android.support.annotation.NonNull;

import org.junit.Test;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void getMessage() throws Exception {
        List<List<Object>> messages = null;
        List<Object> message = null;
        message.add(1);
        message.add("hello");
        message.add(3);
        messages.add(message);
        message = null;
        message.add(1);
        message.add("hi bob");
        message.add(2);
        messages.add(message);
        assertEquals("hello", messages.get(0).get(2));
        assertNotEquals("hello", messages.get(1).get(2));
    }
}