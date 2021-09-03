package com.marker_interface;

public class Person implements Cloneable,Disposable {
    private int id;
    private String name;

    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
