package org.example;

public class MarriedCP {
    private final Person husband;
    private final Person wife;

    /**bb*/
    public MarriedCP(Person husband, Person wife) {
        this.husband = husband;
        this.wife = wife;
    }

    /**bb*/
    public Person getHusband() {
        return husband;
    }

    /**bb*/
    public Person getWife() {
        return wife;
    }

    /**bb*/
    @Override
    public String toString() {
        return String.format("%s - %s", husband.getName(), wife.getName());
    }
}
