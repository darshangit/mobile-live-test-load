package com.dash.question3;

public class CollectionClass<T,U> {

    private T id;
    private U val;

    public CollectionClass(T id, U val) {
        this.id = id;
        this.val = val;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getVal() {
        return val;
    }

    public void setVal(U val) {
        this.val = val;
    }
}
