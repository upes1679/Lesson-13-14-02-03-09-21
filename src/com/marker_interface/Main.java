package com.marker_interface;

import java.io.Serializable;
import java.rmi.Remote;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person(1,"Mark");
        Person person2=(Person)person.clone();
        System.out.println(person.getId()+" "+person.getName());
        System.out.println(person2.getId()+" "+person2.getName());

        Manager manager=new Manager();
        boolean b= manager.dispose(person);
        System.out.println(b);

        Animal animal=new Animal(2,"Animal");
        boolean b2=manager.dispose(animal);
        System.out.println(b2);
    }
}
