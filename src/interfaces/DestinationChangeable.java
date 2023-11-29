package interfaces;

import exceptions.DestinationException;

public interface DestinationChangeable {

    void changeDestination(String new_destination) throws DestinationException;

    String toString();
    boolean equals(Object o);
    int hashCode();

}
