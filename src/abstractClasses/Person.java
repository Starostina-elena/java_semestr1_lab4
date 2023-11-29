package abstractClasses;

import java.util.Objects;

public abstract class Person {

    private String personAction;
    private final String originalPersonAction;
    private final String name;
    boolean madness = false;

    public Person(String name, String action) {
        originalPersonAction = action;
        personAction = action;
        this.name = name;
    }

    public void behave_as_somebody_else(Person person) {
        personAction = person.personAction;
        madness = true;
    };

    public void calm_down() {
        personAction = originalPersonAction;
        madness = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (madness) {
            return name + " бесится и " + personAction;
        }
        return name + " " + personAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return madness == person.madness && Objects.equals(personAction, person.personAction) && Objects.equals(originalPersonAction, person.originalPersonAction) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personAction, originalPersonAction, name, madness);
    }

}
