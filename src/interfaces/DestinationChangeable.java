package interfaces;

import exceptions.DestinationException;

public interface DestinationChangeable {

    void changeDestination(String newDestination) throws DestinationException;

    String toString();
    boolean equals(Object o);
    int hashCode();

}
