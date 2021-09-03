package com.marker_interface;

public class Manager {
    public boolean dispose(Object object){
        if(!(object instanceof Disposable)){
            return false;
        }

        //disposing..
        System.out.println("Dispose occurred");
        return true;
    }
}
