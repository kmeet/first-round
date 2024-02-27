package org.mjkulkarni.container;

public interface TwoItemContainer<T> {

    T getFirst();
    void setFirst(T t);

    T getSecond();
    void setSecond(T t);
}