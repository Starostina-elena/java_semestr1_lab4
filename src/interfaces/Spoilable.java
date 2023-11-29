package interfaces;

public interface Spoilable {

    public static final String desription = "Вещь, надоевшая их прежним хозяевам";

    String spoil();

    String toString();
    boolean equals(Object o);
    int hashCode();

}
