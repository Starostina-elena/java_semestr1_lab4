package abstractClasses;

import interfaces.Spoilable;

import java.util.Objects;

public abstract class Handcrafts implements Spoilable {

    private final String material;

    public Handcrafts(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Handcrafts that = (Handcrafts) o;
        return Objects.equals(material, that.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }

}
