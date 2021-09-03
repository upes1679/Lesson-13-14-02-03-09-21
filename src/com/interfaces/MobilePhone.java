package com.interfaces;

public class MobilePhone implements Telephone {
    private int phoneNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Turning on...");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Dialing to " + phoneNumber);
        } else {
            System.out.println("Can't ring power off!");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering phone call");
            isRinging = false;
        }
    }

    @Override
    public boolean call(int phoneNumber) {
        if (this.phoneNumber == phoneNumber && isOn) {
            isRinging=true;
            System.out.println("Ringing");
        }
        else{
            isRinging=false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden the default method");
    }

    @Override
    public void communicate() {
        this.call(99999);
        System.out.println("Communicating through desktop phone");
    }
}
