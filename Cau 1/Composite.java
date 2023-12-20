package org.example;

import java.util.List;
import java.util.Collections;

public class Composite {
    void print();

    boolean isGroup();

    boolean isMarried();

    void addChild(Composite child);

    List<Person> getChildren();
}
