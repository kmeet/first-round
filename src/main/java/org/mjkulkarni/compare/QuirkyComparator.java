package org.mjkulkarni.compare;

import java.util.Optional;

public interface QuirkyComparator<T> {

    Optional<T> compare(T first, T second) throws RuntimeException;

}