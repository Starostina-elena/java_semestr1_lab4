package objects;

import abstractClasses.Handcrafts;

public class Paper extends Handcrafts {

    public Paper(String material) {
        super(material);
    }

    public String spoil() {
        return "Поделки из бумаги медленно покрываются пылью";
    }

    @Override
    public String toString() {
        return desription + " из материала " + this.getMaterial() + " грустно лежит на столе";
    }

}
