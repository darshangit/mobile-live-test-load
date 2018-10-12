package com.dash.question4;

public class CollectionClass<T,U> {

    private String id;
    private int val;

    public CollectionClass(String id, int val) {
        this.id = id;
        this.val = val;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
