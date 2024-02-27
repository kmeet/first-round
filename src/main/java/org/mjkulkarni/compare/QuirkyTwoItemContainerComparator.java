package org.mjkulkarni.compare;

import org.mjkulkarni.container.TwoItemContainer;

import java.util.Optional;

/**
 * A comparator that takes a single argument - an object which will contain two children
 * that need to be compared.
 * */
public interface QuirkyTwoItemContainerComparator<T> {

    Optional<T> compare(TwoItemContainer<T> twoItemContainer) throws RuntimeException;

}