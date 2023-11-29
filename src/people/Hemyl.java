package people;

import abstractClasses.Person;

public class Hemyl extends Person {

    public Wings wings;

    public Hemyl(String name, String action) {
        super(name, action);
        wings = new Wings();
    }

    public String fly() {
        return this.getName() + " расправляет крылья и взлетает";
    }

    public class Wings {
        public String tremble() {
            return Hemyl.this.getName() + " шевелит крыльями";
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "?";
    }
}
