package objects;

import abstractClasses.Handcrafts;
import interfaces.Spoilable;

import java.util.Objects;

public class Wood extends Handcrafts {

    public Wood(String material) {
        super(material);
    }

    public String spoil() {
        return "Если дерево не покрыть лаком, через какое-то время оно рассохнется";
    }

    @Override
    public String toString() {
        return desription + " из материала " + this.getMaterial() + " грустно лежит на полке";
    }

}
