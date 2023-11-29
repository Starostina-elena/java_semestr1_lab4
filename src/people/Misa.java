package people;

import abstractClasses.Person;

public class Misa extends Person {

    public Misa(String name, String action) {
        super(name, action);
    }

    public String sing() {
        return this.getName() + " громко поет";
    }

    @Override
    public String toString() {
        return super.toString() + ", взмахивая пушистым хвостом";
    }
}
