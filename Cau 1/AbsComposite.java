package org.example;

import java.util.Collections;
import java.util.List;

public class AbsComposite implements Composite {
    /**aa*/
    @Override
    public boolean isGroup() {
        return false;
    }

    /**aa*/
    @Override
    public boolean isMarried() {
        return false;
    }

    /**aa*/
    @Override
    public void addChild(Composite child) {
        throw new UnsupportedOperationException("Operation not supported for this type");
    }

    /**aa*/
    @Override
    public List<Person> getChildren() {
        return Collections.emptyList();
    }
}
