package org.mjkulkarni.container.impl;

import org.mjkulkarni.container.TwoItemContainer;

/**
 * An enhanced StringCompare class from the original screening question.
 * Name does not suit/match design, but has been left unchanged to allow
 * for easier reference (hopefully).
 * */
public class StringCompare implements TwoItemContainer<String> {
    private String first, second;

    public StringCompare(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String getFirst() {
        return first;
    }

    @Override
    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String getSecond() {
        return second;
    }

    @Override
    public void setSecond(String second) {
        this.second = second;
    }
}