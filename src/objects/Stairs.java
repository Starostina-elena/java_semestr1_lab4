package objects;


import exceptions.DestinationException;
import interfaces.DestinationChangeable;

import java.util.Objects;


public class Stairs implements DestinationChangeable {

    private DestinationEnum destination;

    public Stairs(String destination) throws DestinationException {
        if (Objects.equals(destination, "вверх")) {
            this.destination = DestinationEnum.UP;
        }
        else if (Objects.equals(destination, "вниз")) {
            this.destination = DestinationEnum.DOWN;
        }
        else {
            throw new DestinationException("для лестниц могут быть использованы только направления вверх и вниз");
        }
    }

    public void changeDestination(String newDestination) throws DestinationException {
        if (Objects.equals(newDestination, "вверх")) {
            this.destination = DestinationEnum.UP;
        }
        else if (Objects.equals(newDestination, "вниз")) {
            this.destination = DestinationEnum.DOWN;
        }
        else {
            throw new DestinationException("для лестниц могут быть использованы только направления вверх и вниз");
        }
    }

    @Override
    public String toString() {
        if (destination == DestinationEnum.UP) {
            return "Лестница поднимается наверх, нет причин волноваться";
        }
        return "Хомса недоволен, лестница идет вниз. " +
                "Но это так странно, ведь всякая лестница одновременно поднимается вверх и спускается вниз?";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stairs stairs = (Stairs) o;
        return destination == stairs.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination);
    }

}
