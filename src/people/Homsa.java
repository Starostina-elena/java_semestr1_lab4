package people;

import abstractClasses.Person;
import exceptions.HomsaZeroCookiesException;

public class Homsa extends Person {

    private int numberOfCookies;

    public Homsa(String name, String action, int numberOfCookies) {
        super(name, action);
        this.numberOfCookies = numberOfCookies;
    }

    public String eatCookies() throws HomsaZeroCookiesException {
        if (numberOfCookies > 0) {
            numberOfCookies--;
            return this.getName() + " съедает печенье, осталось " + numberOfCookies;
        } else {
            throw new HomsaZeroCookiesException("печенье закончилось :(");
        }
    }

    public String addCookies(int numberOfCookies) {
        this.numberOfCookies += numberOfCookies;
        return "Теперь у " + this.getName() + " " + numberOfCookies + " печенья";
    }

    @Override
    public String toString() {
        return super.toString() + ", должно быть, это очень выматывает";
    }
}
