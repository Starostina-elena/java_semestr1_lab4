import exceptions.DestinationException;
import interfaces.Spoilable;
import objects.*;
import people.*;

public class Main {

    public static void main(String[] args) {

        class Floor {

            Spoilable[] floor_contains = new Spoilable[4];
            private int cur_index = 0;

            void add_trash(Spoilable obj) {
                floor_contains[cur_index] = obj;
                cur_index++;
            }

            void print_trash() {
                for (int i = 0; i < cur_index; i++) {
                    System.out.println(floor_contains[i]);
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
        PreviousOwners.Jam new_jam = new PreviousOwners.Jam("лимонный");
        System.out.println(new_jam.smell());

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


        Textile paper_trash = new Textile("ткань");
        System.out.println(paper_trash);
        System.out.println(paper_trash.spoil());
        Paper textile_trash = new Paper("бумага");
        System.out.println(textile_trash);
        System.out.println(textile_trash.spoil());
        Wood wooden_trash = new Wood("дерево");
        System.out.println(wooden_trash);
        System.out.println(wooden_trash.spoil());

        Floor floor = new Floor();
        floor.add_trash(paper_trash);
        floor.add_trash(textile_trash);
        floor.add_trash(wooden_trash);
        floor.add_trash(new Spoilable() {
            @Override
            public String spoil() {
                return "безымянная вещь из анонимного класса портится";
            }

            @Override
            public String toString() {
                return "Безымянная вещь из анонимного класса грустно лежит на полу";
            }
        });
        floor.print_trash();

        misa.behave_as_somebody_else(homsa);
        System.out.println(misa);
        System.out.println(misa.equals(homsa));
        misa.calm_down();
        System.out.println(misa);
        System.out.println(misa.equals(homsa));

    }

}
