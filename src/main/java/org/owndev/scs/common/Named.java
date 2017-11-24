package org.owndev.scs.common;

public abstract class Named extends Identifiable {

    protected String name;

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

}
