package objects;

import abstractClasses.Handcrafts;
import interfaces.Spoilable;

import java.util.Objects;

public class Textile extends Handcrafts {

    public Textile(String material) {
        super(material);
    }

    public String spoil() {
        return "Если ткань долго пролежит на мокром полу, она начнет гнить";
    }

    @Override
    public String toString() {
        return desription + " из материала " + this.getMaterial() + " грустно лежит на полу";
    }

}
