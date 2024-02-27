package org.mjkulkarni.container;

/**
 * Interface for implementing a container object with only two items.
 * Likely over-engineered.
 *
 * @see org.mjkulkarni.container.impl.StringCompare
 * */
public interface TwoItemContainer<T> {

    T getFirst();
    void setFirst(T t);

    T getSecond();
    void setSecond(T t);
}