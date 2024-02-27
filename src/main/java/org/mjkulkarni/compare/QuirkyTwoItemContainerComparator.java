package org.mjkulkarni.compare;

import org.mjkulkarni.container.TwoItemContainer;

import java.util.Optional;

public interface QuirkyTwoItemContainerComparator<T> {

    Optional<T> compare(TwoItemContainer<T> twoItemContainer) throws RuntimeException;

}