package people;

import abstractClasses.Person;

import java.util.Objects;

public class PreviousOwners extends Person {

    public Jam jam;

    public PreviousOwners(String name, String action, String jam_taste) {
        super(name, action);
        jam = new Jam(jam_taste);
    }

    public static class Jam {

        String taste;
        public Jam(String taste) {
            this.taste = taste;
        }

        public String smell() {
            return "Чудесный " + taste + " джем, забытый предыдущими жильцами";
        }

        @Override
        public String toString() {
            return "Jam{" +
                    "taste='" + taste + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Jam jam = (Jam) o;
            return Objects.equals(taste, jam.taste);
        }

        @Override
        public int hashCode() {
            return Objects.hash(taste);
        }
    }

    public String packStuff() {
        return this.getName() + " пакует свои вещи и готовиться съезжать";
    }

    @Override
    public String toString() {
        return super.toString() + "!";
    }
}
