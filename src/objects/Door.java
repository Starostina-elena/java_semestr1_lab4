package objects;


import exceptions.DestinationException;
import interfaces.DestinationChangeable;

import java.util.Objects;


public class Door implements DestinationChangeable {

    private DestinationEnum destination;

    public Door(String destination) throws DestinationException {
        if (Objects.equals(destination, "никуда")) {
            this.destination = DestinationEnum.NOWHERE;
        }
        else if (Objects.equals(destination, "вверх") || Objects.equals(destination, "вниз")) {
            throw new DestinationException("направления вверх и вниз не должны быть использованы для дверей");
        }
        else {
            this.destination = DestinationEnum.SOMEWHERE;
        }
    }

    public void changeDestination(String new_destination) throws DestinationException {
        if (Objects.equals(new_destination, "никуда")) {
            this.destination = DestinationEnum.NOWHERE;
        }
        else if (Objects.equals(new_destination, "вверх") || Objects.equals(new_destination, "вниз")) {
            throw new DestinationException("направления вверх и вниз не должны быть использованы для дверей");
        }
        else {
            this.destination = DestinationEnum.SOMEWHERE;
        }
    }

    @Override
    public String toString() {
        if (destination == DestinationEnum.SOMEWHERE) {
            return "Все в порядке, дверь ведет куда-то, Хомса может быть спокоен";
        }
        return "О нет, дверь ведет в никуда";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return destination == door.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination);
    }

}
