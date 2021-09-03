package com.interfaces;

public interface Telephone extends CommunicationDevice,HomeDevice {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean call(int phoneNumber);
    boolean isRinging();

    int a=5;

    static void staticMethod(){
        System.out.println("static method has been invoked");
    }

    default void defaultMethod(){
        System.out.println("Default method has been invoked");
    }
}
