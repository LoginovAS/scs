package org.owndev.scs.common;

public abstract class Identifiable {

    protected long id;

    public abstract long getId();

    public void setId(long id){
        this.id = id;
    }

}
