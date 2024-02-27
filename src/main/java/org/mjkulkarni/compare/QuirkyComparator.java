package org.mjkulkarni.compare;

import java.util.Optional;

/**
 * Implement a simple Comparator class that takes two arguments and returns an Optional.
 * Using an Optional allows us to safely return a null value.
 * */
public interface QuirkyComparator<T> {

    Optional<T> compare(T first, T second) throws RuntimeException;

}