package com.company;

public class Flat extends Person implements Liveable, PayingUtilities {

    public Flat() {
    }

    @Override
    void getResident() {
        System.out.println(getResidents() + " residents are living in this beautiful flat.");
    }

    public Flat(int residents) {
        super(residents);
    }

    @Override
    public void getAddress() {
        System.out.println("Address of the flat is 4445 Hodges Dairy Road Yanceyville, North Carolina State, 27379, USA.");
    }

}
