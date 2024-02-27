package org.mjkulkarni.compare.impl;

import org.mjkulkarni.compare.QuirkyComparator;
import org.mjkulkarni.compare.QuirkyTwoItemContainerComparator;
import org.mjkulkarni.container.TwoItemContainer;

import java.util.Optional;

public class StringUtil implements QuirkyComparator<String>, QuirkyTwoItemContainerComparator<String> {

    /**
     * From the {@link QuirkyComparator} interface which has a single method {@code Optional<T> compare(T first, T second) throws RuntimeException;}.
     * The actual implementation of the method can be further enhanced.
     * */
    @Override
    public Optional<String> compare(String first, String second) throws RuntimeException {
        if(first != null && second != null)
            return (first.length() + second.length()) > 10 ? Optional.empty() : Optional.of(second);
        else
            throw new RuntimeException("Invalid input");
    }

    /**
     * From the {@link QuirkyTwoItemContainerComparator} interface which has a single method {@code Optional<T> compare(TwoItemContainer<T> twoItemContainer) throws RuntimeException;}.
     * The original StringCompare class from the question must implement {@link TwoItemContainer} interface that has getters and setters for T first and T second.
     * */
    @Override
    public Optional<String> compare(TwoItemContainer<String> twoItemContainer) throws RuntimeException {

        if(twoItemContainer.getFirst() != null && twoItemContainer.getSecond() != null) {
            return twoItemContainer.getFirst().length() + twoItemContainer.getSecond().length() > 10 ? Optional.empty() : Optional.of(twoItemContainer.getSecond());
        }
        return Optional.empty();
    }
}