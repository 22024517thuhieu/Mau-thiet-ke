package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person extends AbsComposite {
    private String name;
    private BOD birthOfDate;
    private Gender gender;
    private List<Person> children;

    /**bb.*/
    public Person(String name, BOD birthOfDate, Gender gender) {
        this.name = name;
        this.birthOfDate = birthOfDate;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    /**bb*/
    public String getName() {
        return name;
    }

    /**bb*/
    public void setName(String name) {
        this.name = name;
    }

    /**bb*/
    public BOD getBirthDate() {
        return birthOfDate;
    }

    /**bb*/
    public void setBirthDate(BOD birthDate) {
        this.birthOfDate = birthOfDate;
    }

    /**bb*/
    public Gender getGender() {
        return gender;
    }

    /**bb*/
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**bb*/
    public List<Person> getChildren() {
        return children;
    }

    /**bb*/
    public void addChild(Person child) {
        this.children.add(child);
    }

    /**bb*/
    @Override
    public void print() {
        System.out.println(this.name);
        for (Person child : this.children) {
            child.print();
        }
    }

    /**bb*/
    public List<Person> findUnmarriedPerson() {
        List<Person> unmarriedPerson = new ArrayList<>();
        for (Person person : this.children) {
            if (!person.isMarried()) {
                unmarriedPerson.add(person);
            }

            unmarriedPerson.addAll(person.findUnmarriedPerson());
        }

        return unmarriedPerson;
    }

    /**yaya.*/
    public List<MarriedCP> findCPHave2Children() {
        List<MarriedCP> CPHave2Children = new ArrayList<>();
        for (Person person : this.children) {
            if (person.getChildren().size() == 2) {
                MarriedCP couple1 = new MarriedCP(person, person.getChildren().get(0));
                CPHave2Children.add(couple1);
                MarriedCP couple2 = new MarriedCP(person, person.getChildren().get(1));
                CPHave2Children.add(couple2);
            } else if (!person.isGroup()) {
                CPHave2Children.addAll(person.findCPHave2Children());
            }
        }
        return CPHave2Children;
    }
}
