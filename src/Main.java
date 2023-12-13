import exceptions.DestinationException;
import interfaces.Spoilable;
import objects.*;
import people.*;



public class Main {

    public static void main(String[] args) {

        class Floor {

            Spoilable[] floorContains = new Spoilable[4];
            private int curIndex = 0;

            void addTrash(Spoilable obj) {
                floorContains[curIndex] = obj;
                curIndex++;
            }

            void printTrash() {
                for (int i = 0; i < curIndex; i++) {
                    System.out.println(floorContains[i]);
                }
            }

        }

        Hemyl hemyl = new Hemyl("Хемуль", "поет");
        System.out.println(hemyl);
        System.out.println(hemyl.wings.tremble());
        System.out.println(hemyl.fly());
        Homsa homsa = new Homsa("Хомса", "танцует", 10);
        System.out.println(homsa);
        System.out.println(homsa.eatCookies());
        System.out.println(homsa.addCookies(5));
        Misa misa = new Misa("Миса", "сеет хаос");
        System.out.println(misa);
        System.out.println(misa.sing());
        Mymla mymla = new Mymla("Мюмла", "подмигивает");
        System.out.println(mymla);
        System.out.println(mymla.grumble());
        PreviousOwners previousOwner = new PreviousOwners("Василий", "грустно вздыхает", "яблочный");
        System.out.println(previousOwner);
        System.out.println(previousOwner.packStuff());
        System.out.println(previousOwner.jam.smell());
        PreviousOwners.Jam newJam = new PreviousOwners.Jam("лимонный");
        System.out.println(newJam.smell());

        try {
            Door door1 = new Door("в Нарнию");
            System.out.println(door1);
        } catch (DestinationException e) {
            System.out.println(e);
        }
        try {
            Door door2 = new Door("никуда");
            System.out.println(door2);
            door2.changeDestination("в Саратов");
            System.out.println(door2);
            door2.changeDestination("вниз");
            System.out.println(door2);
        } catch (DestinationException e) {
            System.out.println(e);
        }
        try {
            Door door3 = new Door("вверх");
            System.out.println(door3);
        } catch (DestinationException e) {
            System.out.println(e);
        }


        try {
            Stairs stairs1 = new Stairs("вверх");
            System.out.println(stairs1);
            stairs1.changeDestination("в никуда");
            System.out.println(stairs1);
        } catch (DestinationException e) {
            System.out.println(e);
        }
        try {
            Stairs stairs2 = new Stairs("вниз");
            System.out.println(stairs2);
        } catch (DestinationException e) {
            System.out.println(e);
        }
        try {
            Stairs stairs3 = new Stairs("куда-то");
            System.out.println(stairs3);
        } catch (DestinationException e) {
            System.out.println(e);
        }


        Textile paperTrash = new Textile("ткань");
        System.out.println(paperTrash);
        System.out.println(paperTrash.spoil());
        Paper textileTrash = new Paper("бумага");
        System.out.println(textileTrash);
        System.out.println(textileTrash.spoil());
        Wood woodenTrash = new Wood("дерево");
        System.out.println(woodenTrash);
        System.out.println(woodenTrash.spoil());

        Floor floor = new Floor();
        floor.addTrash(paperTrash);
        floor.addTrash(textileTrash);
        floor.addTrash(woodenTrash);
        floor.addTrash(new Spoilable() {
            @Override
            public String spoil() {
                return "безымянная вещь из анонимного класса портится";
            }

            @Override
            public String toString() {
                return "Безымянная вещь из анонимного класса грустно лежит на полу";
            }
        });
        floor.printTrash();

        misa.behaveAsSomebodyElse(homsa);
        System.out.println(misa);
        System.out.println(misa.equals(homsa));
        misa.calmDown();
        System.out.println(misa);
        System.out.println(misa.equals(homsa));

    }

}
